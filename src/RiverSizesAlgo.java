import java.util.ArrayList;
import java.util.List;

public class RiverSizesAlgo {

    public List<Integer> riverSizes(int[][] matrix) {
        // Write your code here.
        List<Integer> res = new ArrayList();
        boolean[][] seen = new boolean[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    int c = getSize(i, j, matrix, seen);
                    if(c > 0){
                        res.add(c);
                    }
                }
            }
        }
        for(int i : res){
            System.out.println(i);
        }
        return res;
    }
    public int getSize(int i, int j, int[][] matrix, boolean[][] seen){
        if( i < 0 || j < 0 || i >= matrix.length || j >= matrix[i].length || seen[i][j] || matrix[i][j] == 0 ){
            return 0;
        }
        seen[i][j] = true;
        return 1 + getSize(i+1, j, matrix, seen)
                + getSize(i-1, j, matrix, seen)
                + getSize(i, j+1, matrix, seen)
                + getSize(i, j-1, matrix, seen);
    }
}
