import java.util.Scanner;

public class Main_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int index = 0;
        while (N % 5 == 0) {
            N /= 5;
            index++;
        }
        N *= Math.pow(2, index * 2);

        int index2 = 0;
        while (N % 3 == 0) {
            N /= 3;
            index2++;
        }
        N *= Math.pow(2, index2);

        // N이 0이거나 1이 아닌 경우 처리
        if (N <= 0) {
            System.out.println(-1);
            return;
        }

        double index3 = Math.log(N) / Math.log(2);
        if (index3 % 1 == 0) {
            System.out.println((int)(index + index2 + index3));
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }
}
