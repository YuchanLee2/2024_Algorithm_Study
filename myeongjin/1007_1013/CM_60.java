import java.io.IOException;
import java.util.*;

public class CM_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N % 2 != 0) {
            System.out.println(0);
            return;
        }

        int[] dp = new int[N + 1];
        dp[0] = 1; // 3 x 0
        dp[1] = 0; // 3 x 1
        dp[2] = 3; // 3 x 2

        for (int i = 4; i <= N; i += 2) {
            dp[i] = dp[i - 2] * 3;
            for (int j = 4; j <= i; j += 2) {
                dp[i] += dp[i - j] * 2;
            }
        }

        System.out.println(dp[N]);
    }
}