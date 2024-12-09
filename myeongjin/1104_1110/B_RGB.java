import java.util.*;
import java.io.*;
public class B_RGB{
// 문제 링크 : https://www.acmicpc.net/problem/1149
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();

		int [][] arr= new int [N][3];
		int [][] dp= new int [N][3];
		
		for (int i =0; i<N; i++) {

			arr[i][0]=sc.nextInt(); //r
			arr[i][1]=sc.nextInt(); //g
			arr[i][2]=sc.nextInt();// b
			
		}
		
		
		for(int i =1; i<N; i++) {
			arr[i][0]+= Math.min(arr[i-1][2],arr[i-1][1]); //b와 g 비교
			arr[i][1]+= Math.min(arr[i-1][0],arr[i-1][2]); //b와 g 비교
			arr[i][2]+= Math.min(arr[i-1][0],arr[i-1][1]); //b와 g 비교

		}
		
		System.out.println(Math.min(Math.min(arr[N-1][0],arr[N-1][1]), arr[N-1][2]));
	}
}
