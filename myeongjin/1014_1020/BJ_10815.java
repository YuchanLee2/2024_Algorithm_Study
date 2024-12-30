import java.util.*;
import java.io.*;
public class BJ_10815 {
    static int N, M;
    static int[] arr; 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        for(int i=0; i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        M= sc.nextInt();
        int arrT[]= new int [M];
        
        for(int i=0; i<M; i++){
            int num = sc.nextInt();
            System.out.print(BinarySeach(num)+" ");
        }


    }
    public static int BinarySeach(int n){ //이진 탐색 요소를 하나씩 넣어서 비교
        int left = 0; 
        int right = N-1; 

        while(left <= right){ //left가 rigth보다 큰 경우는 이진 탐색 규칙에 어긋나므로 반복문 돌리지 X
            int mid = (left + right)/2; //중간 인덱스는 왼쪽 오른쪽의 더한 값에 나누기 2
            int midValue = arr[mid]; //중간 인덱스에 해당되는 값 => 이 값으로 비교

            if(n > midValue){ //만약 num이 중간값보다 크면
                left = mid +1;
            }else if(n < midValue){ //만약 num이 중간값보다 작으면
                right = mid -1;
            }else return 1; //찾았을 경우 (midValue == num)일 경우
        }
        return 0; //상근이의 카드에 num이 없을 경우
    }

}
