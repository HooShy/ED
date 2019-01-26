package SelectionSoft;

/**
 *
 * @author Kainan
 */
public class Select {
    public static void Select(int a[]){
        for(int i=0; i < a.length-1; i++){
            int index = i;
            
            for(int j = i+1; j<a.length; j++){
                if(a[j]<a[index]){
                    index = j;
                }                   
            }
            int menorNum = a[index];   
            a[index] = a[i];  
            a[i] = menorNum;
        }
    }
}
