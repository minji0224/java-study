package ch08.Ex;

public class Rabbit implements Runnable {
    @Override
    public void run() {
        System.out.println("The rabbit is running fast!");
    }
}
