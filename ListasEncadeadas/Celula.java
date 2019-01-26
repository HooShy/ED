package ListasEncadeadas;

/**
 *
 * @author Kainan
 */
public class Celula <hoosh>{
    private Celula prox;
    private hoosh valor;
    
    public Celula(Celula prox, hoosh valor){
        this.prox = prox;
        this.valor = valor;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }

    public hoosh getValor() {
        return valor;
    }

    public void setValor(hoosh valor) {
        this.valor = valor;
    }
    
    
}
