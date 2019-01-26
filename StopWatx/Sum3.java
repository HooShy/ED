package StopWatx;

import java.util.Random;

/**
 *
 * @author Kainan
 */
public class Sum3 {
    public static void main(String[] args){ 
        Random gerator = new Random();
        
        int cont=0;
        int [] n = new int [gerator.nextInt(8000)];
        StopWatch time = new StopWatch();
        for (int i = 0; i < n.length; i++){
            for (int j = i+1; j < n.length; j++){
                for (int k = j+1; k < n.length; k++){           
                    if (n[i] + n[j] + n[k] == 0){
                         cont++;
                    }
                }
            }
        }
        
        System.out.println(time.elapsedTime());
    }
}
