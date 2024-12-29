import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int size = nums.length/2;
        Set<Integer> hash = new HashSet<>();
        for(int value : nums)
        {
            hash.add(value);
        }
        int answer = hash.size();
        if(answer == size)
        {
            return answer;
        }
        else if(answer > size)
        {
            return size;
        }
        else
        {
            return answer;
        }
    }
}