import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
  public static void main(String[] args) {

    CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    List<String> shoppingList = new CopyOnWriteArrayList<>();
    shoppingList.add("Milk");
    shoppingList.add("Eggs");
    shoppingList.add("Bread");
    System.out.println("Initial shopping List: " + shoppingList);

    for (String item : shoppingList) {
      System.out.println(item);

      // try to modify the list while reading

      if (item.equals("Eggs")) {
        shoppingList.add("Butter");
        System.out.println("Added butter while reading. ");
      }
    }

    System.out.println("updated shopping list: " + shoppingList);
  }
}
