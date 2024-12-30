import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            String[] parts = operation.split(" ");
            String command = parts[0];
            int value = Integer.parseInt(parts[1]);

            if (command.equals("I")) {
                minHeap.add(value);
                maxHeap.add(value);
            } else if (command.equals("D")) {
                if (!minHeap.isEmpty()) {
                    if (value == 1) { // 최댓값 삭제
                        int max = maxHeap.poll();
                        minHeap.remove(max);
                    } else if (value == -1) { // 최솟값 삭제
                        int min = minHeap.poll();
                        maxHeap.remove(min);
                    }
                }
            }
        }

        if (minHeap.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxHeap.peek(), minHeap.peek()};
        }
    }
}
