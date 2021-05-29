package Ch04;

public class RelationalOp {
    public static void main(String[] args) {
        System.out.println("3 >= 2 : " + (3 >= 2));
        System.out.println("3 <= 2 : " + (3 <= 2));
        System.out.println("7.0 == 7 : " + (7.0 == 7)); // 7.0 과 7은 다르지만 자동 형변환에 의해서 정수 7은 실수 7.0 으로 형변환 되게 된다.
        System.out.println("7.0 != 7 : " + (7.0 != 7));
    }
}
