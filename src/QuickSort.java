public class QuickSort {

    public int[] sort(int[] a, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int index = partition(a, lowerBound, upperBound);
            if (lowerBound < index - 1) {
                sort(a, lowerBound, index - 1);
            }

            if (index < upperBound) {
                sort(a, index + 1, upperBound);
            }
        }
        return a;
    }

    private int partition(int arr[], int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {

            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1; // Return the pivot's final resting position
    }

//    public int partition(int[] a, int lowerBound, int upperBound){
//        int pivot = lowerBound;
//        int start = lowerBound;
//        int end = upperBound;
//
//        while(start < end){
//            while (a[pivot] >= a[start]){
//                start++;
//            }
//
//            while(a[end] > a[pivot]){
//                end--;
//            }
//
//            if(start < end){
//                swap(a, start, end);
//            }
//        }
//        swap(a, pivot, end);
//        return end;
//    }

    public void swap(int[] a, int start, int end) {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }


}
