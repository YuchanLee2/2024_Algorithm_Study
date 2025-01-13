import java.io.IOException;
import java.util.Scanner;

public class CM_52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        int n = scanner.nextInt();
        long[] dp = new long[n + 1];
        dp[0] = 1; 
        if (n >= 1) dp[1] = 3; 
        if (n >= 2) dp[2] = 7;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]*2)%796796;

        }
        System.out.println(dp[n]);
    }
}
 