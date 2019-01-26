package HashTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kainan
 */
public class HashTable <T> {
    private int tamanho = 0;
    private List<List<T>> tabela = new ArrayList<List<T>>();
    
    public HashTable(){
        for(int i = 0; i < 26; i++){
            List<T> lista = new LinkedList<T>();
            tabela.add(lista);
        }
    }
    
    public int calculaIndiceTabela(T objeto){
        //int codigoEspalhamento = this.calculaCodigoEspalhamento(palavra);
        
        int codigoEspalhamento = objeto.hashCode();
        codigoEspalhamento = Math.abs(codigoEspalhamento);
        return codigoEspalhamento % this.tabela.size();
        
        //return palavra.toLowerCase().charAt(0)%26;
    }
    
    public void adiciona(T objeto){
        if(!this.contem(objeto)){
            this.verificaCarga();
            int indice = this.calculaIndiceTabela(objeto);
            List<T> lista = this.tabela.get(indice);
            lista.add(objeto);
            this.tamanho++;
        }
    }
    
    public void remove(T objeto){
        if(this.contem(objeto)){
            int indice = this.calculaIndiceTabela(objeto);
            List<T> lista = this.tabela.get(indice);
            lista.remove(objeto);
            this.tamanho--;
            this.verificaCarga();
        }
    }
    
    public boolean contem(T objeto){
        int indice = this.calculaIndiceTabela(objeto);
        List<T> lista = this.tabela.get(indice);
        
        return lista.contains(objeto);
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    public List<T> pegaTodas(){
        List<T> palavras = new ArrayList<T>();
        
        for(int i = 0; i < this.tabela.size(); i++){
            palavras.addAll(this.tabela.get(i));
        }
        
        return palavras;
    }
    
    public int calculaCodigoEspalhamento(String palavra){
        int codigo = 1;
        for(int i = 0; i < palavra.length(); i++){
            codigo = 31 * codigo + palavra.charAt(i);
        }
        
        return codigo;
    }
    
    public void imprimeTabela(){
        System.out.println("\n");
        for(List<T> lista : this.tabela){
            System.out.print("[");
            for(int i = 0; i < lista.size(); i++){
                System.out.print("*");
            }
            System.out.println("]");
        }
        System.out.println("\n");
        System.out.println(tabela);
    }
    
    private void redimencionaTabela(int novaCapacidade){
        List<T> palavras = this.pegaTodas();
        this.tabela.clear();
        
        for(int i = 0; i < novaCapacidade; i++){
            this.tabela.add(new LinkedList<T>());
        }
        
        for(T palavra : palavras){
            this.adiciona(palavra);
        }
    }
    
    private void verificaCarga(){
        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;
        
        if(carga >= 0.75){
            this.redimencionaTabela(capacidade * 2);
        }else if(carga <=0.25){
            this.redimencionaTabela(Math.max(capacidade/2, 10));
        }
    }
}
