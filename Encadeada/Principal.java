package Encadeada;

import java.util.Scanner;
/**
 *
 * @author Kainan
 */
public class Principal {
    public static void main(String[] args){
        PilhaEncadeada pilha = new PilhaEncadeada();
        Scanner input = new Scanner(System.in);
        int dec =0;
        Object vari;
        
        while(dec < 6){
            System.out.println("\n.................O que quer fazer..................");
            System.out.println("(1) Adicionar");
            System.out.println("(2) Remover");
            System.out.println("(3) Tamanho da lista");
            System.out.println("(4) Mostra conteudo da lista");
            System.out.println("(5) Verificar se esta vazia");
            System.out.println("...................................................");
            dec = input.nextInt();
        
        
            if(dec == 1){
                System.out.println("O que deseja adicionar a lista");
                vari = input.next();
                pilha.adicionar(vari);
            }

            if(dec == 2){
                pilha.remover();
            }
            
            if(dec == 3){
                System.out.println(pilha.size());
            }
            
            if(dec == 4){
                pilha.show();
            }
            
            if(dec == 5){
                System.out.println(pilha.vazia());
            }
            
        
        
        
        
        }
    }
}
