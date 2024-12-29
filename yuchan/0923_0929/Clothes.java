import java.util.*;

class clothes{
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> map = new HashMap<>();
        for(String[] st : clothes)
        {
            String type = st[1];
            if(map.get(type) == null)
            {
                map.put(type,1);
            }
            else
            {
                int count = map.get(type);
                map.put(type,count+1);
            }
        }
        for(String st : map.keySet())
        {
            int count = map.get(st);
            answer *= (count+1);
        }
        return answer-1;
    }
}