import java.io.IOException;
import java.util.Scanner;

public class CM_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 삼각형의 행 수
        int[][] triangle = new int[n][];

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = sc.nextInt();
            }
        }
        int dp[][] = new int[n][n];
        dp[0][0] = triangle[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) { // 맨 왼쪽
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                } else if (j == i) { // 맨 오른쪽
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else { // 그 외 경우
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
            }
        }
        int len = dp.length;
        int answer = 0;
        for(int i=0; i<len; i++){
            answer = Math.max(answer, dp[len-1][i]);
        }

        System.out.println(answer);
    }
}