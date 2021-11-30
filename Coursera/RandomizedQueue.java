import java.util.Iterator;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] deck;
    private int size = 0;

    // construct an empty randomized queue
    public RandomizedQueue() {
        deck = (Item[]) new Object[1];
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the randomized queue
    public int size() {
        return size;
    }

    // add the item
    public void enqueue(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("item is null");
        }
    }

    // remove and return a random item
    public Item dequeue() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("deque is empty");
        }
        int randNum = StdRandom.uniform(size);
        Item rand = deck[randNum];

        for (int i = randNum; i < size; i++) {
            deck[i] = deck[i+1]
        }
        deck[size] = null;
        return rand;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("deque is empty");
        }
        return deck[StdRandom.uniform(size)];
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        Iterator<Item> iter = new Iterator<Item>() {
            int position = 0;

            public boolean hasNext() {
                if (position < size) {
                    return true;
                }
                return false;
            }

            public Item next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException("no next element");
                }
                return deck[position++];
            }

            public void remove() {
                throw new UnsupportedOperationException("remove is not supported");
            }
        };
        return iter;
    }

    // unit testing (required)
    public static void main(String[] args) {

    }

}