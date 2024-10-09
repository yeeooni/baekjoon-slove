<div align="center">

## 백준 알고리즘
![last-commit badge](https://img.shields.io/github/last-commit/yeeooni/baekjoon-slove?style=flat-square)

</div>

### ✏️작성 취지
- 알고리즘 해결과정 및 고충 정리
- 파일 이력관리 
- 빠른 디버깅, 실행 결과 도출
- 자료구조 공부 (Iterator, Map, Stream)
- 깔끔한 주석 템플릿 

### 💻구성
- Java JDK 8 ( corretto 1.8 )
- Server IntelliJ Local Machine -> Edit Configuration -> Build and run modify options -> Redirect Input & save console to output file  
- Gitkraken
- ~~Gradle~~
- ~~SpringBoot2.x.x~~
- ~~Swagger UI~~
- slack & Incoming WebHooks

### 🗂️폴더 구조
- **baekjoon**: 백준 알고리즘(root)
- **category**: 카테고리별 분류
 
> ex) baekjoon/category/$_1
>> baekjoon/array/$(prefix)_문제식별번호

- **algorithm**: 알고리즘(공부 정리)

### 👨‍💻구현 방식
1. 백준 알고리즘에서 제시한 입력 데이터를 input.txt 입력
2. 코딩
3. 올바른 값이 output.txt 출력되었는지 확인

### ⚠️주의사항
- 문제를 대충 보지 않는다.
- **입출력**을 정확하게 이해한다.
- 어떻게 **구현**해야 할지 생각한다.
- **오탈자**를 확인한다.
- 예외를 처리한다.
- **디버깅**을 한다.

- **반례**를 스스로 찾아낼 수 있어야한다.
- 한 문제에 **많은 시간**을 할애하지 않는다.
- 다양한 접근방식을 생각한다. 너무 깊게도 얇게도 생각하지 않는다. 예상외에 답이 나올 수 있는 방법이 있다.

### 📋추가 예정
- [X] ~~AWS EC2 인스턴스를 이용하여 Docker-compose 설치~~
- [X] ~~Docker 컨테이너를 이용하고 App을 외부에서 접근이 가능하도록 구현~~
- [ ] 알고리즘 풀이 주간, 월간 통계・결산하여 알림 서비스