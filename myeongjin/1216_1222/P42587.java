import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class P42587 {
    public static int solution(int[] priorities, int location) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        // 우선순위 큐에 우선순위 요소 추가
        for (int i : priorities) {
            pq.add(i); // 2 1 3 2 이렇게
        }

        // 큐가 빌 때까지 반복
        while (!pq.isEmpty()) { // 3 2 2 1 이렇게 저장됨
            // 기존 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) { // 배열 순회
                // 현재 작업의 위치 찾기
                if (pq.peek() == priorities[i]) { //만약 제일 앞에 있는 수가 3 , 그리고
                    // 배열을 조사했는데 2번째에 위치한 수가 일치 한 3과 일치한 상황일 때 ?
                    // 수를 꺼내고 , 카운트 추가
                    pq.poll();
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