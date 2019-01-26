package TorreHanoi;

import java.util.Scanner;

/**
 *
 * @author Kainan
 */
public class Principal {
    public static void main(String[] args){
        int o=1, t=2, d=3, n;
        HanoiTower hanoiTo = new HanoiTower();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de peças: ");
        n = input.nextInt();
        
        hanoiTo.hanoi(n, o, d, t);

    }   
}
