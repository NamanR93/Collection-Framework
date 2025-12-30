package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

  public static void main(String[] args) {

    HashMap<Integer, String> map = new HashMap<>();

    map.put(1, "naman");
    map.put(2, "harsh");
    map.put(3, "ashim");

    System.out.println(map);

    System.out.println(map.get(3));
    System.out.println(map.containsKey(2));
    System.out.println(map.containsValue("naman"));
    System.out.println(map.remove(2));

    // now if we want to run a loop we have to create set

    // Set<Integer> keys = map.keySet();
    for (int i : map.keySet()) {
      System.out.println(map.get(i));
    }

    // another way
    Set<Map.Entry<Integer, String>> entries = map.entrySet();

    for (Entry<Integer, String> entry : entries) {
      entry.setValue(entry.getValue().toUpperCase());
    }
    System.out.println(map);

  }

}
