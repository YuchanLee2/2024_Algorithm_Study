class Solution {
    public int[] solution(int brown, int yellow) {
        int[] result = new int[2];
        
        int area = brown + yellow;
        
        int w;
        int h = 3;
        
        
        while (true) {
            if (area % h != 0) {
               
                h++;
                continue;
            }
            
        
            w = area / h;
            
           
            if ((w-2) * (h-2) == yellow) {
                return new int[] {w,h};
            }
            h++;
        }
       
}
}