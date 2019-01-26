package ListaCircular;

/**
 *
 * @author Kainan
 */
public class ListCircular {
    private int tam;
    private Object itens[]; 
    int first;
    int last;       
    
    public ListCircular(){
            tam = 10;
            itens = (Object[]) new Comparable[tam];
            last = 0;
            first = 0;
    }
    
    public boolean empty(){
        if(last == first){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean flood(){
        return (last + 1) % tam == first;
        
    }
    
    public void enqueue(Object x){
        if(flood()){
            System.out.println("Lista cheia");
        }    
        if(last==tam-1){
            extend();
            itens[last] = x;
            last = (last+1)%tam;
        }else{
            itens[last] = x;
            last = (last+1)%tam;
        }
    }
    
    public Object dequeue(){
        if(empty()){
            System.out.println("Lista vazia");
            return null;
        }
        if(size()==tam/2){
            reduce();
            Object aux = itens[first];
            first = (first+1)%tam;
            return aux;
        }else{
            Object aux = itens[first];
            first = (first+1)%tam;
            return aux;
        }
           
    }

    
    
    /*public void extend(){
        Item neo[] = (Item[]) new Comparable[tam*2];
        for(int i = 0; i < tam; i++){
           neo[i] = itens[(i+first)%tam];
        }
        first = 0;
        last = tam-1;
        tam = tam*2;
        itens = neo;
    }*/
    
        public void extend(){
        Object neo[] = (Object[]) new Comparable[tam*2];
        int cont=0;
        for(int i = first%tam; i < last%tam; i++){
           neo[cont] = itens[i];
           cont++;
        }
        first = 0;
        last = cont;
        tam = tam*2;
        itens = neo;
    }
    
        public void reduce(){
        if(tam == 5){
            System.out.println("Tamanho minimo atingido");
        }
        int Taux = (int) ((int)tam*0.75);
        Object neo[] = (Object[]) new Comparable[Taux];
        int cont=0;
        for(int i = first%tam; i < last%tam; i++){
           neo[cont] = itens[i];
           cont++;
        }
        first = 0;
        last = cont;
        tam = Taux;
        itens = neo;
    }
    
    public int size(){
        return last-first%tam;
    }
    
    public void showTime(){
        for(int i=first%tam; i<last%tam; i++){
            if(empty()){
                System.out.println("List vazia");
            }else{
                System.out.println(itens[i]+" ");
            }
        }
    }
    public int sizee(){
        return tam;
    }
}
