/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSoft;

import java.util.Random;

/**
 *
 * @author Kainan
 */
public class QuickSt {
    public static void quickSort(int arr[], int lo, int hi) {
        int pivot = partition(arr, lo, hi);
        if (lo < pivot - 1)
            quickSort(arr, lo, pivot - 1);
        if (pivot < hi)
            quickSort(arr, pivot, hi);
}
    
    public static int partition(int arr[], int lo, int hi){
        int i = lo, j = hi;
        int tmp;
        int pivot = arr[lo];
     
        while (i <= j) {
            while (arr[i] < pivot){
                i++;
            }
                    
            while (arr[j] > pivot){
                    j--;
            }
            if (i <= j) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                    
            }
        }
     
      return i;
}
     public static int[] embaralhar(int [] a){
        Random rand = new Random();
        int[] aux = a;
        for(int i = 0; i<aux.length; i++){
            int j = rand.nextInt(aux.length);
            int temp = aux[i];
            aux[i] = aux[j];
            aux[j] = temp;
        }
        
        return aux;
    }
    
}
 


