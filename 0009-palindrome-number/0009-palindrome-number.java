class Solution {
    public boolean isPalindrome(int x) {
        int rem=0,ans=0,n=x;
        if(x<0){
            return false;
        }
        while(x>0){
            rem=x%10;
            x=x/10;
            if(ans>Integer.MAX_VALUE/10   ){
                return false;
            }
            ans=ans*10+rem;
        }
        if(ans==n){
            return true;
        }
        return false;
    }
}