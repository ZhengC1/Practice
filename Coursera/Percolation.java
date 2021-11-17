import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private final WeightedQuickUnionUF wqu;
    private final WeightedQuickUnionUF backwash;
    private final int n;
    private final int top;
    private final int bottom;
    private boolean[] grid;
    private int numOpen = 0;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        this.n = n;
        this.top = 0;
        this.bottom = n * n + 1;
        wqu = new WeightedQuickUnionUF(n * n + 1);
        backwash = new WeightedQuickUnionUF(n*n + 2);
        grid = new boolean[n * n + 2];
        grid[top] = true;
        grid[bottom] = true;
    }

    private void checkBounds(int row, int col) {
        // throws exception if it's out of bounds;
        if (row > n || row < 1 || col > n || col < 1) {
            throw new IllegalArgumentException("out of bounds");
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        checkBounds(row, col);
        int pos = getPosition(row, col);
        grid[pos] = true;
        numOpen++;
        if (row == 1) {
            backwash.union(pos, top);
            wqu.union(pos, top);
        }
        if (row == this.n) {
            backwash.union(pos, bottom);
        }

        // north row -1
        adjUnion(pos, row - 1, col);
        // south
        adjUnion(pos, row + 1, col);
        // west
        adjUnion(pos, row, col - 1);
        // east
        adjUnion(pos, row, col + 1);
    }

    private void adjUnion(int pos, int row, int col) {
        if ((row > 0 && row <= n && col > 0 && col <= n ) && isOpen(row, col)) {
            wqu.union(getPosition(row, col), pos);
            backwash.union(getPosition(row, col), pos);
        }
    }

    private int getPosition(int row, int col) {
        return (row - 1) * this.n + col;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        checkBounds(row, col);
        return grid[getPosition(row, col)];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        checkBounds(row, col);
        return wqu.find(getPosition(row, col)) == wqu.find(top);
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return this.numOpen;
    }

    // does the system percolate?
    public boolean percolates() {
        return backwash.find(bottom) == backwash.find(top);
    }

    // test client (optional)
    public static void main(String[] args) {
    }
}