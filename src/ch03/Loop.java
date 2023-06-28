package ch03;

public class Loop {
    public static void main(String[] args) {
        // 반복문(Loop)
        // 특정 조건이 만족되는 동안 계속해서 실행되는 코드
        // 1. for문
        /*

        for (초기화; 조건식; 증감식) {
          반복해서 실행할 코드
          }

         */
        // 1. 가장 처음에 초기화 식이 실행됨, int i = 0
        // 2. 조건식 실행, i < 5
        // 3. 조건이 true이면 블록안에 코드가 실행
        // 4. 증감식 실행, i++(웬만하면 후행식)
        // 이후 부터는 조건식 > 블록코드 > 증감식 (초기화식은 실행 x,처음 한번만)
        // 이후 조건이 false가 되면 블록내의 코드를 실행하지 않고 반복문을 종료함

        for (int i=0; i<5; i++){
            System.out.println("i의 값: " + i);
        }


        // continue, 이후 코드를 스킵하고 다음 반복을 실행
        // 가장 가까운 반복문의 다음 반복을 실행
        // 조건부를 만족하면 continue > System.out.println("i의 값: " + i); 실행안하고
        // 다시
        // break랑 다름
//        for (int i=0; i<5; i++){
//            if(i == 2) {
//                continue;
//            }
//            System.out.println("i의 값: " + i);
//        }


    }
}
