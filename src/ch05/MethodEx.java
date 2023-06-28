package ch05;

// 클래스 객체를 생성하고 매서드를 실행

public class MethodEx {
    public static void main(String[] args) {
//        // Utills 클래스 객체를 생성하고 매서드를 실행
//        Utils util = new Utils();
//
//        // 매서드 호출(call)
//        int a = 10;
//        int b = 5;
//
//        // 결과값 변수명(result)
//        int result = util.sum(a, b);
//        int result2 = util.sum(3, 5);
//
//
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int resultSum = util.sumArr(arr);
//        System.out.println(resultSum);

        Utils student1 = new Utils("최민지", 29, "minji");
        student1.displayStudentDetails();

        student1.ageUp();
        student1.displayStudentDetails();


   }
}
