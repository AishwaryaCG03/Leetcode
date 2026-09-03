class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int right=0;
        int count=0;
        int flip=0;
        while(right<n)
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
            right++;
            count=Math.max(count,right-left);
        }
        return count;
    }
}