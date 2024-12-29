// don't place package name. 

import java.io.*;
import java.util.*;

public class Gift {
    // 최대공약수(GCD)를 계산하는 메서드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 선물 종류의 개수
		int n = scanner.nextInt();
		scanner.nextLine();  // \n 처리

		//각 선물 종류별 개수
		String[] input = scanner.nextLine().split(" ");
		int[] present = new int[n];
		for (int i = 0; i < n; i++) {
			present[i] = Integer.parseInt(input[i]);
		}

		int x = present[0];
		for (int i = 1; i < n; i++) {
			x = gcd(x, present[i]);
		}

		System.out.println(x);

		scanner.close(); 
	}
}
