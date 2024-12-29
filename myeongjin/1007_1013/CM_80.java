import java.io.*;
import java.util.*; 

public class CM_80 {   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    
      int n = sc.nextInt();
       int k = sc.nextInt();
       sc.nextLine(); // 줄 바꿈 문자 소비
    
       char[] alpha = sc.nextLine().trim().toCharArray();
       Arrays.sort(alpha);
    
       char[] pw = new char[k];
       generatePw(alpha, pw, k, 0);
    
      sc.close();
    }

    private static void generatePw(char[] alpha, char[] pw, int k, int depth) {
      if (depth == k) {
         System.out.println(new String(pw));
          return;
         }
    
       for (char c : alpha) {
          pw[depth] = c;
            generatePw(alpha, pw, k, depth + 1);
        }
    }
}