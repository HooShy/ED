package InserSoft;

/**
 *
 * @author Kainan
 */
public class Insert {
    public static void insertionSort(int a[]) {
        int n = a.length;  
        for (int i = 1; i < n; i++) {  
            int aux = a[i];  
            int j = i-1;  
            while ( (j >= 0) && ( a[j] > aux ) ) {  
                a[j+1] = a[j];  
                j--;  
            }  
            a[j+1] = aux;  
        }
    }
}
