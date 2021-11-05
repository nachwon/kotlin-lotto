# kotlin-lotto

## 문자열 덧셈 계산기

### 요구 사항 정의
- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.


- [x] 쉼표(,)로 구분된 숫자들의 합을 반환한다.
- [x] 콜론(:)으로 구분된 숫자들의 합을 반환한다.
- [x] 쉼표와 콜론의 조합으로 구분된 숫자들의 합을 반환한다.
- [x] 커스텀 구분자로 구분된 숫자들의 합을 반환한다.
- [x] 하나의 숫자를 입력하면 그대로 반환한다.
- [x] 빈 문자열 또는 null을 입력하면 0을 반환한다.
- [x] 숫자 이외의 값을 전달하면 RuntimeException 예외를 throw 한다.
- [x] 음수를 전달하면 RuntimeException 예외를 throw 한다.


## 로또(자동)

### 요구 사항 정의

#### Won(Money)
- [x] 금액을 받아 단위와 함께 표시할 수 있다.
- [x] 대소 비교를 할 수 있다.
- [x] 나눗셈을 할 수 있다.


#### Lotto
- [x] 잘못된 개수의 번호로 로또 생성 시 에러를 일으킨다.
- [x] 중복된 번호로 로또 생성 시 에러를 일으킨다.
- [x] 당첨번호를 입력하면 일치하는 번호 개수를 리턴한다.


#### LottoPrize
- [x] 일치된 번호 개수로 LottoPrize 를 가져올 수 있다.
