class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first=0,second=0;//initializing index
        int n=nums.length;//size of array 
        
        for (int i=0;i<n-1;i++){
             
            for (int j=i+1;j<n;j++){ // Check each following element
             
                if(nums[i]+nums[j]==target){  // If the pair adds up to the target, store indices
                    first=i;
                    second=j;
                    break;// Exit the inner loop
                }
            }
        }
        int[] ans={first,second};
        return ans;// Return the indices as an array
    }
}