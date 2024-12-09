import java.io.*;
import java.util.*; 

public class chattering {

    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt(); // 문자열의 길이
        int b = scanner.nextInt(); // 채터링 횟수

        scanner.nextLine(); // nextInt() 후에 남은 줄바꿈 문자를 처리하기 위해 호출


        String words = scanner.nextLine(); //입력받은 문자열


        //1. 문자열의 길이만큼 문자열 입력받기
        //2. 들어오는 문자열을 CharAt(i)로 구분하여 채터링 횟수만큼 출력하게 하기
        for (int i = 0; i < a; i++) {
            for(int j =0; j <b; j++){
            System.out.print(words.charAt(i));
            }
        
        }

        scanner.close();

    }
}
