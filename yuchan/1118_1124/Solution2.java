import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        Map<String, Integer> windowMap = new HashMap<>();
        for (int i = 0; i < days && i < discount.length; i++) {
            windowMap.put(discount[i], windowMap.getOrDefault(discount[i], 0) + 1);
        }

        if (checkMatch(wantMap, windowMap)) {
            answer++;
        }

        for (int i = days; i < discount.length; i++) {
            String removeItem = discount[i - days];
            windowMap.put(removeItem, windowMap.get(removeItem) - 1);
            if (windowMap.get(removeItem) == 0) {
                windowMap.remove(removeItem);
            }

            String addItem = discount[i];
            windowMap.put(addItem, windowMap.getOrDefault(addItem, 0) + 1);

            if (checkMatch(wantMap, windowMap)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean checkMatch(Map<String, Integer> wantMap, Map<String, Integer> windowMap) {
        for (String key : wantMap.keySet()) {
            if (windowMap.getOrDefault(key, 0) < wantMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}
