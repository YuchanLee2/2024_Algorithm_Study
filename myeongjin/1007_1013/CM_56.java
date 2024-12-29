import java.io.IOException;
import java.util.Scanner;

public class CM_56 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 입력 예시와 같은 방식으로 주어진 상어의 수와 크기
        int n = sc.nextInt(); 
        int[] shark = new int[n + 1];
        int[] dp = new int[n + 1]; // DP 배열 초기화
        int maxEat = 0;

        // 상어 크기 입력
        for (int i = 0; i < n; i++) {
            shark[i] = sc.nextInt();
        }

        // DP를 활용하여 최대 상어 먹은 수 계산
        for (int i = 0; i < n; i++) {
            dp[i] = 1; // 최소 1마리는 먹을 수 있음
            for (int j = 0; j < i; j++) {
                if (shark[j] < shark[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    // 전 상어의 먹은 상어 마리 수와
                    // 현재 상어의 지금 먹은 상어 마리 수+1 비교함
                }
            }
            maxEat = Math.max(maxEat, dp[i]);
        }

        System.out.println(maxEat);
    }
}