class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int r=0;
        while(x!=0)
        {
            int m=x%10;
            x=x/10;
            r=r*10+m;
        }
        if(t==r && t>=0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}