class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i =0; i<tokens.length; i++) {
            switch(tokens[i]) {
                case "+" -> {
                    var top = stack.pop();
                    var newTop = stack.pop();
                    var sum = top + newTop;
                    stack.push(sum);
                }
                case "*" -> {
                    var top = stack.pop();
                    var newTop = stack.pop();
                    var multiply = top * newTop;
                    stack.push(multiply);
                }
                case "-" -> {
                    var top = stack.pop();
                    var newTop = stack.pop();
                    var subtract = newTop-top;
                    stack.push(subtract);
                }
                case "/" -> {
                    var top = stack.pop();
                    var newTop = stack.pop();
                    var div = newTop/top;
                    stack.push(div);
                }
                default -> {
                    stack.push(Integer.parseInt(tokens[i]));
                }
            }
        }
        var finalResult = 0;
        for (int ele : stack) {
            finalResult += ele;
        }
        return finalResult;
    }
}
