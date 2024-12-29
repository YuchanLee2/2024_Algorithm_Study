import java.util.PriorityQueue;

class P42626 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0; i<scoville.length; i++) {

            pq.add(scoville[i]);
        }
        int cur=0;
        do {
            cur = pq.poll(); // 큐에서 cur을 가져옴
            if (cur >= K)
                return answer;
            }
            if(!pq.isEmpty()) {
                int plus = pq.poll();
                pq.add(cur + (plus * 2));
                answer++;
            }
        } while (!pq.isEmpty()); // 큐가 비어있지 않으면 반복
        return -1;
    }

}