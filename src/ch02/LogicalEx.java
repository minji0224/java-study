//package ch02;
//
//public class LogicalEx {
//    public static void main(String[] args) {
//
////        // 연습문제
////
////        boolean p = false;
////        boolean q = true;
////
////        boolean result = !(p && q) && (p || q);
////        // 1. (p && q) 정답은 flase
////        // 2. 앞에 ! 있으니깐 결과값의 반대인 true
////        // 3. (p || q) 정답은 true
////        // 4. 그러므로 정답은 true
////
////
////
////
////
////
////        int a = 10;
////        int b = 20;
////        int c = 10;
////
////        boolean result = (a >= b) && (a != c);
////        // 1. (a >= b) 정답은 false
////        // 2. (a != c) 정답은 false
////
////
////
////
////        boolean x = true;
////        boolean y = false;
////
////        boolean result = !x && (x || y);
////        // 1. (false) && (true)
////
////
////        int a = 5;
////        int b = 10;
////        int c = 15;
////
////        boolean result = (a < b) && (c > b) && (a + b == c);
////        // 1. (true) && (true) && (true)
////
////
////
////        boolean p = true;
////        boolean q = false;
////
////        boolean result = (p && q) || (!p && !q);
////        // (false) || (false && true)
////        // (false) || (false)
////        // false
////
////
////
////        int x = 15;
////        int y = 25;
////
////        boolean result = (x >= y) || (x % y == 0);
////        // (false) || (false)
////
////
////        boolean a = true;
////        boolean b = false;
////        boolean c = true;
////
////        boolean result = (a || b) && (c || b);
////        System.out.println(result);
////        // (true) && (true)
////        // true
////
////        int x = 12;
////        int y = 8;
////
////        boolean result = x < y && x % y == 0;
////        // false && false
////        // false
////
////
////
//
//
////        int x = 10;
////        int y = 5;
////
////        int result = (x > y) ? (x + y) : (x - y);
////        // (true) ? (15) : (5)
////        // 15
//
//
////        int a = 8;
////        int b = 12;
////
////        int result = (a % 2 == 0) ? (a / 2) : (b / 2);
////
////
////        int num = 7;
////
////        String result = (num > 0) ? "양수" : ((num < 0) ? "음수" : "0");
////        // (true) ? "양수" : (false) ? "음수" : 0
//
////
////
////
////        int year = 2020;
////        boolean leapYear = (year % 400 == 0) ? "윤년" : (year % 100 != 0) ? "윤년이 아니다";
////        boolean leapYear = ((year % 4) && !(year % 100) || (year % 400))
////
//
////
////        int x = 15;
////        if( x > 10 ) {
////            System.out.println("큰 수");
////        } else {
////            System.out.println("작은 수");
////        }
////
////        int score = 70;
////        if ( score >= 80) {
////            System.out.println("통과");
////        } else {
////            System.out.println("불통과");
////        }
////
////        int num = 0;
////        if (num > 0){
////            System.out.println("양수");
////        } else if (num < 0){
////            System.out.println("음수");
////        } else {
////            System.out.println("0");
////        }
////
////        int age = 2;
////        if (age >= 20) {
////            System.out.println("성인");
////        } else {
////            System.out.println("미성년자");
////        }
////
////        int month = 12;
////        if (month == 1) {
////            System.out.println("ja");
////        } else if (month == 2) {
////            System.out.println("fe");
////        } else if (month == 3) {
////            System.out.println("ma");
////        } else {
////            System.out.println("유효하지 않는 월입니다");
////        }
////
////        int year = 2020;
////        if (year % 400 == 0 || year % 4 == 0 && year % 100 !=0){
////            System.out.println("윤년");
////        } else {
////            System.out.println("평년");
////        }
////
////        int num1 = 1;
////        int num2 = 33;
////        if ( num1 == num2) {
////            System.out.println("같음");
////        } else {
////            System.out.println("다름");
////        }
////
////        int a = 22;
////        int b = 32;
////        int c = 3;
////        if ( a > 0 && b > 0 && c > 0 ) {
////            System.out.println("양수");
////        } else if (a < 0 || b < 0 || c < 0){
////            System.out.println("음수");
////        } else {
////            System.out.println("0");
////        }
////    }
////}
//    }
//}
//}
