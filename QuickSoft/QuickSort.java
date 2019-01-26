package QuickSoft;
import java.util.Random;
/**
 *
 * @author Kainan
 */


public class QuickSort {
    public static void quick(int a[], int low, int hi){
        //embaralhar(a);
        if(hi<=low){
            return;
        }
        int j = Trocas(a, low, hi);
        quick(a, low, j-1);
        quick(a, j+1, hi);
        
    }

    public static int Trocas(int a[], int low, int hi){
        int auxi;
        int maiorPosi = low;
        int menorPosi = hi+1;
        int v =a[low];
        while(true){
            
            while(a[++maiorPosi] < v){
                if(maiorPosi == hi){
                    break;
                }
            }
            while(v < a[--menorPosi]){
                if(menorPosi == low){
                    break;
                }
            }
            if(maiorPosi>=menorPosi){
                break;
            }
            
            int aux = a[maiorPosi];
            a[maiorPosi] = a[menorPosi];
            a[menorPosi] = aux;
                
        }
        auxi = a[low];
        a[low] = a[menorPosi];
        a[menorPosi] = low;
        
        return menorPosi;
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