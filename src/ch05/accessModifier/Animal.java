package ch05.accessModifier;

public class Animal {
    // go(lang)이라는 프로그램에서 쓰는
    // var name string; (protected)
    // var Name string;; (public)
    private String name;
    protected void eat() {
        System.out.println("the animal is eating.");
    }
}
