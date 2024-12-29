import java.util.*;
import java.io.*;
public class Solutions {

    public static void main(String[] args) {
        int[] diffs = {3, 5, 2};
        int[] times = {2, 4, 1};
        int limit = 20;
        
        int result = solution(diffs, times, limit);
        System.out.println("최소 숙련도: " + result);
    }

    public static int solution(int[] diffs, int[] times, long limit) {
        int maxLevel = 0;
        int minLevel=0;
        for(int d:diffs){
            maxLevel=Math.max(maxLevel,d);
        }
        int answer= maxLevel;

        // 이진 탐색
        while(minLevel<=maxLevel){
            int midLevel=(minLevel+maxLevel)/2;
            long totalTime=calTime(diffs,times,midLevel);

            if(totalTime<=limit){
                answer = midLevel;
                maxLevel = midLevel -1; // 더 낮은 숙련도
            }
            else{
                minLevel = midLevel+1; // 더 높은 숙련도 필요
            }

        }

        return answer;
    }

    private static long calTime(int[] diffs, int[] times, int level) {
        // TODO Auto-generated method stub
        long totalTime =0;
        int prevTime=0;

        for(int i=0; i<diffs.length; i++){
            int diff=diffs[i];
            int timeCur= times[i];

            if(diff<=level){
                totalTime +=timeCur;//난이도가 같거나 낮으면 안틀림
            }
            else{
                int miss = diff-level; // 차이나는 정도를 기입
                totalTime+=miss *(timeCur +prevTime)+ timeCur;// 틀린 횟수에 대한 시간
            }
            prevTime=timeCur;// 현재 퍼즐 소요 시간을 이전 퍼즐 시간으로 업데이트
            // 다음 단계로 넘어가니까 현재 시간이 이전시간이 되겠지
        }
        return totalTime;
    }
}
