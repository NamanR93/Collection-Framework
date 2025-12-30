package LinkedHashMap;

import java.util.LinkedHashMap;

//Example of LRU cache
public class Map2<K, V> extends LinkedHashMap<K, V> {

  private int capacity;

  public Map2(int capacity) {
    super(capacity, 0.75f, true);

    this.capacity = capacity;
  }

  @Override
  protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
    // TODO Auto-generated method stub
    return size() > capacity;
  }

  public static void main(String[] args) {

    Map2<String, Integer> studentMap = new Map2<>(3);

    studentMap.put("Bob", 90);
    studentMap.put("Alice", 89);
    studentMap.put("Ram", 91);
    studentMap.put("Harshu", 89);

    System.out.println(studentMap);

  }

}
