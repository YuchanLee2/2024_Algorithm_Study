// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {

    // 진법 변환
    public static String solution(int n, int q) {
        StringBuilder revBase = new StringBuilder();

        while (n > 0) {
            int mod = n % q;
            revBase.append(mod);
            n /= q;
        }

        return revBase.reverse().toString();  // 역순
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] nums = scanner.nextLine().split(" ");
        
        int minSize = m;
        int resultBase = -1;
        
        // 10부터 62까지의 기수에 대해 변환
        for (int f = 10; f <= 62; f++) {
            List<String> newNums = new ArrayList<>();
            
            // 각 숫자에 대해 진법 변환
            for (String num : nums) {
                int number = Integer.parseInt(num);
                newNums.add(solution(number, f));
            }
            
            // 변환된 결과들의 길이 합 계산
            StringBuilder sizeBuilder = new StringBuilder();
            for (String str : newNums) {
                sizeBuilder.append(str).append(" ");
            }
            String size = sizeBuilder.toString().trim();
            
            // 크기가 최소보다 작으면 업데이트
            if (size.length() <= minSize) {
                minSize = size.length();
                resultBase = f;
                break;  // 가장 작은 길이를 찾으면 종료
            }
        }
        System.out.println(resultBase);
        
        scanner.close();
    }
}
