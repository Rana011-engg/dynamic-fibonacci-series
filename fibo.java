# dynamic-fibonacci
dynamic programming  solution of fibonacci series 


class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        else{
            int dp[]=new int[n+1];
        int prev2=0;
        int prev1=1;
        int ans=0;
        for(int state=2;state<=n;state++){
            ans=prev2+prev1;
            prev2=prev1;
            prev1=ans;
        }
         return ans;
        }
       
    }
