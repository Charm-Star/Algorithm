import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1029 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(calculateBracketValue(s));





    }
    public static int calculateBracketValue(String s) {
        Stack<Object> stack = new Stack<>();
        for (char charValue : s.toCharArray()) {
            if (charValue == '(' || charValue == '[') {
                stack.push(charValue);
            } else {
                if (charValue == ')') {
                    int temp = 0;
                    while (!stack.isEmpty() && stack.peek() instanceof Integer) {
                        temp += (int) stack.pop();
                    }
                    if (stack.isEmpty() || stack.pop().equals('[')) {
                        return 0;
                    }
                    stack.push(2 * (temp > 0 ? temp : 1));
                } else if (charValue == ']') {
                    int temp = 0;
                    while (!stack.isEmpty() && stack.peek() instanceof Integer) {
                        temp += (int) stack.pop();
                    }
                    if (stack.isEmpty() || stack.pop().equals('(')) {
                        return 0;
                    }
                    stack.push(3 * (temp > 0 ? temp : 1));
                }
            }
        }

        int result = 0;
        for (Object item : stack) {
            if (item instanceof Character) {
                return 0;
            }
            result += (int) item;
        }
        return result;
    }

}
