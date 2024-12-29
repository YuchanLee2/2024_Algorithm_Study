import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> sizeCount = new HashMap<>();
        
        // 각 크기의 귤 개수 세기
        for (int size : tangerine) {
            sizeCount.put(size, sizeCount.getOrDefault(size, 0) + 1);
        }

        // 개수가 많은 순서대로 정렬
        ArrayList<Integer> counts = new ArrayList<>(sizeCount.values());
        Collections.sort(counts, Collections.reverseOrder());
        
        int answer = 0;
        int total = 0;

        // 개수가 많은 귤부터 선택하여 k개가 될 때까지 반복
        for (int count : counts) {
            total += count;
            answer++;
            if (total >= k) break;
        }
        
        return answer;
    }
}
