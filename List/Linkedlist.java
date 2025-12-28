import java.util.*;

public class Linkedlist {

  public static void main(String[] args) {

    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);

    System.out.println(ll.get(2)); // O(n)

    ll.addFirst(0);    //O(1)
    ll.addLast(5);      //O(1)

    System.out.println(ll);
    System.out.println(ll.getFirst());
    System.out.println(ll.getLast());

    ll.removeIf(x -> x % 2 == 0);
    System.out.println(ll);

    LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
    LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));

    animals.removeAll(animalsToRemove);

    System.out.println(animals);

  }
}
