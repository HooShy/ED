package TorreHanoi;

/**
 *
 * @author Kainan
 */
public class HanoiTower {
    
    private static void mover(int O, int D) { 

        System.out.println(O + " -> " + D);

    }
    public void hanoi(int n, int O, int D, int T) {
        if (n > 0){
            hanoi(n - 1, O, T, D);
            mover(O, D);
            hanoi(n - 1, T, D, O);
            
	}
    }
    

    

       
}
