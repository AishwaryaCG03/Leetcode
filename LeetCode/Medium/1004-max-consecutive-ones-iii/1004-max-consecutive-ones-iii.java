class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int count=0;
        int flip=0;
        for(int right=0;right<n;right++)
        {
            if(nums[right]==0)
            {
                flip++;
                while(flip>k)
                {
                    if(nums[left]==0)
                    {
                        flip--;
                    }
                    left++;
                }
                
            }
            count=Math.max(count,right-left+1);
        }
        return count;
    }
}