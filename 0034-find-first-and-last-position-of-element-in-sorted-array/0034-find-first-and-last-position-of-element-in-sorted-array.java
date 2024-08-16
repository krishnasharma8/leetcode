class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;//size of an array
        int first=-1,second=-1;//initializing acc. to ques
        for (int i=0;i<n;i++){
            if(nums[i]==target){
                first=i;
                break;
            }
        }
        for (int i=0;i<n;i++){
            if(nums[i]==target){
                second=i;
            }
        }
        int[] ans={first,second};
        return ans;
    }
}