import java.io.*;
import java.util.*;

public class CM_54 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> stores = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            stores.add(new int[]{sc.nextInt(), sc.nextInt()});
        }
        
        int l = sc.nextInt();
        int p = sc.nextInt();
        stores.add(new int[]{l, 0});
        
        List<int[]> full = new ArrayList<>();
        full.add(new int[]{0, p});
        int pre = 0;
        Collections.sort(stores, Comparator.comparingInt(a -> a[0]));
        
        for (int[] s : stores) {
            if (s[0] > l) break;
            List<int[]> tempFull = new ArrayList<>(full);
            full.clear();
            int diff = s[0] - pre;
            int[] maxE = new int[n + 2];
            int b = s[1]; // b를 현재 스토어의 두 번째 값으로 설정

            for (int[] v : tempFull) {
                int visits = v[0];
                int e = v[1];
                
                if (diff <= e) {
                    if (maxE[visits] < e - diff) {
                        maxE[visits] = e - diff;
                        full.add(new int[]{visits, e - diff});
                    }
                    if (maxE[visits + 1] < e - diff + b) {
                        maxE[visits + 1] = e - diff + b;
                        full.add(new int[]{visits + 1, e - diff + b});
                    }
                }
            }
            pre = s[0];
        }

        int result = full.stream().mapToInt(f -> f[0]).min().orElse(-1);
        System.out.println(result);
    }
}
