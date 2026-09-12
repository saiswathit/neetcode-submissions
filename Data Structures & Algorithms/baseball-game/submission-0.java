class Solution {
    public int calPoints(String[] operations) {
    Stack<Integer> result = new Stack<>();
    for (String op : operations) {
        if (op.equals("+")) {
            Integer first = result.pop();
            Integer sum = first + result.peek();
            result.push(first);
            result.push(sum);
        } else if (op.equals("C")) {
            result.pop();
        } else if (op.equals("D")) {
            Integer top = result.peek();
            result.push(2*top);
        } else {
            result.push(Integer.parseInt(op));
        }
    }

    int sum = 0;
        for (int score : result) {
            sum += score;
        }
        return sum;
}
}