import java.io.IOException;
import java.util.Scanner;

public class CM_44 {
        public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        String a = scanner.nextLine(); 
        String[] army= a.split(" "); //받은걸 스플릿으로 입력함
        int result =0;
        int year = Integer.parseInt(army[0]);
        if(year==0){//0년차는 제외
            result=0;
        }
        else if(army[3].equals("Officer")){ //간부는 0년차 제외 무조건 28시간
            result=28;
        }
        else if(year==5||year==6){ // 5 6년차는 무조건 20시간
            result=20;
        }
        else if(year>=1&&year<=4&&army[2].equals("N")&&army[1].equals("ROKA")||
                 year>=1&&year<=4&&army[2].equals("N")&&army[1].equals("ROKN")){
            result=32;
        }
        else{
            result=28;
        }
        System.out.println(result); 

    }
}
