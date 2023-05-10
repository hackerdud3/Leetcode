import java.util.Vector;
class Solution {
    public int solution(Vector<Integer> arr){
       int n = arr.size();
      
       int[] dp = new int[n+2];
        dp[n+1]=0;
        dp[n]=0;
        for( int i = n-1; i>=0;i--){
        dp[i] = Math.max(arr.get(i)+dp[i+2], dp[i+1]);
        }
        return dp[0];
    }
    public int rob(int[] nums) {
        int n = nums.length;
         if(n==1){
           return nums[0];
       }
        Vector<Integer> first = new Vector<>();
          Vector<Integer> second = new Vector<>();
        for(int i = 0;i<n;i++){
            if(i!=0){
            first.add(nums[i]);
            }
            if(i!=n-1){
                second.add(nums[i]);
            }
        }
    
        return Math.max(solution(first), solution(second));
    }
}