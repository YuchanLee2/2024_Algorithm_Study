import java.io.*;
import java.util.*;

public class Main {
    public static long combination(int n, int k) {
        if (k < 0 || k > n) return 0;
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n - (k - i);
            result /= i;
        }
        return result;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int S = K / 100;
        
        if ((N + S) % 2 != 0 || Math.abs(S) > N) {
            System.out.println(0);
        } else {
            int x = (N + S) / 2;
            if (x < 0 || x > N) {
                System.out.println(0);
            } else {
                System.out.println(combination(N, x));
            }
        }
    }
}
