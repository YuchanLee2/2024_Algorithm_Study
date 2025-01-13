import java.util.Arrays;
class P42746 {
    public static String solution(int[] numbers) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        String[ ] arr = new String[numbers.length];

        for(int i =0; i<arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr,(a,b)
                ->(b+a).compareTo(a+b));

        if(arr[0].equals("0")) {
            return "0";
        }

        for(int i =0; i<arr.length; i++) {
            sb.append(arr[i]);
        }


        return sb.toString();
    }




}