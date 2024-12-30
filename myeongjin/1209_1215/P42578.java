import java.util.HashMap;
import java.util.Map;

class P42578 {
    public static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for(int i =0; i<clothes.length; i++) {

            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);

        }
        int count=1;

        for (Integer values : map.values()) {
            count *= values +1;
        }


        return count-1;
    }
}