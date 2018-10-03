public class Operators {
    public static void main(String[] args) {
        boolean[] boo = new boolean[2];
        int i = 0;
        System.out.println((i == 0 || true) && (i == 1 || boo[-1]));
    }
}
