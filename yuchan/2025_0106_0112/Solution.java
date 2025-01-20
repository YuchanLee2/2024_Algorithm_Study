class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow; 

        for (int height = 3; height <= total / height; height++) {
            if (total % height == 0) { 
                int width = total / height; 
                if ((width - 2) * (height - 2) == yellow) { 
                    return new int[]{width, height}; 
                }
            }
        }
        return new int[0]; 
    }
}