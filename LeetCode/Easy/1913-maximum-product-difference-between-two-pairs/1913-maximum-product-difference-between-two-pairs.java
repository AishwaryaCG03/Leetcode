class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int second_smallest=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(nums[i]>largest)
            {
                second_largest=largest;
                largest=nums[i];
            }
            else if(nums[i]>=second_largest&&nums[i]<=largest)
            {
                second_largest=nums[i];
            }
            if(nums[i]<smallest)
            {
                second_smallest=smallest;
                smallest=nums[i];
            }
            else if(nums[i]<=second_smallest&&nums[i]>=smallest)
            {
                second_smallest=nums[i];
            }
        }
        int prod=(largest*second_largest)-(smallest*second_smallest);
        return prod;
    }
}