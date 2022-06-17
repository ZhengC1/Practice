public class TVDisplay extends Display {
    public TVDisplay(int displayState) {
        displayState = displayState;
    }

    @Override
    public void pressEight() {
        System.out.println("Device turned on")
        displayState = 0;
    }
    
    @Override
    public void pressNine() {
        System.out.println("Device turned off")
        displayState = 1;

    }
}