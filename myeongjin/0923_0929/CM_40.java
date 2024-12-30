import java.io.*;

import java.util.*; 
public class CM_40 {

    static int []roots;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] scores = new int[n][2];
        roots = new int[n];
    
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            scores[i][0] = Integer.parseInt(input[0]);
            scores[i][1] = Integer.parseInt(input[1]);
            roots[i] = i;
        }
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && 
                    (scores[j][0] == scores[i][0] && scores[j][1] == scores[i][1] || 
                    !((scores[j][0] <= scores[i][0] && scores[j][1] <= scores[i][1]) || 
                    (scores[j][0] >= scores[i][0] && scores[j][1] >= scores[i][1])))) {
                    roots[findRoot(j)] = findRoot(i);
                }
            }
        }
    
        int[] ranking = new int[n];
        Arrays.fill(ranking, 1);
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && 
                    findRoot(i) != findRoot(j) && 
                    scores[j][0] >= scores[i][0] && scores[j][1] >= scores[i][1]) {
                    ranking[i]++;
                }
            }
        }
    
        System.out.println(Arrays.toString(ranking).replaceAll("[\\[\\],]", ""));
    }
    
    static int findRoot(int v) {
        while (roots[v] != v) {
            v = roots[v];
        }
        return v;
    }
    
}
