package ch03;

public class ConditionsCase {
    public static void main(String[] args) {
        // switch문
        // 1주일에서 몇번째 요일인가
        int dayOfWeek = 4;
        // switch는 조건문이 아니고 변수
        /*
        switch(변수){
        }

        switch문의 변수의 값에 따라서 case 뒤에 값과 일치하는 구문을 실행
         */
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일입니다");
                break;
            case 2:
                System.out.println("화요일입니다");
                break;
            case 3:
                System.out.println("수요일입니다");
                break;
            default:
                System.out.println("목요일, 금요일, 토요일, 또는 일요일입니다.");
        }

        // break를 꼭 넣어줘야 됨, 왜냐면 if문과 다르게 중괄호가 없기 때문에(특별한 경우 아니면)
        // 안쓰게 되면 case에 맞는 코드를 실행 후 뒤에 있는 코드가 다 실행됨
        // 일치하는 case 문을 찾지못하면 default에 있는
        // default 문 뒤에는 break 안씀, 디폴트문은 꼭 맨마지막에.


        // if - else로 변경하기
        if (dayOfWeek == 1) {
            System.out.println("월요일입니다");
        } else if (dayOfWeek == 2) {
            System.out.println("화요일입니다");
        } else if (dayOfWeek == 3) {
            System.out.println("수요일입니다");
        } else {
                System.out.println("목요일, 금요일, 토요일, 또는 일요일입니다.");
            }
        }
}