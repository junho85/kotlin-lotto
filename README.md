# kotlin-lotto

## Step1 기능요구사항
[x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
[x] 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
[x] 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

## Step2

### 기능 요구사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.

### 기능 목록
[x] 구입금액을 입력한다.
[x] 구입 금액에 해당하는 로또를 발급한다.
[x] 로또 1장의 가격은 1000원이다.
[x] 로또번호는 자동으로 생성된다.
[x] 로또 번호는 1~45번 까지이고 6개를 선택한다.
[x] 로또 번호는 중복되지 않는다.
[x] 로또 번호는 오름차순으로 정렬한다.
[x] 지난 주 당첨 번호를 입력받는다.
[x] 로또번호와 당첨번호의 일치 개수를 확인한다.
[x] 로또 일치 개수별 당첨금을 확인한다.
[x] 로또번호 일치 개수별 당첨된 로또 개수를 확인한다.
[x] 당첨 통계를 출력한다.
[] 수익률을 계산한다.