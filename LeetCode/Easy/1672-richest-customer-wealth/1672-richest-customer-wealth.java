class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxcount=0;
        for(int i=0;i<accounts.length;i++)
        {
            int current_account=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                current_account=current_account+accounts[i][j];
            }
            maxcount=Math.max(maxcount , current_account);
        }
        return maxcount;
    }
}