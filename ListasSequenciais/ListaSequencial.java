package ListasSequenciais;

import java.util.Arrays;

/**
 *
 * @author Kainan
 */
public class ListaSequencial <hoosh>{
    
    private int tamVetor = 0;
    private Object[] objetos = new Object[100];
    
    public void adiciona(Object exemplo){
        // tamanho linear
        /*
        this.redimencionar();
        for(int i = 0; i < this.objetos.length; i++){
            if(this.objetos[i] == null){
                this.objetos[i] = exemplo;
                tamVetor++;
                break;
            }
        
        }*/    
        
        // tamanho constante
        this.redimencionar();
        this.objetos[this.tamVetor] = exemplo;
        tamVetor++;
    }
    
    public void adicionaPos(int posicao, Object exemplo){
        this.redimencionar();
        if(!ocupado(posicao)){
            System.out.println("POSICÃO OCUPADA");
        }
        
        for(int i = tamVetor; i >= posicao; i--){
            this.objetos[i + 1] = this.objetos[i]; 
        }
        
        this.objetos[posicao] = exemplo;
        tamVetor++;
    }
    
    public Object pega(int posicao){
        return this.objetos[posicao];
    }
    
    public void remove(int posicao){
        if(posicao >=0 && posicao < tamVetor){
            if(!ocupado(posicao)){
                System.out.println("NADA A REMOVER");
            }
            if(posicao == tamVetor-1){
                objetos[posicao] = null;
            }else{
                int i = posicao;
                while(tamVetor > i){
                    objetos[i] = objetos[i+1];
                    objetos[i+1] = null;
                    i++;
                }
            }
            this.tamVetor--;
        }   
    }
    
    public boolean contem(Object exemplo){
        for(int i = 0; i < objetos.length; i++){
            if(exemplo == objetos[i]){
                return true;
            }
        }
        return false;
    }
    
    public int tamanho(){
        return this.tamVetor;
    }
    
    public String toString(){
        return Arrays.toString(objetos);
    }
    
    private boolean ocupado(int posicao) {
        return posicao >= 0 && posicao < this.tamVetor;
    }
    
    private void redimencionar(){
        if(tamVetor == objetos.length){
            Object[] novo = new Object[objetos.length * 2];
            for(int i = 0; i < objetos.length; i++){
                novo[i] = objetos[i];
            }
            this.objetos = novo;
        }
    }
    
    public void mostrar(){
        System.out.print("[ ");
        for(int i = 0; i <= tamVetor; i++){
            if(objetos[i] != null){
                if(objetos[i+1]==null){
                    System.out.print(objetos[i]+" ]");
                }else{
                    System.out.print(objetos[i]+" | ");
                }
            }
        }
        System.out.println("\n");
    }
    
    public Object Search(Object exemplo){
        System.out.print(this.contem(exemplo)+" ");
        for(int i = 0; i < tamVetor; i++){
            if(exemplo == objetos[i]){
                return objetos[i];
            }
        }
        return null;
    }
}
