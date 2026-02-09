package src;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // ******* INITIAL VERSION:  this is an immutable list **
        NodeList L = new EmptyList().addFirst(7);
        NodeList L2 = L.addFirst(3);
        NodeList L3 = L.addFirst(5);
        L2 = L2.addFirst(4);

        int v = L2.length();
        System.out.println(v);

        // ***** JAVA VERSION:  What's different about how we use this one?? *****
        LinkedList<Integer> Lj  = new LinkedList<Integer>();
        Lj.addFirst(7);
        Lj.addFirst(3);
        Lj.addFirst(5);
        Lj.addFirst(9);
        System.out.println(Lj.size());


        // ***** MUTABLE LIST VERSION:  Same idea as Java version!!! *****
        MutableList Lm = new MutableList();
        Lm.addFirst(7);
        Lm.addFirst(3);
        Lm.addFirst(5);
        Lm.addFirst(2);
        Lm.addFirst(1);
        // This list has size 5!
        // How would you write a length method for MutableList?
    }
}
