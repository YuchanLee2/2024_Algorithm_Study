// don't place package name. 

import java.io.*;

import java.util.Scanner;

public class Chattering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 입력
        String[] firstInput = scanner.nextLine().split(" ");
        int k = Integer.parseInt(firstInput[1]); // k를 정수로 변환

        // 두 번째 입력
        String b = scanner.nextLine();

        // 결과 저장
        StringBuilder result = new StringBuilder();

        for (char ch : b.toCharArray()) {
            for (int i = 0; i < k; i++) {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
        scanner.close();
    }
}