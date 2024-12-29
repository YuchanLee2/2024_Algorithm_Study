import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution3 {
    public int[] solution(String msg) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> dictionary = new HashMap<>();
        int dictSize = 26;

        for (int i = 0; i < 26; i++) {
            dictionary.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        int idx = 0;
        while (idx < msg.length()) {
            String w = "";
            while (idx < msg.length() && dictionary.containsKey(w + msg.charAt(idx))) {
                w += msg.charAt(idx);
                idx++;
            }
            result.add(dictionary.get(w));
            if (idx < msg.length()) {
                dictionary.put(w + msg.charAt(idx), ++dictSize);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
