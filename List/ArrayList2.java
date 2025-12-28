
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(1);
    list.add(3);

    // list.sort(null); // to print in ass order

    list.sort((a, b) -> b - a); // to print in reverse order
    System.out.println(list);

    List<String> words = Arrays.asList("banana", "apple", "date");
    words.sort((a1, b1) -> b1.length() - a1.length());
    System.out.println(words);

  }

}
