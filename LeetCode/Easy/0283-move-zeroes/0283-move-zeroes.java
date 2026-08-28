class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int slow=0;
        for(int fast=0;fast<n;fast++)
        {
            if(nums[fast]!=0)
            {
                nums[slow]=nums[fast];
                slow++;
            }
        }
        while(slow<n)
        {
            nums[slow]=0;
            slow++;
        }
    }
}