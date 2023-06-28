package ch08.Ex;

public class Human implements Walkable, Runnable {
    @Override
    public void run() {
        System.out.println("The human is running");
    }

    @Override
    public void walk() {
        System.out.println("The human is walking");
    }
}
