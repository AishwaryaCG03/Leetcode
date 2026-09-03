class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int right=left;
        int length=0;
        int count=0;
        if(s.length()==1)
        {
            return 1;
        }
        while(right<s.length())
        {
        while(set.contains(s.charAt(right)))
        {
            set.remove(s.charAt(left));
            left=left+1;
            count--;
        }
        set.add(s.charAt(right));
        count++;
        right=right+1;
        length=Math.max(length,count);
        }
        return length;
    }
}