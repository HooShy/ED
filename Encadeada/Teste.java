package Encadeada;
import java.util.Scanner;
/**
 *
 * @author Kainan
 */
public class Teste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        FilaEncadeada fila = new FilaEncadeada();
        int dec=0;
        Object vari;
        while(dec < 7){
            System.out.println("\n.................O que quer fazer..................");
            System.out.println("(1) Adicionar");
            System.out.println("(2) Verificar se esta vazia");
            System.out.println("(3) Remover");
            System.out.println("(4) Verificar tamanho");
            System.out.println("(5) Mostrar tudo");
            System.out.println("...................................................");
            dec = input.nextInt();
        
        
            if(dec == 1){
                System.out.println("O que deseja adicionar a lista");
                vari = input.next();
                fila.insert(vari);

            }
            if(dec == 2){
                System.out.println(fila.empty());
            }

            if(dec == 3){
                fila.remove();
            }
            if(dec == 4){
                System.out.println("Tamanho eh igual a: " + fila.size());
            }
            if(dec == 5){
                fila.showTime();
                
            }
       
        }    
    }    
}
