// import java.io.*;
// import java.util.*; 
// public class CM_60 {
//     public static void main(String[] args) throws IOException { 
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt(); 

//         // 홀수인 경우 예외 처리
//         if (n % 2 != 0) {
//             System.out.println(0);
//             return;
//         }
//         // dp 배열 초기화
//         long[] dp = new long[n + 1];
//         dp[0] = 1; 
//         dp[1] = 0; 
//         dp[2] = 3; 
//         dp[4] = 11; 
//         // dp 배열 계산
//         for (int i = 2; i <= n; i += 2) {
//             dp[i] = dp[i - 2] * 3; 
//             if (i >= 4) {
//                 dp[i] += dp[i - 4] * 2; 
//             }
//         }
//         System.out.println(dp[n]);
//     }
// }