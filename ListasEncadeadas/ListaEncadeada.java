package ListasEncadeadas;

/**
 *
 * @author Kainan
 */
public class ListaEncadeada <hoosh>{
    private Celula head = null;
    private Celula last = null;
    private int qtdElementos = 0;
    
    public void adicionaInicio(hoosh exemplo){
        Celula nova = new Celula(head, exemplo);
        this.head = nova;
        
        if(this.qtdElementos == 0){
            this.last = this.head;
        }
        qtdElementos++;        
    }
    
    public void adicionaFinal(hoosh exemplo){
        if(qtdElementos == 0){
            this.adicionaInicio(exemplo);
        }else{
            Celula nova = new Celula(null,exemplo);
            this.last.setProx(nova);
            this.last = nova;
            qtdElementos++;   
        }
    }
    
    public void adicionaPos(hoosh exemplo, int posicao){
        if(posicao == 0){
            this.adicionaInicio(exemplo);
        }else if(posicao == qtdElementos){
            this.adicionaFinal(exemplo);
        }else{
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(anterior.getProx(), exemplo);
            anterior.setProx(nova);
            this.qtdElementos++;
        }
    }
    
    public boolean ocupado(int posicao){
        return posicao >= 0 && posicao < this.qtdElementos;
    }
    public Celula pegaCelula(int posicao){
        if(!ocupado(posicao)){
            System.out.println("POSICAO NA LISTA ENCADEADA OCUPADA");
        }
        
        Celula atual = head;
        for(int i = 0; i < posicao; i++){
            atual = atual.getProx();
        }
        
        return atual;
    }
    
    public hoosh pega(int posicao){
        return (hoosh) this.pegaCelula(posicao).getValor();
    }
    
    public void removePos(int posicao){
        if(!this.ocupado(posicao)){
            System.out.println("NADA A REMOVER");
        }
        if(qtdElementos == 1){
            this.removeInicio();
        }else if(posicao == qtdElementos -1){
            this.removeFinal();
        }else{
            Celula anterior = pegaCelula(posicao - 1);
            Celula proxima= pegaCelula(posicao + 1);
            anterior.setProx(proxima);
            qtdElementos--;
        }
    }
    
    public void removeInicio(){
        if(!this.ocupado(0)){
            System.out.println("NADA A REMOVER");
        }
        this.head = head.getProx();
        qtdElementos--;
        
        if(qtdElementos == 0){
            this.last = null;
        }
    }
    
    public void removeFinal(){
        if(!this.ocupado(qtdElementos - 1)){
            System.out.println("NADA A REMOVER");
        }
        if(qtdElementos == 1){
            this.removeInicio();
        }else{
            Celula anterior = pegaCelula(qtdElementos - 2);
            anterior.setProx(null);
            this.last = anterior;
            qtdElementos--;
        }
    }
    
    public int tamanho(){
        return this.qtdElementos;
    }
    
    public boolean contem(hoosh exemplo){
        Celula atual = this.head;
        while(atual != null){
            if(atual.getValor().equals(exemplo)){
                return true;
            }
            atual = atual.getProx();
        }
        return false;
    }
    
    public void mostrar(){
       Celula atual = this.head;
       while(atual != null){
           if(atual.getProx()==null){
               System.out.print(atual.getValor()+"\n");
               atual = atual.getProx();
           }else{
               System.out.print(atual.getValor()+" -> ");
               atual = atual.getProx();
           }
           
       }
    }
}
