import java.util.HashSet;

public class Solution {
    public static int solution(int[] nums) {
        int answer = 0;

        // nums 배열에서 고유한 숫자를 저장할 HashSet 생성
        HashSet<Integer> categories = new HashSet<>();
        for (int num : nums) {
            categories.add(num);  // set으로 중복 제거
        }

        // nunique와 배열의 절반 길이 중 작은 값을 선택
        if (categories.size() >= nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = categories.size();
        }

        return answer;
    }
}