# Stream

JDK 8에서 추가된 Stream API에 대해서 알아보자.(파일 I/O에서 사용되는 스트림과는 다르다.)
스트림은 데이터소스를 추상화하고, 데이터를 다루는데 자주 사용되는 메서들을 정의해 놓았다. 
데이터소스를 추상화하였다는 것은, 데이터 소스가 무엇이든 같은 방식으로 다룰 수 있게 되었다는 것과 코드의 재사용성이 높아진다는 것을 의미한다.

## 특징

스트림은 데이터 소스를 변경하지 않는다.
> 스트림은 데이터 소스로 부터 데이터를 읽기만할 뿐, 데이터 소스를 변경하지 않는다. 
필요하다면, 정렬된 결과를 컬렉션이나 배열에 담아서 반환할 수 있다.

스트림은 일회용이다.
> 스트림은 Iterator처럼 일회용이다. 
Iterator로 컬렉션의 요소를 모두 읽고 나면 다시 사용할 수 없는 것처럼, 스트림도 한번 사용하면 닫혀서 다시 사용할 수 없다. 
필요하다면 스트림을 다시 생성해야한다.

스트림은 작업을 내부 반복으로 처리한다.
> 스트림을 이용한 작업이 간결할 수 있는 비결중의 하나가 바로 '내부 반복'이다. 
내부 반복이라는 것은 반복문을 메서드의 내부에 숨길 수 있다는 것을 의미한다.









test git
// add branch and test 