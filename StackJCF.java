
import java.util.*;

public class StackJCF {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int indx = 0;
        while (indx < str.length()) {
            s.push(str.charAt(indx));
            indx++;
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char ch = s.pop();
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //Stack<Integer> s = new Stack<>();
        // s.push(1);
        //s.push(2);
        //s.push(3);

        //  pushAtBottom(s, 4);
        //  while (!s.isEmpty()) {
        //   System.out.println(s.peek());
        //   s.pop();
        String str = "abc";
        String ressult = reverseString(str);
        System.out.print(ressult);
    }
}
