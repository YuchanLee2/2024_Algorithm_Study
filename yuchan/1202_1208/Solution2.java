import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            pq.add(work);
        }

        while (n > 0 && !pq.isEmpty()) {
            int maxWork = pq.poll();
            if (maxWork > 0) {
                pq.add(maxWork - 1);
            }
            n--;
        }

        long result = 0;
        while (!pq.isEmpty()) {
            int remainingWork = pq.poll();
            result += (long) remainingWork * remainingWork;
        }

        return result;
    }
}
