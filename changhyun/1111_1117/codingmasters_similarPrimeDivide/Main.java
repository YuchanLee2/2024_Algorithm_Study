// don't place package name. 

import java.io.*;

// don't change 'Main' class name and  'public' accessor. 

public class Main {

    private static boolean isSimilarPrime(int n) {
        int count = 0;
	    for (int i = 2; i * i <= n; i++) {
		    if (n % i == 0) {
		    	count++;
		    	n /= i;
		    }
            if (n % i == 0)
                return false;
	    }
	    if (n > 1) 
            count++;

        return count == 2;
    }
    public static void main(String[] args) throws IOException { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (i + j + k + l == n) {
                            int count = 0;
                            
                            if (isSimilarPrime(i))
                                count++;
                            if (isSimilarPrime(j))
                                count++;
                            if (isSimilarPrime(k))
                                count++;
                            if (isSimilarPrime(l))
                                count++;

                            if(count >= 3){
                                System.out.print("possible");
                                return;
                            }

                        }
                    }
                }
            }
        }

        System.out.print("impossible");
    }
}