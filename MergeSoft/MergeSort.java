package MergeSoft;
import MergeSoft.Merge;
/**
 *
 * @author Kainan
 */
public class MergeSort {
    public static void main(String a[]){ 
        Merge merge = new Merge();

        int[] arr1 = {5, 4, 10, 54, 23, 70, 1, 7, 37};
        
        System.out.println("Before Merge Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        merge.mergeSort(arr1, 0, arr1.length-1); 
         
        System.out.println("After Merge Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }
    }
}

    
