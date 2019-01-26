package Arranjo;

/**
 *
 * @author Kainan
 */
public class Inversao {
   public static PilhaArranjo pilha = new PilhaArranjo();
   
   public static void main(String[] args){
        String teste = "Ola meu nome eh tom";
        String [] a = teste.split(" ");
        for(int i = a.length - 1; i>=0; i--){
           pilha.insert(a[i]);
        }
       pilha.showTime();
    }
}
