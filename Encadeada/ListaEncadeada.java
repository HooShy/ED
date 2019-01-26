package Encadeada;

/**
 *
 * @author Kainan
 */
public class ListaEncadeada {
    private Celula head;
    private Celula last;
    private int tam = 0;
    
    public ListaEncadeada(){
        head = new Celula();
        last = head;
        head.prox = null;
    }
    
    public void insertFirst(Object x){
        Celula aux = new Celula(x);
        aux.prox = head.prox;
        head.prox = aux;
        if(empty()){
            last = aux;
        }
        tam++;
    }
    
    public void insertLast(Object x){
        last.prox = new Celula(x);
        last = last.prox;
        last.prox = null;
        tam++;
    }
    
    public Object remove(int ind){
        int i = -1;
        Object r;
        Celula aux = new Celula(head);
        while((aux.prox!=null) && i<ind){
            if(i+1 == ind){
                if(aux.prox==last){
                    last = aux;
                    r = aux.prox.val;
                    aux.prox = aux.prox.prox;
                    return r;                    
                }else{
                    aux = aux.prox;
                }
                
            }
            i++;
        }
        return null;
    }
    
    public int search(Object x){
        int i = -1;
        Celula aux = new Celula(head);
        while(aux.prox != null){
            if(aux.prox.val == x){
                return ++i;
            }else{
                i++;
            }
            aux = aux.prox;
        }
        return -1;
    }
    
    public boolean empty(){
        if(head.prox == null){
            return true;
        }else{
            return false;
        }
    }
    
    public Object removeFirst(){
        Object r;
        if(!empty()){
            r = head.prox.val;   
            head.prox = head.prox.prox;
            tam--;
            return r;          
        }else{
            return null;
        }
        
    }
    
    public int size(){
        return tam;
    }
    
    public void showTime(){
        Celula aux = head;
        if(empty()){
            System.out.println("Lista vazia");
        }
        while(aux.prox != null){
            System.out.println(aux.prox.val);
            aux = aux.prox;
            
        }
        
       
    }

}
