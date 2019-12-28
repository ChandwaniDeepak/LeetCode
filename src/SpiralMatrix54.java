import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = spiral(matrix, matrix.length, matrix[0].length);
        return res;
    }

    private List<Integer> spiral(int[][] matrix, int m, int n){
        List<Integer> res = new ArrayList();
        int top = 0, bottom = m-1, left = 0, right = n-1;
        int dir = 0;//0 -> left to right; 1 -> top to bottom; 2 -> right to left; 3 -> bottom to top;

        while(bottom >= top && right >= left){
            if(dir % 4 == 0){
                //0 -> left to right;
                for(int i = left; i <= right; i++){
                    res.add(matrix[top][i]);
                }
                top++;

            }else if(dir % 4 == 1){
                //1 -> top to bottom;
                for(int i = top; i <= bottom; i++){
                    res.add(matrix[i][right]);
                }
                right--;

            }else if(dir % 4 == 2){
                //2 -> right to left;
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;

            }else if(dir % 4 == 3){
                //3 -> bottom to top;
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;

            }

            dir++;
        }
        return res;

    }
}
