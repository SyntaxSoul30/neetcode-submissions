class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i =0; i<operations.length; i++){ 
            switch(operations[i]) {
                case "+" -> {
                    var top = stack.pop();
                    var newTop = stack.peek();
                    var sum = top + newTop;
                    stack.push(top);
                    stack.push(sum);
                }
                case "C" -> {
                    stack.pop();
                }
                case "D" -> {
                    stack.push(stack.peek()*2);
                }
                default -> {
                    stack.push(Integer.parseInt(operations[i]));
                }

            }
        }
        var finalSum = 0;
        for (int ele : stack) {
            finalSum += ele;
        }
        return finalSum;
    }
}