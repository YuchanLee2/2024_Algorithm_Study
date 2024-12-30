import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num1 = br.readLine();
        String num2 = br.readLine();

        int[] bins1 = new int[10];
        int[] bins2 = new int[10];

        for(int i = 0; i < num1.length(); i++){
            char c = num1.charAt(i);
            bins1[c - '0']++;
        }

        for(int i = 0; i < num2.length(); i++){
            char c = num2.charAt(i);
            bins2[c - '0']++;
        }

        boolean same = true;
        for(int i = 0; i < 10; i++){
            if(bins1[i] != bins2[i]){
                same = false;
                break;
            }
        }

        if(same){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
