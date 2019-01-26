package Pilhas;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kainan
 */
public class pilha <hoosh> {
    
    private List<hoosh> objeto = new LinkedList<hoosh>();
    
    public void insere(hoosh ex){
        this.objeto.add(ex);
    }
    
    public hoosh remove(){
        return this.objeto.remove(objeto.size() -1);
    }
    
    public boolean vazio(){
        return this.objeto.size() == 0;
    }
    
    public hoosh mostrar(){
        return (hoosh) objeto;
    }
}
