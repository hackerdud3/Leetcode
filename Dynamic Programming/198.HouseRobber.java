class Solution {
    public int solution(int[] nums, int i){
        int n = nums.length;
        int[] dp = new int[n+2];
        dp[n+1]=0;
        dp[n]=0;
        for( i = n-1; i>=0;i--){
        dp[i] = Math.max(nums[i]+dp[i+2], dp[i+1]);
        }
        return dp[0];
    }
    public int rob(int[] nums) {
        int i = 0;
       return solution(nums, i); 
    }
}