import java.util.*; 
public class Main_2 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        String s[]=sc.next().split("-");
        System.out.println(s.length==3&&s[0].equals("010")&&s[1].length()==4&&s[2].length()==4?"valid":"invalid"); 
    }
}