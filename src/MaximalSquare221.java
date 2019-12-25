public class MaximalSquare221 {

    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] dp = new int[row+1][column+1];

        for(int i = 0; i < row+1; i++){
            dp[i][0] = 0;
        }

        for(int i = 0; i < column+1; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(matrix[i-1][j-1] == '1'){
                    int a = dp[i-1][j];
                    int b = dp[i][j-1];
                    int c = dp[i-1][j-1];
                    int smallest=(a<b)?((a<c)?a:c):((b<c)?b:c);
                    dp[i][j] = 1 + smallest;
                    max = max > dp[i][j] ? max : dp[i][j];
                    //System.out.println(max);
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        return max*max;
    }
}
