
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0, i = 0;
        Queue<sub>queue = new LinkedList<>();
        if(s.charAt(i) == '(')
        {
            queue.offer(new sub(s.charAt(i), 1));
        }
        else
        {
            return false;
        }
        while(!queue.isEmpty())
        {
            sub temp = queue.poll();
            count = temp.count;
            if(i<s.length()-1)
            {
                i++;
            }
            else
            {
                break;
            }
            if(s.charAt(i) == '(')
            {
                queue.offer(new sub(s.charAt(i), temp.count+1));
                
            }
            if(s.charAt(i) == ')')
            {
                queue.offer(new sub(s.charAt(i), temp.count-1));
            }
            if(temp.count < 0)
            {
                return false;
            }
        }
        if(count == 0)
        {
            return answer;
        }
        else{
            return false;
        }
    }
}
class sub{
     char temp;
     int count;
    sub(char temp, int count)
    {
        this.temp = temp;
        this.count = count;
    }
}


// 저장