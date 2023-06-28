package ch08.Ex;

public class Main {
    public static void main(String[] args) {

        Walkable a = new Human();
        a.walk();

        Runnable b = new Human();
        b.run();
    }
}
