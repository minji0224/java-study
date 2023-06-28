package ch05.overloading;

public class Operator {


    // 매서드 오버로딩(method overloading)
    // 매서드 이름은 동일하지만
    // 매개변수의 개수 / 타입이 다른 경우
    // 반환 타입(X), 접근제한타(X) // 메서드 이름 + 매개변수(개수, 타입 / 변수명X) 이것이 동일하면 동일하다고 판단함

    // 매서드 시그니처(method signature)
    // 어떤 매서드의 유일함을 나타내는 껍데기(프로토타입, 선언부)
    // 메서드 이름 + 매개변수(개수, 타입 / 변수명X) 이것이 동일하면 동일하다고 판단함

    // 정수값 2개 받고 곱하기
    public int multiply(int x, int y) {
        System.out.println("(int, int)");
        return  x * y;
    }


    // 실수값 2개 받고 곱하기
    public double multiply(double x, double y) {
        System.out.println("(double, double)");
        return  x * y;
    }


    public double multiply(double x, double y, int z) {
        System.out.println("(double, double) * int");
        return (int) (x * y) * z;
    }


    public int multiply(int [] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int mulResult = 1;
        for(int num : nums) {
            mulResult *= num;
        }
        return mulResult;
    }



//    오류인 경우


//    리턴 타입을 (손실값이 있더라도) 억지로 바꾸면 안됨 (반환 타입X)
//    메서드 이름 + 매개변수(개수, 타입 / 변수명X) 이것이 동일하면 동일하다고 판단함
//    public int multiply(double x, double y) {
//        System.out.println("(double, double)");
//        return (int) x * y;
//    }
}
