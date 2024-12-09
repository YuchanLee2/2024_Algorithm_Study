import java.util.*;

public class CM_49_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(arr);
        if (arr[2]>arr[1]+arr[0]+1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
