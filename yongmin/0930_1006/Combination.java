// don't place package name. 

import java.io.*;

import java.util.*; 

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int R = scanner.nextInt();

        // nCr = n! / (n-r)!r!
        long over = 1;
        long under1 = 1;
        long under2 = 1;

        for (int n = N; n > 0; n--) {
            over *= n;
        }

        for (int r = N - R; r > 0; r--) {
            under1 *= r;
        }

        for (int r = R; r > 0; r--) {
            under2 *= r;
        }

        // 최종 계산
        long result = over / (under1 * under2);
        System.out.println(result);
    }
}