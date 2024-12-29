import java.io.*;
import java.util.*;

public class Bubinnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String a2 = sc.next();
        String a3 = sc.next();

        int even = 0;
        for (int i = 1; i < a1.length(); i += 2) {
            even += Character.getNumericValue(a1.charAt(i));
        }
        for (int i = 1; i < a2.length(); i += 2) {
            even += Character.getNumericValue(a2.charAt(i));
        }

        int odd = 0;
        for (int i = 0; i < a1.length(); i += 2) {
            odd += Character.getNumericValue(a1.charAt(i));
        }
        for (int i = 0; i < a2.length(); i += 2) {
            odd += Character.getNumericValue(a2.charAt(i));
        }

        int left = (2 * even + odd) % 10;
        int right = (10 - Integer.parseInt(a3)) % 10;

        // 가능한 분류코드 찾기
        List<String> validCodes = new ArrayList<>();
        for (int code = 11; code < 100; code++) {
            String codeStr = String.format("%02d", code);
            int testOdd = odd + Character.getNumericValue(codeStr.charAt(0));
            int testEven = even + Character.getNumericValue(codeStr.charAt(1));

            if ((2 * testEven + testOdd) % 10 == (10 - Integer.parseInt(a3)) % 10) {
                validCodes.add(codeStr);
            }
        }

        StringBuilder result = new StringBuilder();
        
        result.append(checkRange(validCodes, 11, 15) ? "O" : "X");
        result.append(checkRange(validCodes, 21, 22) ? "O" : "X");
        result.append(checkRange(validCodes, 31, 51) ? "O" : "X");
        result.append(checkRange(validCodes, 81, 86) ? "O" : "X");
        result.append(contains(validCodes, "71") ? "O" : "X");

        System.out.println(result.toString());
    }

    private static boolean checkRange(List<String> codes, int start, int end) {
        for (String code : codes) {
            int num = Integer.parseInt(code);
            if (num >= start && num <= end) {
                return true;
            }
        }
        return false;
    }

    private static boolean contains(List<String> codes, String target) {
        return codes.contains(target);
    }
}