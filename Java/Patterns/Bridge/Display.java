abstract class Display {
    public int volume = 0;
    public int brightness = 100;
    public int displayState;

    public abstract void pressEight();
    public abstract void pressNine();

    public void status() {
        System.out.println("display state + " displayState);
    }

    public void pressTwo() {
        volume++;
        System.out.println("increased volume");
    }
    public void pressThree() {
        volume--;
        System.out.println("decreased volume");
    }
    public void pressFour() {
        brightness++;
        System.out.println("increased brightness");
    }
    public void pressFive() {
        brightness--;
        System.out.println("decreased brightness");
    }
}
