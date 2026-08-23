class Solution {
    public int dominantIndex(int[] nums) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>first)
            {
                second=first;
                first=nums[i];
                index=i;
            }
            else if(nums[i]>second&&nums[i]<first)
            {
                second=nums[i];
            }
            
        }
        if(first<second*2)
        {
            index=-1;
        }
        return index;
    }
}