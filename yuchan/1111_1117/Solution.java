import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 1; t <= T; t++) {
            int testCaseNumber = sc.nextInt(); 
            int[] frequency = new int[101]; 
            
            
            for (int i = 0; i < 1000; i++) {
                int score = sc.nextInt();
                frequency[score]++;
            }

         
            int maxFrequency = 0;
            int mode = 0;
            for (int score = 0; score <= 100; score++) {
                if (frequency[score] > maxFrequency || 
                    (frequency[score] == maxFrequency && score > mode)) {
                    maxFrequency = frequency[score];
                    mode = score;
                }
            }

            // 결과 출력
            System.out.println("#" + testCaseNumber + " " + mode);
        }
    }
}
