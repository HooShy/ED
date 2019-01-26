package Filas;

/**
 *
 * @author Kainan
 */
public class main {
    public static void main(String[] args){
        Fila filas = new Fila();
        
        filas.adiciona("Kainan");
        filas.adiciona("Faria");
        filas.adiciona("ola");
        
        System.out.println(filas.remove()+" removido");
        System.out.println(filas.mostrar());
        
        if(filas.vazia()){
            System.out.println("Fila vazia!");
        }
        
        System.out.println(filas.remove()+" removido");
        System.out.println(filas.mostrar());
    }
}
