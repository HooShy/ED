package Encadeada;

/**
 *
 * @author Kainan
 */
public class FilaEncadeada {
    ListaEncadeada list = new ListaEncadeada();
    
    public void insert(Object x){
        list.insertLast(x);
    }
    
    public void remove(){
        list.removeFirst();
    }
    
    public void showTime(){
        list.showTime();
    }
    
    public int size(){
        return list.size();
    }
    
    public boolean empty(){
       return list.empty();
    }
    
}
