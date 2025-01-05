import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] it : commands)
        {
            int count = it[0]-1;
            int i = 0;
            int[] temp = new int[it[1]-it[0]+1];
            while(count<=it[1]-1)
            {
                temp[i] = array[count];
                count++;
                i++;
            }
            Arrays.sort(temp);
            list.add(temp[it[2]-1]);
        }
        
        int[] answer = new int[commands.length];
        for(int i = 0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}