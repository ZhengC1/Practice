import java.util.Iterator;
import edu.princeton.cs.algs4.StdOut;

/**
 * Adapted from the alg book page 141.
 * @param <Item>
 */
public class Deque<Item> implements Iterable<Item> {
    private Item[] deck;
    private int size = 0;

    // construct an empty deque
    public Deque() {
       deck =  (Item[]) new Object[1];
    }

    // is the deque empty?
    public boolean isEmpty() { return size == 0;}

    // return the number of items on the deque
    public int size() { return size; }

    private void resize() {
        if (size == deck.length) {
            Item[] temp = (Item[]) new Object[2 * deck.length];
            for (int i = 0; i < size; i++) {
                temp[i] = deck[i];
            }
            deck = temp;
        }
    }


    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("item is null");
        }
        if (size == deck.length) {
            resize();
        }
        for (int i = size; i > 0; i--) {
            deck[i] = deck[i - 1];
        }
        deck[0] = item;
        size++;
    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("item is null");
        }
        if (size == deck.length) {
            resize();
        }
        deck[size] = item;
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("Deque is empty");
        }
        Item first = deck[0];
        for (int i = 0; i < size - 1; i++) {
            deck[i] = deck[i + 1];
        }
        size--;
        if (size > 1) {
            deck[size] = null;
        }
        return first;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("Deque is empty");
        }
        Item last = deck[size - 1];
        deck[size - 1] = null;
        size--;
        return last;
    }

    // return an iterator over items in order from front to back
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
        Deque<Integer> testDeck = new Deque<Integer>();
        StdOut.println("isEmpty: " + testDeck.isEmpty());
        StdOut.println("addFirst: ");
        testDeck.addFirst(6);
        testDeck.addFirst(7);
        Iterator itr = testDeck.iterator();
        StdOut.print("[ ");
        while (itr.hasNext()) {
            StdOut.print(itr.next() + " ");
        }
        StdOut.println("]");
        StdOut.println("removeFirst: " + testDeck.removeFirst());
        StdOut.println("the size: " + testDeck.size());
    }

}