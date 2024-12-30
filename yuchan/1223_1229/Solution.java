import java.util.*;
class Solution {
    static int count = 0;
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int spicy = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for(int temp : scoville)
        {
            queue.offer(temp);
        }
        while(!queue.isEmpty())
        {
            spicy = queue.poll();
            if(spicy<K)
            {
                if(queue.size() > 0)
                {
                    int sum = 0, spicy2 = 0;
                spicy2 = queue.poll();
                sum = swap(spicy,spicy2);
                queue.offer(sum);
                }
                else
                {
                    return -1;
                }
            }
        }
            answer = count;
            return answer;
        
        
    }
    int swap(int x1, int x2)
    {
        int swap_food = x1 + x2*2;
        count ++;
        return swap_food;
    }
}