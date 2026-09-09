class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] arr=t.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            boolean found=false;
            char ch=s.charAt(i);
            for(int j=0;j<t.length();j++)
            {
                if(ch==arr[j])
                {
                    arr[j]='*';
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                return false;
            }
        }
        return true;
        
    }
}