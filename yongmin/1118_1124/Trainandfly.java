// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Trainandfly {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int z = Integer.parseInt(input[2]);

        // 계산
        double t = x / (2.0 * y); // 2.0으로 나눠서 실수형 계산
        int result = (int) (z * t); // 결과를 정수로 변환

        // 출력
        System.out.println(result);
    }
}

