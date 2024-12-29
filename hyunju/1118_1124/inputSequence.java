import java.util.*;
import java.io.*;

public class inputSequence{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt(); // 입력 개수 a
        int b = scanner.nextInt(); // 입력 크기 b
        String [] numbers = new String[a];
        int sum = 0;

        for (int i = 0; i < a; i++) {
           numbers[i] = scanner.next(); // 입력 
        }
    
        // 해당 문자열이을 3이면 3+2+1 합하여 각 문자열의 길이를 구함
        for (int j = 0; j < numbers.length; j++) {
         for (int k = 0; k < numbers[j].length(); k++) {
            int count = numbers[j].length();
            sum += count--;
         }   
         if(sum > b){
            

         }
        }
        scanner.close();
    }
}