import java.util.HashMap;
import java.util.Map;

class p1845 {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        int count = 0;
        int divNum = nums.length / 2;

        for (Integer values : map.values()) {
            if (values != 0) count++;
        }
        return Math.min(count, divNum);
    }
}