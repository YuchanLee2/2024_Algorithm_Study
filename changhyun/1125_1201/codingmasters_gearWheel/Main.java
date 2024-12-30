import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        
        int A = Integer.parseInt(inputs[0]);
        int C = Integer.parseInt(inputs[2]);
        
        int result = (int)Math.ceil(10.0 * C / A);
        
        System.out.println(result);
    }
}
