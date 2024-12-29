import java.io.*;
import java.util.*; 
public class Main_5 {
    static int [][]graph;

    static int m,n;
    static boolean[] check;
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
    
            n =s.nextInt(); //3
            m =s.nextInt(); //3 
    
            graph=new int[100][100];
            check=new boolean[100];
            System.out.println(n+" "+m);
            for(int i =0; i<100;i++){ //0 1 2 3  
               int a=s.nextInt();
               int b=s.nextInt();
               System.out.println(a+" "+b);
               graph[a][b]=graph[b][a]=1;
            }
            
            System.out.println(dfs(1));
    }
        
     public static String dfs(int start) {
        check[start]=true;

        for (int i = 1; i<m+1; i++){
            if(graph[start][i]==1&!check[i]){
                dfs(i);
            }
            if(graph[start][i]==1&check[i]){ //만약 방문한 곳을 다시온다? 이러면 제자리로 돌아온거임
                return "YES";
            }
        }


        return "NO";
    }

        

}