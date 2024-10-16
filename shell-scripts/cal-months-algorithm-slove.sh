#!/bin/bash

# 오늘 날짜를 가져옵니다.
TODAY=$(date +%Y-%m-%d)

# 사용자가 몇 개월 전부터 확인할지 입력받습니다.
MONTHS_AGO=$1

# 개월 수만큼 과거의 날짜를 계산합니다.
PAST_DATE=$(date -d "$TODAY -${MONTHS_AGO} months" +%Y-%m-%d)

# 현재 디렉토리에서 .java 파일 중에서 과거부터 현재까지 생성된 파일 개수를 셉니다.
JAVA_FILE_COUNT=$(find src -type f -name "*.java" -newermt "${PAST_DATE}" ! -newermt "${TODAY}" | wc -l)

# 결과 출력
echo "${MONTHS_AGO}개월 전부터 지금까지 생성된 자바 파일 수: ${JAVA_FILE_COUNT}개"

# GitHub Actions 에서 사용할 환경 변수 파일에 기록
echo "MONTH_AGO=$MONTHS_AGO" >> $GITHUB_ENV
echo "JAVA_FILE_COUNT=$JAVA_FILE_COUNT" >> $GITHUB_ENV