package Ch02;

public class VariableDeci {
    public static void main(String[] args) {
        double num1, num2; // 두 개의 변수 동시 선언
        double result;
        
        num1 = 1.0000001;
        num2 = 2.0000001;
        result = num1 + num2;
        System.out.println(result);
        // 실수 표현에 오차가 존재하기 때문에 기대하는 값 2.0000002 가 출력되지 않음
        
        // 대소문자를 구분한다
        // 숫자로 시작할 수 없다
        // $ _ 이외의 특수문자는 사용할 수 없다
        // 키워드는 이름으로 사용할 수 없다.
    }
}
