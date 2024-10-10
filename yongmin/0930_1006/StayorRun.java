import java.util.Scanner;

public class StayorRun {
    public static void main(String[] args) {
        // 스캐너를 이용해 입력을 받기 위한 객체를 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 숫자를 입력받음
        int day_num = scanner.nextInt();

        // 입력된 숫자가 1, 3, 5, 7 중 하나인지 확인
        if (day_num == 1 || day_num == 3 || day_num == 5 || day_num == 7) {
            // 해당되는 경우 "RUN" 출력
            System.out.println("RUN");
        } else {
            // 해당되지 않는 경우 "STAY" 출력
            System.out.println("STAY");
        }

        // 스캐너를 닫음 (자원 해제)
        scanner.close();
    }
}
