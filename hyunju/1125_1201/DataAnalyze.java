import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataAnalyze{
    public static void main(String[] args) {

        String ext = "date" ;
        int val_ext = 20300501;
        String sort_by = "remain";	

        int [][] data;
        data = new int[][]{{1, 20300104, 100, 80},{2, 20300804, 847, 37},{3, 20300401, 10, 8}};
        
        int [][] result = solution(data, ext, val_ext, sort_by);
        System.out.println(Arrays.deepToString(result));
    }

   public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String, Integer> colOrder = new HashMap<>();
        colOrder.put("code", 0);
        colOrder.put("date", 1);
        colOrder.put("maximum", 2);
        colOrder.put("remain", 3);
        
        int[][] filteredData = Arrays.stream(data).filter(x -> x[colOrder.get(ext)] < val_ext).toArray(int[][]::new);
        Arrays.sort(filteredData, (o1, o2) ->  o1[colOrder.get(sort_by)] - o2[colOrder.get(sort_by)]);

        return filteredData;
    }
}