import java.util.HashSet;
import java.util.Set;

// 프로그래머스 로또 최고 순위와 최저 순위 
public class Lottery {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1}; // 순위 매핑 (2개 맞춰야 5등)
        int len_0 = 0; // 알아볼 수 없는 번호 개수
        
        // 알아볼 수 없는 번호 (0) 개수 세기
        for (int lotto : lottos) {
            if (lotto == 0) len_0++;
        }
        
        // 당첨되지 않은 번호 계산
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }
        
        int minMatch = 0;
        for (int lotto : lottos) {
            if (winSet.contains(lotto)) {
                minMatch++;
            }
        }

        int maxMatch = minMatch + len_0;
        
        // 결과 반환 (최고 순위, 최저 순위)
        return new int[]{rank[maxMatch], rank[minMatch]};
    }
}