package src;

public class NodeList extends AbsList {
    private Integer first;
    private IList next;

    public NodeList(Integer newElt, IList next) {
        super();
        this.first = newElt;
        this.next = next;
    }

    public int length() {
        return 1 + this.next.length();
    }

    @Override
    public String toString() {
        return this.first.toString() + ", " + this.next.toString();
    }
}
