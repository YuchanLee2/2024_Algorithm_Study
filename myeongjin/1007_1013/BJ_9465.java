import java.util.*;

public class BJ_9465 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tc=sc.nextInt();
		
		for ( int t=0; t<tc; t++) { // 테스트 케이스 



			
			int N =sc.nextInt();
			
			int [][] arr= new int [2][N+1] ; //스티커 배열
			int [][] dp= new int [2][N+1] ; // 결과를 누적할 배열
					
			for ( int i =0; i <=1; i++) {  // 배열 값 입력
				for ( int j =1; j <=N; j++) {
					arr[i][j]=sc.nextInt();	
				}
			}
			dp[0][1]=arr[0][1]; // 초기값
			dp[1][1]=arr[1][1]; //

			int result=Math.max(dp[0][1], dp[1][1]);
			
			for ( int i = 2; i<=N; i++) {
				dp[0][i]=Math.max(dp[1][i-1], dp[1][i-2])+arr[0][i];
				dp[1][i]=Math.max(dp[0][i-1], dp[0][i-2])+arr[1][i];
				// 대각선칸과
				// 대각선 전칸의 지금까지 누적합을 비교함.
				
				

			}
			result = Math.max(dp[0][N], dp[1][N]); // 마지막 누적된 값들을 비교
			System.out.println(result);
			
		}
		
		
		
	}

}
