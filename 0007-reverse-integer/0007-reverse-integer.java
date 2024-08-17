class Solution {
    public int reverse(int x) {
        int rem=0,ans=0,mul=1;
       
        while(x!=0){
            rem=x%10;
            x=x/10;
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10){
            return 0;
        }
            ans=rem+ans*10;
        }
        return ans;
    }
}