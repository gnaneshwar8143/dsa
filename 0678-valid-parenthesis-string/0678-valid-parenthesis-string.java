import java.util.*;

public class Solution {
    public static boolean checkValidString(String str) {
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                openStack.push(i);
            } else if (ch == '*') {
                starStack.push(i);
            } else if (ch == ')') {
                if (!openStack.isEmpty()) {
                    openStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }

        while (!openStack.isEmpty() && !starStack.isEmpty()) {
            if (openStack.peek() < starStack.peek()) {
                openStack.pop();
                starStack.pop();
            } else {
                break;
            }
        }

        return openStack.isEmpty();
    }
}
