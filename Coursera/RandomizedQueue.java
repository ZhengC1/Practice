import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {

    // construct an empty randomized queue
    public RandomizedQueue() {

    }

    // is the randomized queue empty?
    public boolean isEmpty() {

    }

    // return the number of items on the randomized queue
    public int size() {

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

    }

    // return a random item (but do not remove it)
    public Item sample() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("deque is empty");
        }

    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {

    }

    // unit testing (required)
    public static void main(String[] args) {

    }

}