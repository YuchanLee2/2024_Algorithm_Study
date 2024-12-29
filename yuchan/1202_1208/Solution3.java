import java.util.Arrays;

class Solution {
    public int[] solution(int n, int s) {
        if (n > s) {
            return new int[]{-1};
        }
        
        int[] result = new int[n];
        Arrays.fill(result, s / n);
        
        for (int i = 0; i < s % n; i++) {
            result[i]++;
        }
        
        Arrays.sort(result);
        return result;
    }
}
