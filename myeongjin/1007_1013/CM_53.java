import java.io.IOException;
import java.util.*;

public class CM_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 동전 종류 수
        int M = sc.nextInt(); // 만들려는 가치의 합
        
        int[] coins = new int[N];
        
        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt(); // 각 동전의 가치 입력
        }
        
        // dp 배열 초기화
        int[] dp = new int[M + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); // 초기값을 무한대로 설정
        dp[0] = 0; 
        
        // 동전 개수 계산
        for (int coin : coins) {
            for (int j = coin; j <= M; j++) {
                if (dp[j - coin] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coin] + 1);
                }
            }
        }
        
        System.out.println(dp[M] == Integer.MAX_VALUE ? -1 : dp[M]);
        
        sc.close();
    }
}