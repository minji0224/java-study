package ch01;

public class StringsEx {
    public static void main(String[] args) {
        //문자열 초기화 방법 2가지
        // 1. new String("");
        String name = new String("최민지");
        //2. 쌍따옴표
        String age = "29세";
        String address = " 서울특별시";
        String favorite = " 초콜릿을 좋아합니다. ";


        // 문자열 결합 ( + " " + )
        // 제어문자(\n, \t, \", \\)
        String info = name + "\\" +  age + "\n사는 곳은" + address + "입니다."
                + "\n" + "저는" + favorite
                + "\n" + "감사합니다.";
        System.out.println(info);






    }
}
