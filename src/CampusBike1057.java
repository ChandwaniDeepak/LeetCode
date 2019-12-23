import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class CampusBike1057 {

    public int[] assignBikes(int[][] workers, int[][] bikes) {
        // worker length
        int workerSize = workers.length;

        // compare distance asc, workerindex asc, bikeindex asc
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            int distComp = Integer.compare(a[0], b[0]);
            if(distComp == 0){ // if dist is equal
                // compare worker index if equal compare bike index
                if(a[1] == b[1]){
                    // if worker index is also equal then compare bike index
                    return Integer.compare(a[2], b[2]);
                }
                // if workr index not equal simply return the compare result
                return Integer.compare(a[1], b[1]);
            }
            //if dist not equal the simply return distComp
            return distComp;
        });

        // calculate manhattan distance of all the bike with all the workers
        for(int i = 0; i < workers.length; i++){
            // get the worker
            int[] worker = workers[i];

            // compare the worker and each bike to calculate manhattan distance
            for(int j = 0; j < bikes.length; j++){
                int[] bike = bikes[j];

                // calculate the manhattan distance manDist = Math.abs(bikeX - workX) + Math.abs(bikeY - workY)
                int distance = Math.abs(bike[0] - worker[0]) + Math.abs(bike[1] - worker[1]);

                // add the distance, worker index, bike index into PQ
                pq.add(new int[]{distance, i, j});
            }
        }

        // Create the result array which will be used to store the result and size will be workerSize
        int[] result = new int[workerSize];

        // as it is int[] so all the values will be 0, but we have some values which are 0, so to avoid confusion fill the array with -1 value
        Arrays.fill(result, -1);

        //store the assigned bike
        Set<Integer> bikeAssigned = new HashSet<>();

        //iterate till all the workers are assigned bike
        while(workerSize > bikeAssigned.size()){

            // get the worker bike pair from the PQ
            int[] workerBikePair = pq.poll();
            // check if the bike is unassigned or the worker is is waiting for the bike to be assigned bike
            if(result[workerBikePair[1]] == -1 && !bikeAssigned.contains(workerBikePair[2])){
                // if bike and worker were unassigned then assign bikeIndex to result[workerIndex]
                result[workerBikePair[1]] = workerBikePair[2];
                // and add the bike to bikeAssigned set, so that it is not reassigned
                bikeAssigned.add(workerBikePair[2]);
            }
        }
        // simply return the result as all the workers are assigned bike
        return result;
    }
}
