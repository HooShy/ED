package ListaCircular;

/**
 *
 * @author Kainan
 */
public class FilaArranjo {
    ListCircular list = new ListCircular();
    
    public void insert(Object x){
        list.enqueue(x);
    }
    
    public Object remove(){
        return list.dequeue();
    }
    
    public boolean empty(){
        return list.empty();
    }
    
    
    public boolean flood(){
        return list.flood();
    }
    
    public void showTime(){
        list.showTime();
    }
    
    public int size(){
       return list.size();
    }
}
