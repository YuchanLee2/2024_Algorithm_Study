import java.io.*;
import java.util.*;

public class Main{
    private static ArrayList<Integer>[] shuffleLists = new ArrayList[1000];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        long k = Long.parseLong(inputs[1]);

        inputs = br.readLine().split(" ");
        Integer[] arr = Arrays.stream(inputs).map(Integer::parseInt).toArray(Integer[]::new);

        for(int i=0; i<n; i++){
            shuffleLists[i] = new ArrayList<>();
        }

        for (int i =0; i<n; i++) {
            int cur = arr[i]-1;
            shuffleLists[i].add(cur);

            while (cur != i) { 
                cur = arr[cur]-1;
                shuffleLists[i].add(cur);
            }

            // System.out.println();

            // for(int j : shuffleLists[i])
            //     System.out.printf("%d ", j);
            // System.out.println();
        }

        int[] result = new int[n];

        // System.out.println("suffle");
        int shuffleIndex;
        for(int i=0; i<n; i++){
            shuffleIndex = (int)((k-1) % (long)shuffleLists[i].size());
            // System.out.printf("shuffleLists size = %d\n", shuffleLists[i].size());
            // System.out.printf("k mode size = %d\n", shuffleIndex);
            // System.out.printf("%d is move to %d\n\n", i, shuffleIndex);

            result[shuffleLists[i].get(shuffleIndex)] = i+1;
        }

        for(int i: result)
            System.out.printf("%d ",i);
    }
}
