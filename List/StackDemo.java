import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();
    stack.add(1);
    stack.add(2);
    stack.add(3);
    stack.add(4);
    stack.add(5);

    System.out.println(stack);
    Integer removedElement = stack.pop();
    System.out.println(stack);

    System.out.println(stack.peek());
    System.out.println(stack.isEmpty());
    System.out.println(stack.size());

    int search = stack.search(3); // search from top, 1-based indexing.
    System.out.println(search);
  }

}
