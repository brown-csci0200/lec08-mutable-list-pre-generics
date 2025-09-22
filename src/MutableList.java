package src;

public class MutableList {
    private IList start;

    public MutableList() {
        this.start = new EmptyList();
    }

    public void addFirst(int newElt) {
        NodeList newNode = new NodeList(newElt, this.start);
        this.start = newNode;
    }

    @Override
    public String toString() {
        return "[" + this.start.toString() + "]";
    }
}
