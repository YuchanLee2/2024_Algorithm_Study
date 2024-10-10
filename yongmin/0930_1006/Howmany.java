import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Howmany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        HashMap<Character, Integer> numCounts = new HashMap<>();
        for (char i = '0'; i <= '9'; i++) {
            numCounts.put(i, 0); // 값 초기화, put으로 key value 입력
        }

        for (int i = 1; i <= N; i++) {
            String number = Integer.toString(i);
            for (char key : numCounts.keySet()) { //dict의 키만 가져오기
                int count = 0;
                for (char digit : number.toCharArray()) {
                    if (digit == key) {
                        count++;
                    }
                }
                numCounts.put(key, numCounts.get(key) + count);
            }
        }

        for (char key = '0'; key <= '9'; key++) {
            System.out.print(numCounts.get(key) + " ");
        }
    }
}