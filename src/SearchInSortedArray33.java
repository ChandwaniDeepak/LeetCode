public class SearchInSortedArray33 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            }
            return -1;
        }

        int low = 0, high = nums.length - 1;
        int pivot = pivot(nums, low, high);

        if (pivot == -1) {
            // array is sorted and not rotated, so simple binary search
            return binarySearch(nums, low, high, target);
        }

        if (target > nums[pivot]) {
            return -1;
        } else if (nums[pivot] == target) {
            return pivot;
        }

        if (nums[low] <= target) {
            return binarySearch(nums, low, pivot - 1, target);
        } else {
            return binarySearch(nums, pivot + 1, high, target);
        }
    }

    private int pivot(int[] nums, int low, int high) {
        if (low > high) {
            return -1;
        }
        if (low == high) {
            return low;
        }
        int mid = (low + high) / 2;
        if (high > mid && nums[mid] > nums[mid + 1]) {
            return mid;
        }
        if (mid > low && nums[mid - 1] > nums[mid]) {
            return mid - 1;
        }

        if (nums[low] >= nums[mid]) {
            return pivot(nums, low, mid - 1);
        } else {
            return pivot(nums, mid + 1, high);
        }
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] > target) {
            return binarySearch(nums, low, mid - 1, target);
        } else {
            return binarySearch(nums, mid + 1, high, target);
        }
    }
}
