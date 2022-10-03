# 미션 - 숫자 야구 게임

---
## 프로그래밍 요구사항
- JDK 8 버전에서 실행가능
- JDK  제공하는 대신 camp.nextstep.edu.missionutils API 이용 
  - Random 값 : camp.nextstep.edu.mssionutils.Random.pickNumberInRange()
  - 사용자 입력 값 : camp.nextstep.edu.missionutils.Console.readLine()
- 테스트 통과하도록 구현
- 자바 코드 컨벤션 
- indent 까지만 허용
- 람다는 사용가능
- 자바 8 stream API 사용 불가능
- else 예약어 사용 불가능 
- 함수의 길이 10라인 넘어가지 않도록 구현
- 단위테스트 구현
  - mvc 패턴 기반으로 구현 후, Model에 대한 단위 테스트를 추가하는것에 집중

---
## 구현 할 기능
1. 컴퓨터 난수 생성
   - 0 이 아닌 1 부터 9까지 정수를 중복없이 3개의 수를 생성
2. 사용자 숫자 입력 받기
    - 1 부터 9까지 정수를 입력 
    - 3자리만 입력받도록 입력 길이 체크
    - 사용자 잘못된 값 입력 시 IllegalArgumentException 발생, 어플리케이션 종료
3. 컴퓨터와 사용자의 수를 비교하여 판정
    - 인덱스와 값이 모두 일치 할 경우 : 스트라이크 판정 
    - 인덱스가 다르지만 값이 일치할 경우 : 볼 판정
    - 인덱스와 값이 모두 불일치 할 경우 : 낫싱 판정
    - 판정 결과 출력
4. 게임 종료 
    - 컴퓨터가 생성한 난수를 사용자가 모두 맞히는 경우
    - 사용자가 게임 종료 / 다시 시작 선택 가능

---
##  Commit log message
참고 URL: ``https://gist.github.com/stephenparish/9941e89d80e2bc58a153``
- [docs] : 문서화
- [feat] : 기능 구현
- [test] : 테스트 구현
- [refactor] : 리팩토링
- [fix] : 오류(버그) 수정
- [style] : 코드 컨벤션 수정
- [build] : 의존성 추가


