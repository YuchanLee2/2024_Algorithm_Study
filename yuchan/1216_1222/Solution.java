import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Program> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            queue.offer(new Program(progresses[i], speeds[i]));
        }
        
        int day = 0;
        
        while (!queue.isEmpty()) {
            int count = 0;
            
            while (!queue.isEmpty() && queue.peek().progress + (queue.peek().speed * day) >= 100) {
                queue.poll();
                count++;
            }
            
            if (count > 0) {
                answer.add(count);
            }
            
            day++;
        }
        
        return answer;
    }
    
    class Program {
        int progress;
        int speed;
        
        Program(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }
    }
}
