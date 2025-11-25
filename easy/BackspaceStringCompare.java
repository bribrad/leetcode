/**
 * Completed: 2025-11-12
 * Difficulty: Easy
 * 844. Backspace String Compare
 * https://leetcode.com/problems/backspace-string-compare/description/
 */

class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return (backspaceString(s).equals(backspaceString(t)));       
    }

    public static String backspaceString(String s) {
        Stack stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (stack.size() > 0)
                    stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.toString();
    }
}