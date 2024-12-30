import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(String s : phone_book)
        {
            for(String st : phone_book)
            {
                int s_size = s.length()+1;
                if(!st.equals(s)&&st.contains(s.substring(0,s_size)))
                {
                    return false;
                }
            }
        }
        System.out.println(Arrays.toString(phone_book));
        return answer;
    }
}