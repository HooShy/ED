package Arranjo;

/**
 *
 * @author Kainan
 */
public class PilhaArranjo {
    ListaArranjo list = new ListaArranjo();
    
    public void insert(Object x){
        list.add(x);
    }
    
    public Object remove(){
        return list.Remove(list.getUltimo()-1);
    }
    
    public int size(){
        return list.Size();
    }
    
    public void showTime(){
        list.Show();
    }
   
    public boolean empty(){
        return list.empty();
    }
    
}
