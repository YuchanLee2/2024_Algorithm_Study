import java.util.*; 
public class Main_3 {
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        //System.out.println((int)Math.ceil(10/((a*b)/(b*c)))); 
        System.out.println( (int)Math.ceil((double) ((c*10)*b)/(b*a))  ); 
    }
}