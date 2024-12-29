import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int me;
        int[] arr = new int[n];

        String[] inputs = br.readLine().split(" ");
        
        me = Integer.parseInt(inputs[0]);

        for (int i = 1; i < n; i++) {
            arr[i - 1] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(arr); // 1 단 정렬을 해.
        // => 맨 마지막 친구가 제일 큰 경쟁자임
        // 내 지지자와 쟤네 지지자 사이 어딘가에 타협지점이 있음
        // => 이분 탐색? (10^9승이면 진짜 쭉 돌라는 의도는 아님. 반씩 나눠서 보는 발상이 맞을듯)

        int left = 0;
        int right = Integer.MAX_VALUE / 2; // 크게 크게
        int mid;

        while (left < right) {
            mid = (left + right) / 2;

            int persuaded = 0;
            int cur = me + mid;

            for (int i = arr.length - 1; i >= 0; i--) {
                persuaded += Math.max(0, arr[i] - cur + 1);
                if (persuaded > mid)
                    break;
            }

            if (persuaded <= mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        System.out.print(left);
    }
}