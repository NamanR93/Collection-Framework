import java.util.LinkedList;
import java.util.Vector;

// creating of Vector, here will see 4 contructors.

public class VectorDemo {

  public static void main(String[] args) {

    Vector<Integer> vector = new Vector<>();
    System.out.println(vector.capacity()); // default capacity which is 10

    Vector<Integer> vector1 = new Vector<>(5);

    vector1.add(1);
    vector1.add(1);
    vector1.add(1);
    vector1.add(1);
    vector1.add(1);
    System.out.println(vector1.capacity());
    vector1.add(1);
    // as we add 1 more, capacity will double.
    System.out.println(vector1.capacity());

    Vector<Integer> vec = new Vector<>(5, 3);
    // in this capacity will increase on step of 3.

    LinkedList<Integer> linkedlist = new LinkedList<>();
    linkedlist.add(1);
    linkedlist.add(2);
    linkedlist.add(3);

    Vector<Integer> vec1 = new Vector<>(linkedlist);
    // can pass collection as well.

    vec1.clear();
    System.out.println(vec1);

  }

}
