import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPointToOrigin973 {
    public int[][] kClosest(int[][] points, int k) {

        if(k == 0 || points.length == 0){
            return new int[0][0];
        }

        if(k == points.length){
            return points;
        }

        if(k == 0 || points.length == 0){
            return new int[0][0];
        }

        if(k == points.length){
            return points;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            int hypo = (a[0]*a[0] + a[1]*a[1])- (b[0]*b[0] + b[1*b[1]]);
            return hypo;
        });
        for(int[] p: points){
            pq.add(p);
            if(pq.size() > k){
                pq.remove();
            }
        }

        int[][] out = new int[k][2];
        while(k-- > 0){
            out[k] = pq.remove();
        }

        return out;
    }
}
