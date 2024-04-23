# 어서션 도입 (Assertion)

### 어셔션 (Assertion)
* 프로그램 수행 중 성립해야 할 조건을 기술하는 방법
* 프로그래머의 의도를 확실히 밝히면서도 실행 시 조건이 반드시 성립함을 보장하는 기법

예) value는 양수여야 한다. 
* assert value > 0
* 위 조건 실패시 `Java.lang.AssertionError` exception 발생


|     이름     | 어서션 도입                                                                                                                                                                     |
|:----------:|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|     상황     | 코드 속에 성립해야 할 조건이 있음                                                                                                                                                        |
|     문제     | 주석으로 '이런 조건이 성립한다 라고 적어도 프로그램 실행시 확인 불가능                                                                                                                                   | 
|     해법     | 어셔선 넣기                                                                                                                                                                     | 
|     결과     | o해당 부분에서 성립해야 할 조건이 명확해지고 소스 코드가 읽기 좋아짐 <br/> o 버그를 빨리 발견 가능함 </br>o 어서션을 활성화하면 어서션이 성립하는지 자동으로 확인 가능함 </br> o 어셔선을 비활성화하면 어서션이 무시되어 성능이 개선됨<br/>x 어서션을 지나치게 쓰면 오히려 읽기 어려워짐 |
|     방법     | 1. 어서션 도입 <br/> (1) 소스코드에서 '성립해야 할 조건'찾기<br/> (2) 조건을 포함한 어서션 작성 <br/> (3) 적혀있던 주석은 무의미하므로 주석 삭제 <br/> (4) 컴파일해서 테스트                                                       |
|     주의     | * 자바 컴파일러는 어서션을 무효화해도 어서션 부분 코드를 삭제하지 않음을 선택해야함 <br/> * 어서션 안에 부수 효과가 있는 코드를 작성하면 안됨 <br/> * 컴파일해서 테스트                                                                     |
|   관련 항목    | 메서드 추출 <br/> 어어션에 적힌 조건은 독립된 메서드로 추출할 가치가 있는 경우가 많음                                                                                                                        |

### 리팩토링
1. 소스코드에서 '성립해야 할 조건 찾기'
2. 조건을 포함한 어서션 작성
3. 적혀있던 주석은 무의미 하므로 삭제 
4. 컴파일해서 삭제

어서션은 에러처리를 대신할 수 없다
자바 어서션은 클래스 라이브러리가 아니다
어서션을 -da 옵션으로 비활성화 해도 어서션 바이트 코드는 클래스 파일에 남아있음