import java.util.TreeSet;

public class TreeSetDemo {

  public static void main(String[] args) {

    TreeSet set = new TreeSet();

    set.add(40);
    set.add(60);
    set.add(30);
    set.add(10);
    set.clear();
    set.remove(30);

    System.out.println(set);
  }

}
