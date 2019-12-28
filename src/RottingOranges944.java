import java.util.HashSet;
import java.util.Set;

public class RottingOranges944 {

    int fresh = 0;
    public int orangesRotting(int[][] grid) {
        //int[][] temp = new int[grid.length][grid[0].length];
        //temp = grid;

        Set<String> visited = new HashSet<>();
        int time = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    fresh += 1;
                }
            }
        }


        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 2){
                    time += check(grid, i, j, visited);
                }
            }
        }

        if(fresh == 0){
            return time;
        }
        return -1;
    }

    public int check(int[][] grid, int i, int j, Set<String> visited){
        String current = i+":"+j;
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length ||
                grid[i][j] == 0 || grid[i][j] == 3 || fresh == 0 || visited.contains(current)){
            return 0;
        }

//        if(grid[i][j] == 2){
//            return 0;
//        }

        if(grid[i][j] == 1){
            fresh -= 1;
            grid[i][j] = 2;
            return 1;
        }

        //int tmp = grid[i][j];
        //grid[i][j] = 3; // marking visited

        int d = 1 + check(grid, i+1, j, visited);
        int u = 1 + check(grid, i-1, j, visited);
        int r = 1 + check(grid, i, j+1, visited);
        int l = 1 + check(grid, i, j-1, visited);

        //grid[i][j] = tmp;
        return Math.min(Math.min(u, d), Math.min(l, r));
    }
}
