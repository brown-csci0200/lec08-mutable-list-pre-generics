package src;

public class EmptyList extends AbsList {

    public EmptyList() {
         super();
    }

    // addFirst implementation moved to abstract class AbsList

    // returns number of elements in a list
    public int length() {
        return 0;
    }

    @Override
    public String toString() {
        return "end-of-list";
    }
}
