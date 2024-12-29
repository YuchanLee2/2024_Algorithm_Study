
// import java.util.HashMap;
// import java.util.Map;

// public class Solution {
//     public int[] solution (String[] name, int[] yearning, String[][] photo) {
//       Map<String, Integer> yearningMap = new HashMap<>();
//         for (int i = 0; i < name.length; i++) {
//             yearningMap.put(name[i], yearning[i]);
//         }
        
//         int[] result = new int[photo.length];
    
//         for (int i = 0; i < photo.length; i++) {
//             int score = 0;
//             for (String person : photo[i]) {
//                 score += yearningMap.getOrDefault(person, 0); 
//             }
//             result[i] = score;
//         }
        
//         return result;
//     }

//     public static void main(String[] args) {
//         players memory = new players();
        
//         String[] name = {"may", "kein", "kain", "radi"};
//         int[] yearning = {5, 10, 1, 3};
//         String[][] photo = {
//             {"may", "kein", "kain", "radi"},
//             {"may", "kein", "brin", "deny"},
//             {"kon", "kain", "may", "coni"}
//         };
        
//         int[] result = memory.Solution(name, yearning, photo);
        
//         // 결과 출력
//         for (int score : result) {
//             System.out.println(score);
//         }
//     }

// }