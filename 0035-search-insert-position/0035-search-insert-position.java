class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;//size of array
        int ans=0;//Initializing ans
        for (int i=0;i<n;i++){
            if(nums[i]<target){//Acc. to ques
                ans=i+1;
            }
        }
        return ans;
    }
}