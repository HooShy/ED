package MergeSoft;

/**
 *
 * @author Kainan
 */
public class Merge{
    public void mergeSort(int[] array, int lo, int hi){
        if(lo < hi){
            int mid = (lo + hi) / 2;
            mergeSort(array, lo, mid);
            mergeSort(array, mid + 1, hi);
            merge(array, lo, mid, hi);
        }
    }
 
 public void merge(int[] array, int lo, int mid, int hi){
        int n1 = mid - lo + 1;
        int n2 = hi - mid;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        for(int i = 0; i < n1; i++){
            left[i] = array[lo + i];
        }

        for(int j = 0; j < n2; j++){
            right[j] = array[mid + j + 1];
        }

       left[n1] = Integer.MAX_VALUE;	
       right[n2] = Integer.MAX_VALUE;

        for(int i = 0,  j = 0,  k = lo; k <= hi; k++){
            if(left[i] <= right[j]){
                array[k] = left[i++];
            }else{
                array[k] = right[j++];
            }
        }
    }
}