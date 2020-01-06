import java.util.ArrayList;
import java.util.List;

public class RiverSizesAlgo {

    public List<Integer> riverSizes(int[][] matrix) {
        // Write your code here.
        List<Integer> res = new ArrayList();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    res.add(getSize(i, j, matrix, 0, res));
                }
            }
        }
        for(int i : res){
            System.out.println(i);
        }
        return res;
    }
    public int getSize(int i, int j, int[][] matrix, int count, List<Integer> res){
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[i].length || matrix[i][j] == 0){
            return 0;
        }
        matrix[i][j] = 0;
        //count++;
        getSize(i+1, j, matrix, count++, res);
        getSize(i-1, j, matrix, count++, res);
        getSize(i, j+1, matrix, count++, res);
        getSize(i, j-1, matrix, count++, res);
        //matrix[i][j] = 1;
        //System.out.println(count);
        //res.add(count);
        return count;
    }
}
