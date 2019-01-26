package BuscaBinaria;
import java.util.Scanner;
/**
 *
 * @author Kainan
 */
public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Binary binSearch = new Binary();
        int[] a = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Digite 10 numeros ordenados: ");
            a[i] = input.nextInt();    
        }
            System.out.println("Digite o elemento que quer buscar: ");
            int x = input.nextInt();
            
            System.out.println("O numero bucado esta na posição: " + binSearch.pesquisa(a, x));
    }
}
