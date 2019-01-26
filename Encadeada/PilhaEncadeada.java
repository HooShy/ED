package Encadeada;

/**
 *
 * @author Kainan
 */
public class PilhaEncadeada {
    ListaEncadeada list = new ListaEncadeada();
    
    public void adicionar(Object x){
        list.insertFirst(x);
    }
    
    public void remover(){
        Object tst = list.removeFirst();
        if(tst==null){
            System.out.println("Erro ao retirar");
        }else{
            System.out.println("Item "+tst+" retirado da lista");
        }
    }
    
    public int size(){
        return list.size();
    }
    
    public void show(){
         list.showTime();
    }
    
    public boolean vazia(){
        return list.empty();
    }
    
}
