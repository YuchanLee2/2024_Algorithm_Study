import java.io.*;
import java.util.*; 

public class trainAndfly {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int x= scanner.nextInt(); // x킬로미터 떨어진 철로 거리

        int y = scanner.nextInt(); // 두 대의 기차 속도 y

        int z = scanner.nextInt(); // 파리의 속력 z
        // 시 = 거 / 속
        // 두 기차가 충돌 할 때 까지 파리가 이동한 거리
        // 파리의 이동거리 =  파리의 속도 * 파리가 이동한 시간
        // 파리가 이동한 시간 = 열차가 충돌한 시간
        // 열차 충돌 시간 =  거리 x / 속력은 2개의 기차라 2y 즉, x/2y

        //결과적으로 : 파리 이동시간 = z * (x/2y)
        double train_time = (double)x / (2*y);
        double fly_time = z * train_time;
        System.out.println((int)fly_time);

        scanner.close();
    }
}