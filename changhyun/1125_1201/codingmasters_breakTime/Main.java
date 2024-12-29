import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        final long MOD = 998244353;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long dp[] = new long[10001];

        dp[0]=1;
        dp[1] = 0;
        dp[2] = 1;

        // D_n = (n-1) * (D_n-1 + D_n-2)

        for (int i=3; i<=n; i++) {
            dp[i] = ((i-1) * (dp[i-1] + dp[i-2])) % MOD;
        }

        System.out.print(dp[n]);
    }
}