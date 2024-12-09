import java.util.Arrays;
import java.util.Scanner;

public class CM_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] visit = new int[n];
        
        for (int i = 0; i < n; i++) {
            visit[i] = sc.nextInt();
        }
        
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;
        
        for (int i = 0; i <= n - k; i++) {
            int curSum = 0;
            for (int j = i; j < i + k; j++) {
                curSum += visit[j];
            }
            if (curSum > maxSum) {
                maxSum = curSum;
                maxIndex = i + 1; 
            }
        }
        
        System.out.println(maxIndex);
    }
}