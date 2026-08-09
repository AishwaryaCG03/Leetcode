class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n=nums.length;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        int found=target-nums[i];
        if(map.containsKey(found))
        {
            return new int[]{map.get(found),i};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
    }
}