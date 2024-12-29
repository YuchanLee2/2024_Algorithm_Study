import java.io.IOException;
import java.util.*;

public class CM_92{
    public static void main(String[] args) throws IOException { 

    //         4
    // 0 1 2 1
    // 1 0 3 2
    // 1 5 0 4
    // 2 3 3 0
    ///XXXX 패스
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int map[][]=new int[n][n];
        int dp[][]=new int[n][n];
        for(int i =0; i<n; i++){
            for (int j=0; j<n; j++){
                map[i][j]=sc.nextInt();
            }
        }
        int result=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + "행 " + j + "열");
                if (i == n - 1 && j == n - 1) { // 마지막 줄이면서 끝부분일때 상 좌
                    dp[i][j] = (map[i][j] + (i > 0 ? map[i - 1][j] : 0)) - (map[i][j] + (j > 0 ? map[i][j - 1] : 0));
                } else if (j == n - 1) { // 끝 부분에 다다랐을때 하 우
                    dp[i][j] = (map[i][j] + (i < n - 1 ? map[i + 1][j] : 0)) - (map[i][j] + (j < n - 1 ? map[i][j + 1] : 0));
                } else if (i == n - 1) { // 마지막 줄일때 상 우
                    dp[i][j] = (map[i][j] + (j < n - 1 ? map[i][j + 1] : 0)) - (map[i][j] + (i < n - 1 ? map[i + 1][j] : 0));
                } else { // 그냥 부분은 하 우
                    dp[i][j] = (map[i][j] + (j < n - 1 ? map[i][j + 1] : 0)) - (map[i][j] + (i < n - 1 ? map[i + 1][j] : 0));
                }
                result = Math.min(result, dp[i][j]);
            }
        }

        System.out.println(result); 

    }
}