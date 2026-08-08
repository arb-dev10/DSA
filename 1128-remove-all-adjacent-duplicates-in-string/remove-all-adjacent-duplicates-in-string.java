class Solution {
    public String removeDuplicates(String s) {
        int i=1;
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        while(i<s.length()){
            if(st.size()>0 && s.charAt(i)==st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        String ans="";
        Stack<Character> rev=new Stack<>();
        while(st.size()!=0){
            rev.push(st.pop());
        }
        while(rev.size()!=0){
            ans+=rev.pop();
        }
        return ans;
    }
}