#! /usr/bin/bash

# 현재 날짜 및 계산을 위한 기본 변수 설정
TODAY=$(date +%Y-%m-%d)                             # 오늘 날짜 (YYYY-MM-DD 형식)
YESTERDAY=$(date -d "yesterday" +%Y-%m-%d)          # 어제 날짜
SEVEN_DAYS_AGO=$(date -d "7 days ago" +%Y-%m-%d)    # 일주일 전 날짜
THIRTY_DAYS_AGO=$(date -d "30 days ago" +%Y-%m-%d)  # 한 달 전 날짜

# 각 기간에 생성된 Java 파일 개수 확인
DAILY_JAVA_COUNT=$(find . -type f -name "*.java" -newermt "${YESTERDAY}" ! -newermt "${TODAY}" | wc -l)
WEEKLY_JAVA_COUNT=$(find . -type f -name "*.java" -newermt "${SEVEN_DAYS_AGO}" ! -newermt "${TODAY}" | wc -l)
MONTHLY_JAVA_COUNT=$(find . -type f -name "*.java" -newermt "${THIRTY_DAYS_AGO}" ! -newermt "${TODAY}" | wc -l)
#CURRENT_DIR=$(pwd)

# 결과 출력
echo -e "\e[31m+====================================================+";
echo -e "\e[32mJava Files Created Yesterday: ${DAILY_JAVA_COUNT}"
echo -e "\e[32mJava Files Created Last 7 Days: ${WEEKLY_JAVA_COUNT}"
echo -e "\e[32mJava Files Created Last 30 Days: ${MONTHLY_JAVA_COUNT}"
echo -e "\e[31m+====================================================+";

# GitHub Actions 의 GITHUB_OUTPUT 파일에 값을 기록
echo "DAILY_JAVA_COUNT=${DAILY_JAVA_COUNT}" | tee -a "${GITHUB_OUTPUT}" 2> /dev/null
echo "WEEKLY_JAVA_COUNT=${WEEKLY_JAVA_COUNT}" | tee -a "${GITHUB_OUTPUT}" 2> /dev/null
echo "MONTHLY_JAVA_COUNT=${MONTHLY_JAVA_COUNT}" | tee -a "${GITHUB_OUTPUT}" 2> /dev/null
#echo "CURRENT_DIR=${CURRENT_DIR}" | tea -a "${GITHUB_OUTPUT}" 2> /dev/null

