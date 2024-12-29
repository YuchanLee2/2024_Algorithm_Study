// don't place package name. 

import java.io.*;

import java.util.*; 


// don't change 'Main' class name and  'public' accessor. 

public class inputPhoneNumber {
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in);
        
        // 입력값 읽기
        String input = scanner.nextLine();
        
        // 전화번호 형식 검증
        if (isValidPhoneNumber(input)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        
        scanner.close();
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        // 정규 표현식: 010-XXXX-XXXX 형식 확인
        return phoneNumber.matches("010-\\d{4}-\\d{4}");
    }
    
    
}