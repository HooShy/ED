package BuscaBinaria;

/**
 *
 * @author Kainan
 */
public class Binary{
    private int buscarBin(int[] a, int x, int i, int f){
        int meio = (i+f)/2;
        if(f<i){
            return -1;
        }      
        if(a[meio] == x){
            return meio;
        }   
        if(a[meio] < x){
            return buscarBin(a, x, meio+1, f);
        }else{
            return buscarBin(a, x, i, meio-1);
        }    
        
    }
    
    public int pesquisa(int[] a, int x){
        int i = a[0];
        int f = a.length;
        
        for(int j=0; j<a.length; j++){
            if(a[j]>a[j+1]){
                return -1;
            }
        }
        return buscarBin(a, x, i, f);
        
    }
}
