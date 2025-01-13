import java.util.*;
class P42628 {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        ArrayList<Integer> s = new ArrayList();
        PriorityQueue<Integer> maxQ = new PriorityQueue(Collections.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue();

        for(String o : operations){
            String[] arr = o.split(" ");
            int num = Integer.parseInt(arr[1]);
            if(arr[0].equals("I")){
                maxQ.add(num); minQ.add(num);
                s.add(num);
            }else{
                if(num == -1)
                    maxQ.remove(minQ.poll());
                else
                    minQ.remove(maxQ.poll());
            }
        }
        answer[0] = maxQ.isEmpty() ? 0 : maxQ.peek();
        answer[1] = minQ.isEmpty() ? 0 : minQ.peek();
        return answer;
    }
}