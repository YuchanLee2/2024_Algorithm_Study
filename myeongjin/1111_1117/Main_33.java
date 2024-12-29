import java.util.*; 
public class Main_33 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        sc.nextInt(); 
        int b = sc.nextInt(); 
        String s = sc.next();
        for(char c:s.toCharArray()){
            for(int i=0;i<b;i++){
                System.out.print(c);
            }
        }
    }
}
