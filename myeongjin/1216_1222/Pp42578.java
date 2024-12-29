import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pp42578 {
    public static ArrayList<Integer> solution(int[] progresses, int[] speeds) {

        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<progresses.length; i++) {

            q.add((int)Math.ceil((100.0-progresses[i])/speeds[i]));

        }

        int check=q.poll(); //7
        int count=1;

        ArrayList<Integer> result = new ArrayList<>();
        while(!q.isEmpty()) {

            if(check>=q.peek()) { //7과 3 비교
                count++; // 카운트 증가
                q.poll(); // 3 빼냄
            }
            else { // 9를 만남

                result.add(count); // 현재 카운트를 넣음
                // 초기화
                System.out.println(count);

                count=1;
                check=q.poll();
            }


        }

        result.add(count);




        return result;



    }
}