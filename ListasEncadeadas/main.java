package ListasEncadeadas;

/**
 *
 * @author Kainan
 */
public class main {
    public static void main(String[] args){
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.adicionaInicio("Kainan");
        lista.adicionaFinal("Faria");
        lista.adicionaPos("Ola", 1);
          
        lista.adicionaInicio("Sherlock");
        lista.adicionaFinal("OI");
        lista.adicionaPos("Holmes", 0);
        
        lista.removeFinal();
        lista.mostrar();
        
        lista.removeInicio();
        lista.mostrar();
        
        lista.removePos(2);
        lista.mostrar();
        
        
    }
}
