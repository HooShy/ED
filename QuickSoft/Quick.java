/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSoft;

import static QuickSoft.QuickSt.quickSort;
import static QuickSoft.QuickSt.embaralhar;

/**
 *
 * @author Kainan
 */
public class Quick {
    public static void main(String a[]){ 

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        embaralhar(arr1);
        /*for(int k = 0; k < arr1.length; k++){
                        System.out.print(arr1[k] + " ");
                    }
        System.out.println("\n");*/
        System.out.println("Before Quick Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        quickSort(arr1, 0, arr1.length-1); 
         
        System.out.println("After Quick Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }
}
