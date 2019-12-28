import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrisonCellsAfterNDays957 {
    public int[] prisonAfterNDays(int[] cells, int N) {
        if(N == 0){
            return cells;
        }

        // Time O(N(6+n)) // becoz we are iterating only 6 cells (leaving 1st and last as they do not have 2 adjacent neighbors) n -> length of cells array
        // Space O(cells.length)
        // int[] temp = new int[8];
        // int x = 1;
        // while(N >= x){
        //     for(int i = 1; i < cells.length-1; i++){
        //         if(cells[i-1] == cells[i+1]){
        //             temp[i] = 1;
        //         }else{
        //             temp[i] = 0;
        //         }
        //     }
        //     for(int i = 0; i < cells.length; i++){
        //         cells[i] = temp[i];
        //     }
        //     //cells = temp;
        //     x++;
        // }



        Map<String, Integer> seen = new HashMap<>();
        while(N > 0){
            int[] temp = new int[10];
            seen.put(Arrays.toString(cells), N--);
            for(int i = 1; i < 9; i++){
                temp[i] = cells[i-1] == cells[i+1] ? 1 : 0;
            }
            cells = temp;
            if(seen.containsKey(Arrays.toString(cells))){
                N %= seen.get(Arrays.toString(cells)) - N;
            }
        }


        return cells;
    }
}
