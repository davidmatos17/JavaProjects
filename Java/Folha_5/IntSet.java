public interface IntSet {
    boolean contains(int x);

    boolean add(int x);

    boolean remove(int x);

    int size();

    void clear();

    boolean equals(IntSet s);

    IntSet intersection(IntSet s);
}
