package ListasSequenciais;

/**
 *
 * @author Kainan
 */
public class main {
    public static void main(String[] args){
        ListaSequencial lista = new ListaSequencial();
        
        lista.adiciona("Kainan");
        lista.adiciona("Faria");
        lista.adicionaPos(0,"Ola");
        lista.mostrar();
               
        lista.remove(0);
        lista.mostrar();
        
        System.out.println(lista.Search("ola"));
        
 
        
        
    }
}
