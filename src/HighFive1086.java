import java.util.*;

public class HighFive1086 {
    public int[][] highFive(int[][] items) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Set<Integer> studentIds = new HashSet<>();
        int[][] result;
        if(items.length == 0 || items == null){
            return new int[1][1];
        }

        for(int[] i : items){
            if(map.get(i[0]) != null){
                ArrayList<Integer> mList = map.get(i[0]);
                mList.add(i[1]);
            }else{
                studentIds.add(i[0]);
                ArrayList<Integer> marks = new ArrayList<>();
                marks.add(i[1]);
                map.put(i[0], marks);
            }
        }

        result = new int[studentIds.size()][2];
        studentIds.forEach((id) ->{
            ArrayList<Integer> mksList = map.get(id);
            Object[] mArr = mksList.toArray();
            Arrays.sort(mArr);

            int sum = 0, size = mksList.size();
            for(int i=size-1; i >= size-5; i--){
                sum += (int)mArr[i];
            }
            int avg = Math.round(sum/5);
            result[id-1][0] = id;
            result[id-1][1] = avg;

        });

        return result;
    }
}
