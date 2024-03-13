# 백준 알고리즘

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

### 👨‍💻구현방식
- 패키지마다 알고리즘 카테고리를 나눔
- 백준 알고리즘 사이트에서 제시한 입력 데이터를 input.txt에 작성 후 코딩
- 올바른 값이 output.txt에 저장되었는지 확인
- ~~Default Java Project -> Gradle -> SpringBoot2.x.x~~
- 외부에서 접근이 가능하도록 깔끔한 템플릿으로 구현할 계획이였지만, 여러가지 제약조건이 걸려 실패하였음
- 차선책으로 생각한 방법은 레드마인으로 화면을 제공하는 것. (물론, 아주 구닥다리 옛것이지만.)

### 📋추가예정
- [ ] ~~AWS EC2 인스턴스를 이용하여 Docker-compose 설치~~
- [ ] ~~Docker 컨테이너를 이용하고 App을 외부에서 접근이 가능하도록 구현~~
- [X] ~~build.gradle file added~~
- [X] ~~jar deploy~~
- [ ] ~~Swagger UI~~