public class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> helperStack = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {

            while (!helperStack.isEmpty() && temperatures[i] > temperatures[helperStack.peek()]) {
                  
                int idx = helperStack.pop();
                result[idx] = i - idx;
            }
             helperStack.push(i);
        }    
        return result;
    }

}
