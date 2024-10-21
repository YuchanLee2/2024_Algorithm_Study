// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Steps {
    public static void main(String[] args) throws IOException { 

        Scanner sc = new Scanner(System.in);
        
        // N과 K 입력받기
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        
        // remain 계산
        int remain = K - N;
        int steps = 0;
        
        // 3으로 나눈 몫을 steps에 추가
        steps += remain / 3;
        
        // remain % 3에 따른 조건 처리
        if (remain % 3 == 2) {
            steps += 2;
        } else if (remain % 3 == 1) {
            steps += 3;
        } else {
            steps += 0; // 아무것도 하지 않음
        }
        
        // 결과 출력
        System.out.println(steps);
        
        sc.close();

    }
}