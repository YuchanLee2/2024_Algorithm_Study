import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int his[][]={{0,0,0,0,0},{0,0,0,0,0},{2,2,0,0,0},{1,0,1,0,0},{2,1,2,2,2},{2,1,2,2,2}};
        s(his);
    }
    public static int s(int[][] his){
        int answer =0;

        int a=his[0].length;
        int b=his.length;
        for(int x=a-1; x>=0; x--){
            int one=0;
            int two=0;
            int zero=0;
            
            for(int y=b-1; y>=0; y--){
                if(his[y][x]==1){
                    one=his[y][x];
                }
                else if(his[y][x]==2){
                    two=his[y][x];
                }
                System.out.print(his[y][x]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int x=a-1; x>=0; x--){
            int one=0;
            int two=0;
            int zero=0;
            
            for(int y=b-1; y>=0; y--){
                if(his[y][x]==1){
                    one=b-y;
                }
                else if(his[y][x]==2){
                    two=b-y;
                }


            }
            System.out.println("현재 위치"+one+" "+two);
                if(one<two){  // 0이 있는지 확인해야함
                    for(int z=one-1; z>=two; z--){
                        if(his[z][x]==0){
                            zero=b-z;
                        }
                    }
                    if(zero==0){
                        System.out.println("결과값 : "+(two-one+1));
                    }
                    else{
                        System.out.println("결과값 : "+1);
                    }
                }
    
                else if(one==0&&two<0){
                    // two+1을 결과값에 곱하기
                    System.out.println("결과값 :"+two+1);
                }
                
                else{ // 나머지는  한가지 경우의 수임 
                    System.out.println("결과값 : 1");
                }
        }
        
        return answer;
    }
}
