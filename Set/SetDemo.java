package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetDemo {

  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>(); // unordered
    Set<Integer> set1 = new LinkedHashSet<>(); // gives the order in which inserted
    Set<Integer> set2 = new TreeSet<>();

    set2.add(12);
    set2.add(1);
    set2.add(1);
    set2.add(67);

    // System.out.println(set2);
    Interator itr = set.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println(set2.contains(12));
    System.out.println(set2.remove(1));
    for (int i : set2) {
      System.out.println(i);
    }

    // for thread safety

    Set<Integer> integers = new ConcurrentSkipListSet<>();

    // unmodifiable
    Set<Integer> integerss = Set.of(1, 2, 3, 4, 5, 6, 23, 32, 4, 35, 465, 76);
    Collections.unmodifiableSet(integerss);// to make this set immutable

  }

}
