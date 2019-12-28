import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        backtrack(list, new ArrayList<>(), nums);
//        return list;
//    }
//
//    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
//        if (tempList.size() == nums.length) {
//            list.add(new ArrayList<>(tempList));
//        } else {
//            for (int i = 0; i < nums.length; i++) {
//                if (tempList.contains(nums[i])) continue; // element already exists, skip
//                tempList.add(nums[i]);
//                backtrack(list, tempList, nums);
//                tempList.remove(tempList.size() - 1);
//            }
//        }
//    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();

        permute(res, nums, temp);
        return res;
    }

    private void permute(List<List<Integer>> res, int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<Integer>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) {
                    continue;
                }
                temp.add(nums[i]);
                permute(res, nums, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}




