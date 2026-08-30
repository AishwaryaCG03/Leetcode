class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        double max=sum;
        for(int i=k;i<n;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(sum,max);
        }
        return max/k;
    }
}