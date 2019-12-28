import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        int[] startArr = new int[intervals.length];
        int[] endArr = new int[intervals.length];

        for(int i = 0; i < intervals.length; i++){
            startArr[i] = intervals[i][0];
            endArr[i] = intervals[i][1];
        }

        Arrays.sort(startArr);
        Arrays.sort(endArr);

        int start = startArr[0];
        int end = endArr[0];

        for(int i = 1; i < intervals.length; i++){
            int newStart = startArr[i];
            if(newStart > end){
                res.add(new int[] {start, end});
                start = newStart;
                end = endArr[i];
            }else{
                end = endArr[i];
            }
        }
        res.add(new int[] {start, end});

        int[][] out = new int[res.size()][res.get(0).length];
        for(int i = 0; i < res.size(); i++){
            out[i] = res.get(i);
        }
        return out;
    }
}
