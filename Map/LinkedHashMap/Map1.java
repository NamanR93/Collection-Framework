package LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

class Map1 {

  public static void main(String[] args) {

    LinkedHashMap<String, Integer> LinkedHmap = new LinkedHashMap<>(11, 0.3f, true);

    LinkedHmap.put("Apple", 10);
    LinkedHmap.put("banana", 20);
    LinkedHmap.put("Orange", 13);

    System.out.println(LinkedHmap);

    // we can create hashmap like this also.
    HashMap<String, Integer> map = new HashMap<>();
    LinkedHashMap linkedHashMap1 = new LinkedHashMap(map);

    // Another methods:
    map.put("shubham", 91);
    map.put("harsh", 80);
    map.put("vipul", 78);

    Integer res = map.getOrDefault("naman", 99);
    System.out.println(res);
    map.putIfAbsent("mohit", 56);
    System.out.println(map);

  }
}