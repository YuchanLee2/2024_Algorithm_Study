import java.util.Arrays;

class P42885 {
    public static int solution(int[] people, int limit) {


        Arrays.sort(people);

        int cur=0;

        int count=0;
        for(int i =0; i<people.length; i++) {

            if(limit>cur) {
                cur+=people[i];
            }
            else {
                count++;
                cur=people[i];
            }



        }




        return count;
    }
}