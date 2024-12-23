import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> list = new ArrayList<>(); // 각 배포당 기능 count
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) { // 진행척도(100-현재 진행) / 속도
                q.add((100 - progresses[i]) / speeds[i]);
            } else {
                q.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

    int x = q.poll(); // 첫 번째 작업의 완료 일수 (7일)
    int count = 1;    // 첫 번째 작업 포함
    while (!q.isEmpty()) {
        if (x >= q.peek()) {  // 다음 작업이 이전 작업과 함께 배포 가능
            count++;
            q.poll();
        } else {              // 다음 작업은 새로운 묶음 시작
            list.add(count);
            count = 1;
            x = q.poll();
        }
    }
    list.add(count);  // 마지막 묶음 추가


        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}