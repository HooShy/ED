package ListaCircular;
import java.util.Scanner;
/**
 *
 * @author Kainan
 */
public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dec=0;
        Object vari;        
        
        ListCircular list = new ListCircular();
        while(dec < 8){
            System.out.println("\n\n.................O que quer fazer..................");
            System.out.println("(1) Adicionar");
            System.out.println("(2) Verificar se esta vazia");
            System.out.println("(3) Verificar se esta cheia");
            System.out.println("(4) Remover");
            System.out.println("(5) Verificar quantos itens na lista");
            System.out.println("(6) Mostrar tudo");
            System.out.println("(7) Tamanho da lista");
            System.out.println("...................................................");
            dec = input.nextInt();
        
        
            if(dec == 1){
                System.out.println("O que deseja adicionar a lista");
                vari = input.next();
                list.enqueue(vari);

            }
            if(dec == 2){
                System.out.println(list.empty());
            }

            if(dec == 3){
                System.out.println(list.flood());
            }

            if(dec == 4){
                list.dequeue();
            }
            if(dec == 5){
                System.out.println("Tamanho eh igual a: " + list.size());
            }
            if(dec == 6){
                list.showTime();
            }
            if(dec == 7){
                System.out.println("O tamano da lista é " + list.sizee());
                
            }
        }
    }
}
