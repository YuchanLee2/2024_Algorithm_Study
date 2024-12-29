// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class CM_0919_30 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int n = scanner.nextInt(); // 입력받을 n개의 아파트 단지

        int []arr = new int[n]; 
        int []people= new int[n]; 
        for(int i =0; i<n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            arr[i]=a;
            people[i]=b;

        }

        int minSum=Integer.MAX_VALUE;

        int resultIndex=-1;

        for(int i =0; i<n; i++){
            int nSum=0;

            for(int j=0; j<n; j++){

                nSum+=Math.abs(arr[i]-arr[j])*people[j];
            }

            if(nSum<minSum){
                minSum=nSum;

                resultIndex=i+1;
            }


        }


        System.out.println(resultIndex); // 가장 큰값은 앞에있으므로 앞의 값 출력
        

    }
}