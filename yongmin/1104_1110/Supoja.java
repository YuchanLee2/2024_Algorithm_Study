import java.util.*;
import java.util.stream.*;

class Supoja {
    public int[] solution(int[] answers) {
        
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = {0, 0, 0};

        // 각 수포자의 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (first[i % first.length] == answers[i]) scores[0]++;
            if (second[i % second.length] == answers[i]) scores[1]++;
            if (third[i % third.length] == answers[i]) scores[2]++;
        }

        // 최고 점수 계산
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 최고 점수를 받은 사람 찾기
        List<Integer> result = new ArrayList<>();
        if (scores[0] == maxScore) result.add(1);
        if (scores[1] == maxScore) result.add(2);
        if (scores[2] == maxScore) result.add(3);

        // 결과를 int[] 배열로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}