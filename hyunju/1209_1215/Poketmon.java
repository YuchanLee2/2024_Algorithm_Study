import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Poketmon {
    public static void main(String[] args) {
        // n 마리의 포켓몬 중 n/2마리를 가져감
        // 포켓몬의 종류 nums[]
        // 가장 많은 종류의 포켓몬을 선택하는 방법 return
        // nums의 중복을 없앤 수가 n/2보다 작다면 그대로 return
        // nums의 중복을 없앤 수가 n/2보다 크다면 n/2를 return

        int answer = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 포켓몬 마리
        String num = sc.next();

        int[] nums = new int[num.length()];
        String[] numString = num.split("");
            for (int i = 0; i < num.length(); i++) {
                nums[i] = Integer.parseInt(numString[i]);
            }

        answer = solution(n, nums);
        System.out.println(answer);
    }

    private static int solution(int n, int[] nums) {

        int P = n/2; //가져 갈 수 있는 포켓몬 수
        Set<Integer> setP = new HashSet<>();
        for (int p : nums) {
            setP.add(p);
        }
        return Math.min(setP.size(), P);
    }


}
