// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class FindMyNameIndex {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        String a = scanner.nextLine(); 

        String b = scanner.nextLine(); 
        
        String[] inputArr = a.split(" ");
        String[] nameArr = b.split(" ");

        List<String> targetList = Arrays.asList(nameArr);
        
        System.out.println(targetList.indexOf(inputArr[1]) + 1);
        // indexOf는 Array 형태만 받는다. 따라서 list로 안만들어줘도 됨.

    }
}