package stack.base;

public class GhostStackUsingArray<T> {

    private T[] backedArr;

    public GhostStackUsingArray() {
        this.backedArr = (T[]) new Object[10];
    }

}
