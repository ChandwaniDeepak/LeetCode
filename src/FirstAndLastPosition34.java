public class FirstAndLastPosition34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = check(nums, target, true);

        if(left == nums.length || nums[left] != target){
            return result;
        }

        result[0] = left;
        result[1] = check(nums, target, false)-1;
        return result;
    }


    public int check(int[] nums, int target, boolean isLeft){
        int lo = 0;
        int hi = nums.length;

        while(lo < hi){
            int mid = (lo+hi)/2;
            if(nums[mid] > target || isLeft && target == nums[mid]){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return lo;
    }
}
