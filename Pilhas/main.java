package Pilhas;

/**
 *
 * @author Kainan
 */
public class main {
    public static void main(String[] args){
        pilha pilha = new pilha();
        
        pilha.insere("Kainan");
        pilha.insere("Faria");
        pilha.insere("ola");
        
        System.out.println(pilha.remove()+" removido");
        System.out.println(pilha.mostrar()+"\n");
                
        if(pilha.vazio()){
            System.out.println("Pilha vazia!");
        }
        
        System.out.println(pilha.remove()+" removido");
        System.out.println(pilha.mostrar());
    }
}
