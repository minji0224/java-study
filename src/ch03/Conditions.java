package ch03;

public class Conditions {
    public static void main(String[] args) {
//        // 조건문(condition)
//        // 코드를 실행할지 말지를 결정하는데 사용한다.
//        // 프로그램의 로직(logic)을 제어하는 핵심적인 부분
//
//        // if문
//
//        // 조건식: true / false를 반환하는 식
//        // 조건식이 true이면 if 블룩({})안의 코드가 실행
//        // 조건식이 false면 바로 옆에 있는 중괄호를 건너 뛰고 다음으로 넘어감.
//
//        /*
//
//       1. if ( 조건식 ){
//       2. 식이 true일 때 실행할 구문
//       3. }
//
//         */
//
//
//
//
//
////        int age = 16;
////        if(age >= 18) {
////            System.out.println("성인입니다.");
////        }
////
////        System.out.println("프로그램이 종료되었습니다.");
//
//
//
//
//
//        // if-else문
//        // if문의 조건식이 true이면 if 블룩({})안의 코드가 실행
//        // if문의 조건식이 false이면 else 블룩({})안의 코드가 실행
//
//        int age = 16;
//
//        if(age >= 18) {
//            System.out.println("성인입니다.");
//        } else {
//            System.out.println("미성년자입니다.");
//            if(age >= 12) {
//                System.out.println("중/고등학생입니다.");
//            }
//        }


        // if-else = else if

        int age = 72;

        // 조건이 만족되는 가장 위의 블록만 실행!!
        if(age >= 60) {
            System.out.println("노인입니다.");
        } else if(age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }


        // else-if를 if-else만으로 변경
        //코드 깊이가 깊게 가지 않게
    }


}
