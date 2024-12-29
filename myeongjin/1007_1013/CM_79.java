import java.io.*;
import java.util.*; 

public class CM_79 {   
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); // 줄 바꿈 문자 소비
        
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        
        // 순열 생성
        List<String> p = new ArrayList<>();
        permute(words, 0, n, p);
        
        boolean found = false;
        for (String word : p) {
            if (isPd(word)) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("NO");
        }
        
        sc.close();
    }
    
    private static void permute(String[] arr, int start, int n, List<String> results) {
        if (start == n - 1) {
            StringBuilder sb = new StringBuilder();
            for (String str : arr) {
                sb.append(str);
            }
            results.add(sb.toString());
            return;
        }
        
        for (int i = start; i < n; i++) {
            swap(arr, start, i);
            permute(arr, start + 1, n, results);
            swap(arr, start, i); // 원래대로 되돌리기
        }
    }
    
    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean isPd(String word) {
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}