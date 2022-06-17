public class TestRemote {
    public static void main(String[] args) {
         Remote TVRemote = new TVRemote(new TVDisplay(0));
         Remote DirectTVRemote = new DirectTVRemote(new TVDisplay(1));
         TVRemote.pressFive();
         TVRemote.pressNine();
         DirectTVRemote.pressNine();
    }
}