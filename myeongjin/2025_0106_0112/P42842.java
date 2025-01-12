class P42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum=brown+yellow;

        for(int i =3; i<brown; i++) {

            int j=sum/i;

            if(sum%i==0 && j>=3) {

                int col=Math.max(j, i);

                int row=Math.min(j, i);

                int center = (col-2) *  (row-2);

                if(center == yellow) {

                    answer[0]=col;
                    answer[1]=row;
                    return answer;
                }


            }

        }




        return answer;
    }
}