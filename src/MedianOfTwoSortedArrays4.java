public class MedianOfTwoSortedArrays4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = (nums1.length + nums2.length);

        int[] mergedArray = new int[size];
        int one = 0, two = 0;
        int lastValue;


        if(nums1[0] < nums2[0]){
            lastValue = nums1[0];
            mergedArray[one+two] = lastValue;
            one++;
        }else{
            lastValue = nums2[0];
            mergedArray[one+two] = lastValue;
            two++;
        }

        while(size > one+two){
            if(one < nums1.length && nums1[one] < nums2[two]){
                lastValue = nums1[one];
                mergedArray[one+two] = lastValue;
                one++;
            }else if(two < nums2.length && nums1[one] >= nums2[two]){
                lastValue = nums2[two];
                mergedArray[one+two] = lastValue;
                two++;
            }

            if(size/2 + 1 >= one+two){
                break;
            }
        }

        if((nums1.length + nums2.length) % 2== 0){
            //length is even
            return (double) (mergedArray[size-1] + mergedArray[size-1])/2.0;
        }else{
            return (double) (mergedArray[size-1]);
        }
    }
}
