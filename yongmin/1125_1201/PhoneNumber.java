// don't place package name. 

import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        String regex = "^010-\\d{4}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(n);

        if (matcher.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        scanner.close();
    }
}
