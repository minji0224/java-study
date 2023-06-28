package ch07.Instrument;

public class Piano extends Instrument {
    @Override
    public void play() {
        super.play();
        System.out.println("딩당동딩당동");
    }
}
