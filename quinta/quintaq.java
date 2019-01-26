package quinta;

/**
 *
 * @author Kainan
 */

public class quintaq {
    public int recur(int x){
          
          if(x==0){
              return x;
          }
           System.out.print(x%10);
           x = x/10;
           return recur(x);
    }          
}
