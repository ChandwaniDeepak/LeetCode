import java.util.LinkedList;
import java.util.Queue;

public class KnightProbabilityInChessboard688 {

    public double knightProbability(int N, int K, int r, int c) {

        double[][] dp = new double[N][N];
        boolean[][] v = new boolean[N][N];
        Queue<int[]> nextStart = new LinkedList();

        dp[r][c] = 1;
        nextStart.add(new int[]{r, c});
        int[][] directions
                = new int[][]{{2, -1}, {2, 1}, {-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {-1, -2}, {1, -2}};
        for(; K > 0; K--){

            double[][] dp2 = new double[N][N];
            boolean[][] v2 = new boolean[N][N];
            int qSize = nextStart.size();


            for(int i = 0; i < qSize; i++){
                int[] rc = nextStart.poll();

                r = rc[0];
                c = rc[1];
                for(int[] dir : directions){
                    int newR = r + dir[0];
                    int newC = c + dir[1];

                    if(newR >= 0 && newR < N && newC >= 0 && newC < N){
                        dp2[newR][newC] += dp[r][c] / 8.0;
                        if(!v2[newR][newC]){
                            nextStart.add(new int[]{newR, newC});
                            v2[newR][newC] = true;
                        }


                    }
                }
            }
            dp = dp2;
            //v = v2;
        }

        double sum = 0.0;
        for(double[] row : dp){
            for(double ro : row){
                sum += ro;
            }
        }
        return sum;

    }
}
