public class SearchInSortedMatrixAlgo {
    public int[] searchInSortedMatrix(int[][] matrix, int target) {
        // Write your code here.
        int column = 0;
        int row = matrix.length-1;
        while(row >= 0 && column < matrix[row].length){
            System.out.println(matrix[row][column]+" row -> "+row+"  column -> "+column);
            if(matrix[row][column] > target){
                row--;
            }else if(matrix[row][column] < target){
                column++;
            }else{
                return new int[]{row, column};
            }
        }
        return new int[]{-1, -1};
    }
}
