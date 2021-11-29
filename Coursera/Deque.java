import java.util.Iterator;

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
        resize();
        size++;
    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("item is null");
        }
        resize();
        deck[size] = item;
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("Deque is empty");
        }
        Item first = deck[0];
        for (int i = 1; i < size; i++) {
            deck[i - 1] = deck[i];
        }
        size--;
        return first;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("Deque is empty");
        }
        size--;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        Iterator<Item> iter = new Iterator<Item>() {
            public boolean hasNext() {
                return false;
            }

            public Item next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException("no next element");
                }
                return null;
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