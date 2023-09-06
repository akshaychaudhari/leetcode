class Solution {
    //TC:O(4n)   SC: O(n)
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];
        Arrays.fill(results, -1);
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<2*n;i++){
            if(i>n){
                if(st.peek() == i%n)
                break;
            }
            while(!st.isEmpty() && nums[st.peek()] < nums[i%n]){
                int popped = st.pop();
                results[popped] = nums[i%n];
            }
            if(i < n){
                st.push(i);
            }
        }
        return results;
    }
}