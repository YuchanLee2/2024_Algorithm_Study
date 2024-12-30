public class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        // 최소 직사각형 찾기
        // 가로 최소,

        for (int[] size : sizes) {
            int width = size[0];
            int height = size[1];

            // 눕힌것도 고려
            int larger = Math.max(width, height);
            int smaller = Math.min(width, height);
            
            maxWidth = Math.max(maxWidth, larger);
            maxHeight = Math.max(maxHeight, smaller);
        }

        return maxWidth * maxHeight;
    }
}
