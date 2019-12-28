import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameBSTAlgo {
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        // Write your code here.

        if(arrayOne.size() != arrayTwo.size())
            return false;


        if(arrayOne.size() == 0 && arrayTwo.size() == 0)	return true;

        if (arrayOne.get(0).intValue() != arrayTwo.get(0).intValue())
            return false;


        List<Integer> smallOne = getSmall(arrayOne);
        List<Integer> smallTwo = getSmall(arrayTwo);

        List<Integer> bigOrEqualOne = getBigOrEqual(arrayOne);
        List<Integer> bigOrEqualTwo = getBigOrEqual(arrayTwo);
        return sameBsts(smallOne, smallTwo) && sameBsts(bigOrEqualOne, bigOrEqualTwo);
    }

    private static List<Integer> getSmall(List<Integer> list){
        List<Integer> smallList = new ArrayList();
        for(int i = 1; i < list.size(); i++){
            if(list.get(0).intValue() > list.get(i).intValue()){
                smallList.add(list.get(i));
            }
        }
        return smallList;
    }

    private static List<Integer> getBigOrEqual(List<Integer> list){
        List<Integer> bigOrEqualList = new ArrayList();
        for(int i = 1; i < list.size(); i++){
            if(list.get(0).intValue() <= list.get(i).intValue()){
                bigOrEqualList.add(list.get(i));
            }
        }
        return bigOrEqualList;
    }
}
