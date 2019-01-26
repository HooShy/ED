package Encadeada;

/**
 *
 * @author Kainan
 */
public class Celula {
    Object val;
    Celula prox;
    
   
	
	public Celula(){
		
	}
	public Celula(Object val){
		this.val = val;		
	}
	
	public Object getVal() {
		return val;
	}
	public void setVal(Object val) {
		this.val = val;
	}
	public Celula getProx() {
		return prox;
	}
	public void setProx(Celula prox) {
		this.prox = prox;
	}
}
