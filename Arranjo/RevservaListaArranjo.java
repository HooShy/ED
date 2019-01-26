package Arranjo;

/**
 *
 * @author Kainan
 */
public class RevservaListaArranjo <Item>{
    private int tam = 5;
    private Item[] lista;
        public RevservaListaArranjo(){
            lista = (Item[]) new Comparable[tam];
        }
	
	private int ultimo=0;
        
        public int getUltimo(){
            return ultimo;
        }
	
	public void add(Item x){
		
		if(ultimo==tam){
			UpCapacity();
		}
		if( x!= null){
			lista[ultimo] = x;
			ultimo++;
		}
	}
	public Object Remove(int ind){
		
		if((ind>=0)&&(ind<ultimo)){
			Object aux = lista[ind];
			for(int i = ind ; i < ultimo-1 ;i++ ){
				if(lista[i+1]==null)
					break;
				lista[i] = lista[i+1];
			}
			lista[ultimo-1]=null;
			ultimo--;
			if(ultimo<=tam/2)
				DownCapacity();
			return aux;
		}
		return null;
	}
        
	public void RemoveAll (){
		int i;
		for (i=0;i<ultimo;i++){
				lista[i]=null;
		}
		ultimo=0;
	}
	
	public int Search(Object x){
		int ind = -1 ;
		if( x!= null){
			for(int i =0;i<ultimo-1;i++){
				if(lista[i]==x){
					ind= i;
				}
			}
		}
		return ind;
	}
	
	public void UpCapacity(){
                Item [] aux;
		aux = (Item[]) new Comparable[tam*2];
		for(int i =0; i<tam;i++){
			aux[i]=lista[i];
		}
		tam=tam*2;
		lista=aux;
	}
	public void Show(){
		for(int i=0; i<ultimo;i++){
			System.out.print(lista[i] + " ");
		}
	}
	public void DownCapacity(){
		int taux = (int) (tam*0.75);
		Item[] aux = (Item[]) new Comparable[taux];
		for(int i =0; i<ultimo;i++){
			if(lista[i]==null)
				break;
			aux[i]=lista[i];
		}
		tam=taux;
		lista=aux;
	}
	public int Size(){
		return tam;
	}
        
        public boolean empty(){
            if(ultimo==0){
                return true;
            }else{
                return false;
            }
        }
}
