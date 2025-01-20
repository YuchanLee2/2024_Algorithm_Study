import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        // 우선순위 큐 선언 - 큰 값이 먼저 나간다. 내림차순
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        // 우선순위 큐에 추가
        for (int i : priorities) {
            queue.offer(i);
        }

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 기존 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) { //location 0  
                // 현재 작업의 위치 찾기
                if (queue.peek() == priorities[i]) { // 9,1,1,1,1,1 > 1,1,9,1,1,1
                    queue.poll();
                    answer++;

                    // 현재 작업이 location과 같으면 answer 반환
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}