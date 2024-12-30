import java.util.*;
import java.io.*;
public class P_triangle {
// 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/43105
    public static void main(String[] args) {
        
    }

    public static int solution(int[][] triangle) {
        int answer = 0;
        
        int[][] dp=triangle;
        

        dp[0][0]=triangle[0][0]; // 처음 시작부분 =7
        
        for(int i =1; i<triangle.length; i++) {
        	for(int j =0; j<triangle[i].length; j++) {
        		
        		if(j==0) {
        			dp[i][j]=dp[i-1][0]+triangle[i][j]; //첫부분은 선택할 수없음
        		}
        		else if(j==dp[i].length-1) {
        			dp[i][j]=dp[i-1][dp[i-1].length-1]+triangle[i][j];
        		}
        		
        		
        		else {
        			
        			
        			int max= Math.max(dp[i-1][j-1],dp[i-1][j]);
        			
        			dp[i][j]=max+triangle[i][j];
        			
        		}
        	}

        }
        
        Arrays.sort(dp[triangle.length-1]);
        
        answer=dp[triangle.length-1][triangle.length-1];
        
        return answer;
    }
}
