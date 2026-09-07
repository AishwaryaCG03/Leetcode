class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            int zero=0;
            int count=0;
        
            for(int j=i;j<n;j++)
            {
                if(nums[j]==0)
                {
                    zero++;
                    if(zero>1)
                    {
                        break;
                    }
                }
                count++;
            }
            max=Math.max(count-1,max);
        }
        return max;
    }
}