
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ArrayList1 {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();

    /*
     * when you create an ArrayList, it has an initial capacity( default is 10). the
     * capacity refers to the size of the internal array tha can hold elements
     * before needing to resiz.
     * 
     */
    list.add(1);
    list.add(5);
    list.add(80);
    list.add(3, 100); // add to specific index

    // for (int x : list) {
    // System.out.println(x);
    // }

    System.out.println(list.size());

    // System.out.println(list.remove(2)); // remove by index or value
    list.remove(Integer.valueOf(1)); // this will remove the first occurence (in this case is 1)
    // System.out.println(list);

    // for (int x : list) {
    // System.out.println(x);
    // }

    list.set(1, 50); // modify
    System.out.println(list);

    List<String> list1 = new ArrayList<>();
    System.out.println(list.getClass().getName());

    List<String> list2 = Arrays.asList("monday", "tuesday");
    System.out.println(list2.getClass().getName());
    list2.set(1, "wednesday");
    System.out.println(list2.get(1));

    String array[] = { "apple", "banana", "mango" };
    List<String> list3 = Arrays.asList(array);
    System.out.println(list3.getClass().getName());
    // but we can make it modifiable.
    List<String> list5 = new ArrayList<>(list3);
    list5.add("cherry");
    System.out.println(list5);

    List<Integer> list4 = List.of(1, 2, 3, 4); // unmodifiable list
    // list4.set(1, 33); // this will give error

    list.addAll(list4);
    System.out.println(list);

    // convert list to array
    Object[] array2 = list4.toArray();

    // sort an array
    Collections.sort(list);

    // we can do list.sort(null); // comparator will study later.
  }
}
