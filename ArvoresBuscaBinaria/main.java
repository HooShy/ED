package ArvoresBuscaBinaria;

/**
 *
 * @author kainan
 */
public class main {
    public static void main(String[] args){
        ArvoreBB bb = new ArvoreBB();
        
        bb.insere(4);
        bb.insere(2);
        bb.insere(1);
        bb.insere(3);
        bb.insere(6);
        bb.insere(5);
        bb.insere(7);
       
        System.out.println(bb.raiz.val);
        System.out.println(bb.raiz.left.val);
        System.out.println(bb.raiz.right.val);
        System.out.println(bb.raiz.right.right.val);
        
        bb.contem(6);
        
        bb.mostrar(bb.raiz);
        System.out.println("\n");
        bb.preordem(bb.raiz);
        
        System.out.println("\n");
        bb.inordem(bb.raiz);
        
        System.out.println("\n");
        bb.posordem(bb.raiz);

        
    }
}
