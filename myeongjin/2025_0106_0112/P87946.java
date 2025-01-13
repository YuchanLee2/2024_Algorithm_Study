class P87946 {
    public int answer;
    public int solution(int k, int[][] dungeons) {



        boolean check[] = new boolean[dungeons.length];

        dfs(0,k,dungeons,check);







        return answer;
    }

    private void dfs(int start, int k, int[][] dungeons, boolean[] check) {



        for(int i =0; i<dungeons.length; i++) {

            if(!check[i]&&dungeons[i][0]<=k) {
                check[i]=true;

                dfs(start+1,k-dungeons[i][1],dungeons,check);

                check[i]=false;



            }


        }

        answer=Math.max(start, answer);



    }
}