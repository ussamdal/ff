## Overview

패스트포워드 백엔드 엔지니어 포지션 과제를 위한 프로젝트

## Requirement

삼성전자 주식의 (오늘포함)과거 5일치 데이터를 저장 후 출력하는 api를 개발.

#### API

* 스크랩

#### 기능

* Java, Spring Boot, JPA, H2, Gradle 활용
* 개발언어 및 프레임워크 : java(또는 kotlin) + springboot
* 빌드환경 : gradle
* 단위 테스트코드 : junit - 적용하지 못함
* API문서 자동화 도구 : swagger 사용
* Jib플러그인 코드를 사용하여 도커이미지 빌드추가시 가산점 - 적용하지 못함
* 제출방식 : 본인 github계정에 push 후 url을 전달

---

## 요구사항 구현 여부

- [x] java(또는 kotlin) + springboot
- [x] 빌드환경 : gradle
- [ ] 단위 테스트코드 : junit
- [x] API문서 자동화 도구 :  swagger 사용
- [ ] Jib플러그인 코드를 사용하여 도커이미지 빌드추가시 가산점
- [x] 제출방식 : 본인 github계정에 push 후 url을 전달

## 구현 방법

* 과제 스펙에 적혀있는 기술들을 모두 사용하여 필요한 기능 구현
* feign을 이용해 제공된 야후 url 서버와 연동
    * **_feign 예외처리 누락되었음_**
* DDD 기반 패키지 컨벤션 사용

## 검증 결과

* 정상 케이스에 한해선 HttpRequest를 이용해 모두 확인(테스트 클래스도 확인)

## 소감

개인 리소스 관리를 제대로 하지 못해 과제에 시간 배분을 잘못하였고 좀 더 완벽하게 작성하고싶었으나 그렇게 하지 못했습니다. 단위 테스트 코드를 작성하지 못하였으며 jib 적용이 부족하였습니다. 저장 후 출력이라는
부분에서 모호한 부분이 있었으며 저장 로직에 대해서 scrap을 할때같은 날짜가 들어가는 경우에 대해서 예외처리가 부족합니다.

최근 환경 설정부터 진행을 하는 개발을 하는 경우가 적었는데 과제 작성하면서 swagger, feign 적용 및 헥사고날 구조를 적용하면서 잊었던 부분은 다시 찾아보고 사용하지 않았던 기능들을 사용하면서 좋은 경험을
하게 되었습니다.

귀한 시간 내주셔서 제 코드를 리뷰해주셔서 감사하고, 제 시간이 귀한만큼 다른 분들의 시간도 귀한데 부족한(단위테스트) 코드를 제출하게 되어 죄송합니다.



---

## Usage

#### gradle

```bash
$ ./gradlew bootRun
```

## API Document

애플리케이션 실행 후 http://lcalhost:8080/swagger.html 접속

## Test

* 위의 [스웨거](http://lcalhost:8080/api.html) 화면에서 직접 전문 테스트 가능
* 프로젝트 루트 디렉토리 하위 http 디렉토리 내에 HttpRequest로도 테스트 가능

---
