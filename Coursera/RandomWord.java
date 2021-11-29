import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champ = StdIn.readString();
        int index = 2;
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (StdRandom.bernoulli(1.0/index)) {
                champ = s;
            }
            index++;
        }
        StdOut.println(champ);
    }
}
