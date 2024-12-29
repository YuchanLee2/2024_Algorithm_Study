import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String prefix = br.readLine(); // 앞 네자리
        String serial = br.readLine(); // 일련번호
        String checkDigitStr = br.readLine(); // 오류번호
        
        int givenCheck = Character.getNumericValue(checkDigitStr.charAt(0));
        
        // 구분 저장(상업, 민법, 특수, 외국, etc)
        boolean[] types = new boolean[5];
        
        int A_const = 0; // 홀
        int B_const = 0; // 짝
        
        for(int j = 0; j < 4; j++) {
            int digit = Character.getNumericValue(prefix.charAt(j));
            if((j + 1) % 2 == 1) {
                A_const += digit;
            } else {
                B_const += digit;
            }
        }
        
        for(int j = 0; j < 6; j++) {
            int digit = Character.getNumericValue(serial.charAt(j));
            int pos = j + 7; // positions 7 to 12
            if(pos % 2 == 1) {
                A_const += digit;
            } else {
                B_const += digit;
            }
        }
        
        // 가능한거 싹 돌기
        for(int i = 0; i <= 99; i++) {
            String clsStr = String.format("%02d", i); // 이거 쓰면 숫자를 저 포맷으로 만들어줌.
    
            int A = A_const; // 홀
            int B = B_const; // 짝
            
            // Positions 5 and 6 (from clsStr)
            int digit5 = Character.getNumericValue(clsStr.charAt(0)); // Position 5
            int digit6 = Character.getNumericValue(clsStr.charAt(1)); // Position 6
            
            A += digit5; // Position 5 is odd
            B += digit6; // Position 6 is even
            
            int R = (2 * B + A) % 10;
            int expectedCheckDigit = 10 - R;
            if(expectedCheckDigit == 10) expectedCheckDigit = 0;
            
            if(expectedCheckDigit == givenCheck) {
                if(i >= 11 && i <= 15) {
                    types[0] = true;
                }
                if(i >= 21 && i <= 22) {
                    types[1] = true;
                }
                if(i >= 31 && i <= 51) {
                    types[2] = true;
                }
                if(i >= 81 && i <= 86) {
                    types[3] = true;
                }
                if(i == 71) {
                    types[4] = true;
                }
            }
        }
        
        for(int i = 0; i < 5; i++) {
            System.out.print(types[i] ? 'O' : 'X');
        }
    }
}
