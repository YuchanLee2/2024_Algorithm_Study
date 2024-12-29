import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int len = number.length() - k;
        int start = 0;

        for (int i = 0; i < len; i++) {
            char max = '0';
            for (int j = start; j <= k + i; j++) {
                if (number.charAt(j) > max) {
                    max = number.charAt(j);
                    start = j + 1;
                }
            }
            answer.append(max);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("1924", 2));       // Expected: "94"
        System.out.println(sol.solution("1231234", 3));    // Expected: "3234"
        System.out.println(sol.solution("4177252841", 4)); // Expected: "775841"
    }
}
