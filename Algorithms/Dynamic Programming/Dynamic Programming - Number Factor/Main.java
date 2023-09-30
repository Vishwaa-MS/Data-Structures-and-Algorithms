import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println(NF(7));
        System.out.println(NFB(7));
    }
    
    //Top - Down Approach
    
    public static int NF(int n, int[] memo){
        if ((n == 0) || (n == 1) || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        if(memo[n] == 0){
            int rec1 = NF(n-1, memo);
            int rec2 = NF(n-3, memo);
            int rec3 = NF(n-4, memo);
            memo[n] = rec1+rec2+rec3;
        }
        return memo[n];
    }

    public static int NF(int n){
        int[] memo = new int[n+1];
        return NF(n,memo);
    }

    //Bottom Up Approach

    public static int NFB(int n){
        int[] dp = new int[n+1];
        dp[0]=dp[1]=dp[2]=1;
        dp[3]=2;

        for(int i =4; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-3]+dp[i-4];
        }
        return dp[n];
    }

}