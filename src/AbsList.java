package src;

public abstract class AbsList implements IList {

    // produces list with given newElt followed by elements of this
    public IList addFirst(int newElt) {
        return new NodeList(newElt, this);
    }
}
