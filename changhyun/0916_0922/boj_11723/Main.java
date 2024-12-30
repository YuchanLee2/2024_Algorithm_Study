import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        boolean[] s = new boolean[20];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int number;
            
            switch (command) {
                case "add":
                    number = Integer.parseInt(st.nextToken()) - 1;
                    s[number] = true;
                    break;
                
                case "remove":
                    number = Integer.parseInt(st.nextToken()) - 1;
                    s[number] = false;
                    break;
                
                case "check":
                    number = Integer.parseInt(st.nextToken()) - 1;
                    sb.append(s[number] ? 1 : 0).append("\n");
                    break;
                
                case "toggle":
                    number = Integer.parseInt(st.nextToken()) - 1;
                    s[number] = !s[number];
                    break;
                
                case "all":
                    Arrays.fill(s, true);
                    break;
                
                case "empty":
                    Arrays.fill(s, false);
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
