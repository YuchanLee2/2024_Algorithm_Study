import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            Integer currentCount = map.get(player);
            if (currentCount == null) {
                map.put(player, 1);
            } else {
                map.put(player, currentCount + 1);
            }
        }
        for(String player : completion)
        {
            Integer currentCount = map.get(player);
            if(!(currentCount == null))
            {
                map.put(player,currentCount-1);
            }
        }
        for(String player : participant)
        {
            Integer currentCount = map.get(player);
            if(currentCount > 0)
            {
                return player;
            }
        }
        return "";
    }
}