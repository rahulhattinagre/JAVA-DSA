import java.util.*;
public class StackValidParentheses {

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
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //closing
            if(ch==')'){
                int count =0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;//duplicate
                }else{
                    s.pop();//opening pair
                }
            }else{
                //opening 
                s.push(ch);
            }
        }
        return false;

    }

    public static void main(String[] args) {

       // String str1 = "({}[])";

        //System.out.println(isValid(str1));
        String str="((a+b)+(c+d))";
        System.out.println(isDuplicate(str));
    }
}
