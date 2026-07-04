import java.util.*;
public class StackValidParenthisis {

    public static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }

            // closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (s.isEmpty()) {
                    return false;
                }

                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '[' && ch == ']') ||
                    (s.peek() == '{' && ch == '}')) {

                    s.pop();

                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {

        String str = "({}[])";

        System.out.println(isValid(str));
    }
}
