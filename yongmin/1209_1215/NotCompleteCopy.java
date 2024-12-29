import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> partDict = new HashMap<>();

        // 딕셔너리 초기화 getOrDefault로 0으로 만들기
        for (String p : participant) {
            partDict.put(p, partDict.getOrDefault(p, 0) + 1); // 이름이 있으면 +1
        }

        // 완주한 사람 처리 (-1)
        for (String c : completion) {
            partDict.put(c, partDict.get(c) - 1);
        }

        // 값이 1인 사람(완주하지 못한 사람) 찾기
        for (String key : partDict.keySet()) {
            if (partDict.get(key) == 1) {
                answer = key;
            }
        }
        
        return answer;
    }
}
