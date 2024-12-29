import java.io.*;
import java.util.*; 
public class Main_4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        int[] magic={2,3,5};
        int count=0;
        int n=s.nextInt();

        if(n==1) {
            System.out.println(0);
            return;
        }

        for(int m:magic) {
            if(n%m==0) {
                int newValue=(m==3)?n/3*2:(m==5)?n/5*4:n/2;
                if(visited.add(newValue)) {
                    q.add(newValue);
                }
            }
        }
        while(!q.isEmpty()) {
            count++;
            int size=q.size();
            for(int i=0; i<size; i++) {
                n=q.poll();
                if(n==1) {
                    System.out.println(count);
                    return;
                }

                for(int m:magic) {
                    if(n%m==0) {
                        int newValue=(m==3)?n/3*2:(m==5)?n/5*4:n/2;
                        if(visited.add(newValue)) {
                            q.add(newValue);
                        }
                    }
                }
            }
        }
       }
        

}