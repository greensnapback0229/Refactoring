# Null 객체 도입(introducing NULL object)

- 아무것도 처리하지 않는 null 객체를 도입하여 '이 변수는 현재 `null`인가'라는 확인을 제거함

| 이름 | 널 객체 도입                                                                                                                                                                                                                                                                                                                                                                                             | 
|----|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|상황| 객체를 다룸                                                                                                                                                                                                                                                                                                                                                                                              |
|문제| null 확인이 너무 많음                                                                                                                                                                                                                                                                                                                                                                                      |
|해법| null 을 나타내는 특별한 객체를 도입해 '아무것도 안 함'이라는 처리를 함                                                                                                                                                                                                                                                                                                                                                         |
|결과| o null 확인이 줄어듬<br/>x null 객체만큼 클래스가 늘어남                                                                                                                                                                                                                                                                                                                                                             |
|방법| **1. 널 객체 클래스 생성** <br/>(1) 널 객체 클래스 생성 <br/> - 기존 클래스의 하위 클래스로 작성 <br/>(2) isNull메소드 작성<br/> - 기존 클래슨느 false반환<br/> - null 객체 클래스는 true 반환 <br/>(3) 컴파일<br/>**2. null 치환하기**<br/>(1)null을 null객체로 지환<br/>(2)null 확인을 isNull메서드 호출로 치환<br/>(3) 컴파일해서 테스트<br/> **3. 널객체 클래스를 재정의해서 조건 판단 삭제하기** <br/>(1)isNull 메서드를 사용하는 조건 판단 삭제하기<br/>널 객체 클래스르 재정의해서 조건 판단 삭제하기<br/>(3)조건 판단 삭제<br/>(4) 컴파일해서 테스트 |
|관련항목| 어서션 도입, 잘못해서 null을 사용하고 있진 않은지 확인하기 위한 어서션을 도입하면 좋음 <br/>널 객체 패턴<br/>싱글톤 패턴<br/>팩토리 메서드 확인                                                                                                                                                                                                                                                                                                          |
