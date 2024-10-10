import java.io.*;

import java.util.*; 
public class CM_25 {
    public static void main(String[] args) throws IOException { 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        Set<String> word = new HashSet<>(); // 중복 제거 Set

        for (int i = 0; i < n; i++) {
            String cur = sc.next();
            word.add(cur); 
        }
        List<String> arr = new ArrayList<>(word);

        // 길이가 같을 경우 사전순으로 정렬
        Collections.sort(arr, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
