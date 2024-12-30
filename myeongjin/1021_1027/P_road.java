import java.util.*;
import java.io.*;
public class P_road {
// 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42898
    public static void main(String[] args) {
        
    }

    public static int solution(int m, int n, int[][] puddles) {

    	
        int dp[][]= new int[m+1][n+1];
        
        int t = 1_000_000_007;
        
        for(int [] temp: puddles) {
        	dp[temp[0]][temp[1]] = -1;
        }
        
        dp[1][1]=1;
        
        for(int i =1; i<=m; i++) {
        	for( int j=1; j<=n; j++) {
        		if(dp[i][j]==-1) {
        			continue;
        		}
        		

        		
        		if(dp[i-1][j]>0) {
        			dp[i][j]= (dp[i][j]+dp[i-1][j])%t;
        			}
        		if(dp[i][j-1]>0) {
        			dp[i][j]= (dp[i][j]+dp[i][j-1])%t;
        			}
        		
        		
        	}
        	
        }
        
        
        
        
        
        return dp[m][n];
        
        
        
    }
}
