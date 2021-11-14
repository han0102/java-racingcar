# 자동차 경주 게임
## 기능 목록
- [v] 자동차 대수를 입력 받는다.
- [v] 시도할 회수를 입력 받는다.
    - 범위는 0 보다 큰 정수
    - 마이너스 값은 입력 받을 수 없다.
- [v] 자동차는 전진 혹은 멈출 수 있다
    - 전진하는 조건은, random 값이 4 이상일 경우다.
    - random 값이 4 미만이면, 해당 자동차는 전진하지 않는다.
    - 자동차는 매 턴마다 랜덤하는 값을 갖는다.
- [v] 자동차 대수, 시도할 횟수를 모두 입력 받으면, 프로그램이 실행된다.
    - 시도할 횟수는 한 대당, 한 줄에 표현 된다.
    - 1회에 결과가 출력되면, 빈 줄로 구분 된다.
- [v] 자동차에 이름을 부여할 수 있다.
  - 처음 설명 문구 변경.
  - 이름 부여는 쉼표로 구분.
- [v] 전진하는 자동차 출력 시, 자동차 이름도 같이 출력된다
- [v] 자동차 경주 게임을 완료한 후, 누가 우승했는지 알려준다
  - 반드시 한명 이상의 우승자가 존재. 
- [v] 도메인 객체는 view 객체에 의존하지 않도록 한다.
- [v] 도메인 객체의 필요한 단위 테스트가 있으면 추가한다.