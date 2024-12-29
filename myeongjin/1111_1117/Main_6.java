import java.util.*; 
public class Main_6 {
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        int arr[]=new int[10];
        for(char i:a.toCharArray()){
            arr[(i-'0')]++;
        }
        for(char i:b.toCharArray()){
            arr[(i-'0')]--;
        }
        boolean t=true;
        for(int i:arr){
            if(i!=0){
                t=false;
                break;
            }
        }
        System.out.println(t?"YES":"NO");
    }
}