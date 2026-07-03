class Solution {
    public boolean isValid(String s) {
        if ((s.length() % 2) != 0)
            return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                case '(' -> stack.push(')');
                default -> {
                    if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
