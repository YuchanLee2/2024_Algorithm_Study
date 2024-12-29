
import java.util.HashMap;

public class MarathonRunner {
    public static void main(String[] args) {
        Solution_marathon sol = new Solution_marathon();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(sol.solution(participant, completion));
    }
}

class Solution_marathon {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key; // 카운트가 1 이상인 이름 반환
            }
        }

        return ""; // 이 줄은 실행되지 않음
    }
}
