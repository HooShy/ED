package Filas;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kainan
 */
public class Fila <hoosh>{
    
    private List<hoosh> objeto = new LinkedList<hoosh>();
    
    public void adiciona(hoosh ex){
        this.objeto.add(ex);
    }
    
    public hoosh remove(){
        return this.objeto.remove(0);
    }
    
    public boolean vazia(){
        return this.objeto.size() == 0;
    }
    
    public hoosh mostrar(){
        return (hoosh) objeto;  
    }
    
}
