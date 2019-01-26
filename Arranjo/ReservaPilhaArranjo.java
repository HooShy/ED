package Arranjo;

/**
 *
 * @author Kainan
 */
public class ReservaPilhaArranjo <Item> {
    public RevservaListaArranjo <Item> list = new RevservaListaArranjo <Item>();   
    public void insert(Item x){
        list.add(x);
    }
    
    public Item remove(){
        return (Item) list.Remove(list.getUltimo()-1);
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
