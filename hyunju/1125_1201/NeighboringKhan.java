public class NeighboringKhan{
    public static void main(String[] args) {
        int h = 1;
        int w = 1;
        String [][] board;
        board = new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"},
         {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
  
        // Solution 클래스의 solution 메서드를 호출하여 이웃 셀 검사
        System.out.println(solution(board, h, w));  // (1,1) 위치에 대한 결과 출력
    }


 public static int solution(String[][] board, int h, int w) {
   int n = board.length;
        int count = 0;
        int[] dh = {0, 1, -1, 0}; 
        int[] dw = {1, 0, 0, -1};
        for(int i =0; i<4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            
            if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if(board[h][w].equals(board[h_check][w_check])) {
                    count ++;
                }
            }
        }
        return count;
    }
}