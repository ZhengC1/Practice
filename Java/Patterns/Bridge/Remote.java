abstract class Remote {

    private Display display;
    public Remote(Display display) {
        this.display = display;
    }

    public void pressEight() {
        this.display.pressEight();
    }

    public void pressNine() {
        this.display.pressNine();
    }
    
    public void status() {
        this.display.status();
    }
}
