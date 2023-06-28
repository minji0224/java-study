package ch03;

public class LoopEx {
    public static void main(String[] args) {
//        // 구구단 구하기 중첩 반복문
//        // 중첩(Nested)
//
//        for (int i = 2; i <= 9; i++) {
//            // 2 * 1, 2 * 2 ... 2 * 9
//            // 3 * 1, 3 * 2 ... 3 * 9
//            // ...
//            // 9 * 1 ...
//            for (int j = 2; j <= 9; j++) {
//                System.out.println(i * j);
//        }
//        System.out.println("--" + i + "단");
//    }

//        for ( int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }

//        for ( int i = 1; i <=100; i ++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//
//        for ( int i = 1; i <= 9; i++) {
//            System.out.println(" 5 x " + i + " = " + (5 * i));
//        }
//
//        for ( int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }

//        for ( int i = 0; i <= 100; i++) {
//            if ( i % 3 == 0 || i % 5 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        for ( int i = 10; i >= 0; i--) {
//            System.out.println(i);
//        }
//
//        int sum = 0;
//        for ( int i = 1; i <= 100; i++) {
//            if ( i % 5 == 0){
//                sum += i;
//            }
//        }
//        System.out.println("5의 배수의 합계는" + sum);
//
//        int sum1 = 0;
//        int sum2 = 0;
//        for ( int i = 1; i <= 100; i++) {
//            if ( i % 2 == 0){
//                sum1 += i;
//            } else {
//                sum2 += i;
//            }
//        }
//        System.out.println("짝수의 합계는 " + sum1);
//        System.out.println("홀수의 합계는 " + sum2);
//
//        for (int x = 1; x <= 6; x++){
//            for (int y = 1; y <=6; y++){
//                if (x + y == 6) {
//                    System.out.println(" " + x + " " + y);
//                }
//            }
//        }

        // 출력은 왼쪽에서 오른쪽
        // 위에서 아래
        // 피라미드 별표 문제
        // 띄어쓰기 네번 하고 별표(프린트엘엔쓰기)
        // 별표는 2n-1
        // 띄어쓰기는 5-n(n을 i로 바꿔)

        // 도트그래픽 2D(x, y축)
        // 행(가로, y) 상위개념/ 열(세로, x) 하위개념
        // 그러므로 반복문을 돌리려면, 가장 바깥 반복문이 행을 제어하는 반복문
        // 1번째 행 -> 1번째열, 2번째열..., 밑으로 내려가서
        // 2번째행 -> 1번째열, 2번째열..., 밑으로 내려감


        // 행 개수
        int n = 5;
        // i, j, k를 숫자로 넣어도 되지만 행을 변수로 저장하면 편함


        for ( int i = 1; i <= n; i++) {
            // i = 1, 첫번째행을 출력
            // i = 2, 두번째행을 출력


            // 빈 공간 출력
            // 5 - i(행번호)만큼 출력
            for ( int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            // 2*1(행번호) -1만큼 출력
            for (int k = 1; k <= 2*i - 1; k++) {
                System.out.print("*");
            }

            // 밑줄로 내림
            System.out.println();
        }









    }
}