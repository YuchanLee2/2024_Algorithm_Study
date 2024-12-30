import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 전체 작업 완료 시간을 저장하는 변수
        int totalTime = 0;

        // 현재 시간
        int currentTime = 0;

        // 현재 처리된 작업의 개수를 추적
        int completedJobs = 0;

        // 작업들을 처리하기 위해 작업 소요 시간을 기준으로 우선순위 큐 생성
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        // 작업들을 요청 시간에 따라 정렬
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // 작업 배열 인덱스
        int jobIndex = 0;

        // 모든 작업이 처리될 때까지 반복
        while (completedJobs < jobs.length) {
            // 현재 시간 이전에 요청된 작업들을 우선순위 큐에 추가
            while (jobIndex < jobs.length && jobs[jobIndex][0] <= currentTime) {
                queue.add(jobs[jobIndex++]);
            }

            // 현재 처리 가능한 작업이 없다면 시간을 다음 작업의 요청 시간으로 업데이트
            if (queue.isEmpty()) {
                currentTime = jobs[jobIndex][0];
            } else {
                // 가장 짧은 작업을 우선적으로 수행
                int[] currentJob = queue.poll();

                // 현재 시간에 작업 소요 시간을 더하여 작업 완료 시간 계산
                currentTime += currentJob[1];

                // 해당 작업의 요청 시간부터 완료 시간까지 걸린 시간 추가
                totalTime += currentTime - currentJob[0];

                // 완료된 작업 수 증가
                completedJobs++;
            }
        }

        // 평균 시간을 구하여 반환
        return totalTime / jobs.length;
    }
}
