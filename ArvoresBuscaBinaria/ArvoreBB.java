package ArvoresBuscaBinaria;

/**
 *
 * @author kainan
 */
public class ArvoreBB {
    
    node raiz;
    node chave;
    private int qtdNodes = 0;
    
    public void insere(int valor){
        insere(raiz, valor);
    }
    
    public void insere(node ra, int exemple){
      
        if(ra != null){
            if(exemple < ra.val){
                if(ra.left != null){
                    insere(ra.left, exemple);
                }else{
                    ra.left = new node(null, null, exemple);
                }    
            } else{
                if(ra.right != null){
                    insere(ra.right, exemple);
                }else{
                    ra.right = new node(null, null, exemple);
                }   
            }
        }else{
            ra = new node(null, null, exemple);
            this.qtdNodes++;
        }
       raiz = ra;
    }
    
    public void remove(){
        
    }
    
    public void contem(int exemple){
       contem(raiz, exemple);
    }
    
    public void contem(node no, int exemple){
       if(no != null){
           if(no.val == exemple){
               System.out.println("ACHOU");
               this.chave = no;
           }else{
               contem(no.left, exemple);
               contem(no.right, exemple);
           }
       }
   
    }
    
    public void mostrar(node no){
        if(no != null){
            if(no == raiz){
                System.out.println(no.val+ " raiz");
                if(no.left != null){
                    System.out.print("esquerda de "+no.val+" é ");
                    mostrar(no.left);
                }if(no.right != null){
                    System.out.print("direita de "+no.val+" é ");
                    mostrar(no.right);
                }
            }else{
                System.out.println(no.val);
                if(no.left != null){
                    System.out.print("esquerda de "+no.val+" é ");
                    mostrar(no.left);
                }if(no.right != null){
                    System.out.print("direita de "+no.val+" é ");
                    mostrar(no.right);
                }
            }
        }else{
            System.out.println("null");
        }
    }
    /*
    public void remover(int valor){
        remover(raiz, valor);
    }
    
    public void remover(node no, int valor){
        if(no != null){
            if(no.val == valor){
                if(no.right != null){
                    
                }
            }else{
                
            }
        }
    }*/
    
    public void preordem(node no){
        if(no != null){
            System.out.println(no.val);
            if(no.left != null){
                preordem(no.left);
            }
            if(no.right != null){
                preordem(no.right);
            }
        }
    }
    
    public void inordem(node no){
        if(no != null){
            if(no.left != null){
                inordem(no.left);
            }
            System.out.println(no.val);
            if(no.right != null){
                inordem(no.right);
            }
        }
    }
    
    public void posordem(node no){
        if(no != null){
            if(no.left != null){
                posordem(no.left);
            }
            if(no.right != null){
                posordem(no.right);
            }
            System.out.println(no.val);
        }
    }
}
