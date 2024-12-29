import java.util.*;
class P42627 {
    public int solution(int[][] jobs) {
        int answer = 0;
        Queue<int[]> q = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        int idx=0, time=jobs[0][0];
        while(idx < jobs.length || !q.isEmpty()){
            while(idx<jobs.length && jobs[idx][0] <= time){
                q.add(jobs[idx++]);
            }
            if(q.isEmpty()){
                time = jobs[idx][0];
                q.add(jobs[idx++]);
            }
            int[] work = q.poll();
            time += work[1];
            answer += time-work[0];
        }
        return answer/jobs.length;
    }
}