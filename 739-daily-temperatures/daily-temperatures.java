class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int res[]=new int[n];
        res[n-1]=0;
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.size()==0)res[i]=0;
            else res[i]=st.peek()-i;
            st.push(i);
        }
        return res;
    }
}