import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {


        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character p = ' ';

            if (!parentheses.isEmpty()) {
                p = parentheses.peek();
            }
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    parentheses.add(s.charAt(i));
                    break;
                case '}':

                    if (p == '{') {
                        parentheses.pop();
                    } else {
                        return false;
                    }
                    break;
                case ')':
                    if (p == '(') {
                        parentheses.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (p == '[') {
                        parentheses.pop();
                    } else {
                        return false;
                    }
                    break;

            }



        }
        return parentheses.isEmpty();
    }

    public static void main(String[] args) {
        isValid("((){}[]))");
      //  isValid("((){}[])");
    }
}
