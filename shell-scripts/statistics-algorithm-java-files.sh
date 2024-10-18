#! /usr/bin/bash

TODAY=$(date +%Y-%m-%d)
PERIODS=("yesterday" "7 days ago" "30 days ago")
LABELS=("Yesterday" "Last 7 Days" "Last 30 Days")
COUNTS=()

for i in "${!PERIODS[@]}"; do
START_DATE=$(date -d "${PERIODS[$i]}" +%s)  # 타임스탬프로 변환
END_DATE=$(date -d "${TODAY}" +%s)  # 타임스탬프로 변환
echo "Checking Java files created between $(date -d @"$START_DATE" +%Y-%m-%d) and $(date -d @"$END_DATE" +%Y-%m-%d):"

# *.java 파일 찾기
JAVA_FILES=$(find src -type f -name "*.java")

COUNT=0
for FILE in $JAVA_FILES; do
# 파일의 생성 시간을 가져옴 (초 단위로 반환됨)
CREATION_TIME=$(stat -c %W "$FILE")

# 생성 시간이 유효한지 확인 (-1은 유효하지 않은 생성 시간)
if [ "$CREATION_TIME" -ge 0 ] && [ "$CREATION_TIME" -ge "$START_DATE" ] && [ "$CREATION_TIME" -le "$END_DATE" ]; then
COUNT=$((COUNT+1))
fi
done

COUNTS+=($COUNT)
echo "${LABELS[$i]} Created Count: $COUNT"
done

DAILY_COUNT=${COUNTS[0]}
WEEKLY_COUNT=${COUNTS[1]}
MONTHLY_COUNT=${COUNTS[2]}

echo -e "\e[31m+==================COUNT===================+";
echo -e "\e[32mJava Files Created Yesterday: ${DAILY_COUNT}"
echo -e "\e[32mJava Files Created Last 7 Days: ${WEEKLY_COUNT}"
echo -e "\e[32mJava Files Created Last 30 Days: ${MONTHLY_COUNT}"
echo -e "\e[31m+==================COUNT===================+";

# GitHub Actions 의 GITHUB_OUTPUT 파일에 값을 기록
echo "DAILY_COUNT=${DAILY_COUNT}" | tee -a $GITHUB_ENV 2> /dev/null
echo "WEEKLY_COUNT=${WEEKLY_COUNT}" | tee -a $GITHUB_ENV 2> /dev/null
echo "MONTHLY_COUNT=${MONTHLY_COUNT}" | tee -a $GITHUB_ENV 2> /dev/null

