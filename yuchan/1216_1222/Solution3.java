import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(priorities[i], i));
        }

        List<Integer> sortedPriorities = new ArrayList<>();
        for (int priority : priorities) {
            sortedPriorities.add(priority);
        }
        Collections.sort(sortedPriorities, Collections.reverseOrder());

        int executeOrder = 0;

        for (int priority : sortedPriorities) {
            while (!queue.isEmpty()) {
                Process current = queue.poll();
                if (current.priority == priority) {
                    executeOrder++;
                    if (current.location == location) {
                        return executeOrder;
                    }
                    break;
                } else {
                    queue.offer(current);
                }
            }
        }

        return -1;
    }
}

class Process {
    int priority;
    int location;

    Process(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}
