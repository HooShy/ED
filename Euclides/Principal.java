package Euclides;

import java.util.Scanner;

/**
 *
 * @author Kainan
 */
public class Principal {
    public static void main(String[] args){
        int p, q, i=1;
        Scanner input = new Scanner(System.in);
        AlgoritimoEucli mdc = new AlgoritimoEucli();
        System.out.println("...............CALCULAR MDC (EUCLIDES)...............");
        while(i!=0){
            System.out.println("DIGITE DOIS NUMEROS INTEIROS PARA CALCULAR O MDC: ");
            p = input.nextInt();
            q = input.nextInt();
        
            System.out.println("O MDC DOS NUMEROS É " + mdc.calcMdc(p, q)+"\n");
        }
    }   
}
