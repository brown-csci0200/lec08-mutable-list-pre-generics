package src;

public interface IList {
    // returns number of elements in a list
    public int length();
    // produces list with given newElt followed by elements of this
    public IList addFirst(int newElt);
}
