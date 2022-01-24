# 나만의 맛집 리스트 만들기
네이버 지역검색 API를 활용하여 맛집 리스트를 검색하고, 위시 리스트에 추가하는 나만의 맛집 리스트 사이트

## 개발환경
- Language : Java 11
- IDE : IntelliJ IDEA Community
- Framework : Spring Boot 2.6.3
- Build Tool : Gradle
- Database : Memory DB 구현
- Libraries : Lombok, Thymeleaf
- Open API : [네이버 지역검색 API](https://developers.naver.com/products/service-api/search/search.md#%EA%B2%80%EC%83%89)

## 구현한 기능
- 검색어를 입력하면 해당 단어가 포함된 맛집 리스트가 출력된다.
- 원하는 맛집을 나의 위시 리스트에 추가할 수 있다.
- 방문 추가 버튼을 이용해 방문을 기록할 수 있다.
- 위시 리스트에서 맛집을 삭제할 수 있다. 방문 기록은 초기화된다.

![image](https://user-images.githubusercontent.com/92259017/150812920-0e5c1823-0977-4e66-b3ae-1a8aba263713.png)
![image](https://user-images.githubusercontent.com/92259017/150812886-a0bae573-b2ce-426d-a3e2-a4ef3c3a26a5.png)
