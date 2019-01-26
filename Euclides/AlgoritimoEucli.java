package Euclides;

/**
 *
 * @author Kainan
 */
public class AlgoritimoEucli {
    
    public int calcMdc(int p, int q){
        if(q == 0){
            return p;
        }else{
            int newp = q;
            int newq = p%q;
            return calcMdc(newp, newq);
        }    
    }
}
