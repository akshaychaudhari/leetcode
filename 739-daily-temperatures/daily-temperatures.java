class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[T.length];
        for(int i=0;i<T.length;i++){
            while(!st.isEmpty() && T[i] > T[st.peek()]){
                int popped = st.pop();
                result[popped] = i - popped;
            }
            st.push(i);
        }
        return result;
    }
}