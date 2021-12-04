import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        int numToPrint = Integer.parseInt(args[0]);
        RandomizedQueue<String> permute = new RandomizedQueue<String>();
        while (!StdIn.isEmpty()) {
            permute.enqueue(StdIn.readString());
        }
        for (int i = 0; i < numToPrint; i++) {
            StdOut.println(permute.dequeue());
        }
    }
}