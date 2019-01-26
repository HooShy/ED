package HashTable;

import java.util.List;

/**
 *
 * @author Kainan
 */
public class Main {
    public static void main(String[] args){
        
        //long inicio = System.currentTimeMillis();
        HashTable conjunto = new HashTable();
        
        /*for(int i = 0; i < 50000; i++){
            conjunto.adiciona("palavra"+i);
        }
        
         for(int i = 0; i < 50000; i++){
            conjunto.contem("palavra"+i);
        }
         
         long fim = System.currentTimeMillis();
         System.out.println("TEMPO: " + (fim - inicio)/1000.0);*/
        

        conjunto.adiciona("palavra");
        conjunto.adiciona("computador");
        conjunto.adiciona("apostila");
        conjunto.adiciona("mesa");
        conjunto.adiciona("telefone");
        conjunto.adiciona("papai noel");
        
        List<String> palavras = conjunto.pegaTodas();
        
        for(String palavra : palavras){
            System.out.println(palavra);
        }
        
        if(!conjunto.contem("apostila")){
            System.out.println("ERRO: não tem a palavra: apostila");
        }
        
        conjunto.remove("apostila");
        
        if(!conjunto.contem("apostila")){
            System.out.println("ERRO: não tem a palavra: apostila");
        }
        
        if(conjunto.tamanho() != 5){
            System.out.println("ERRO: o tamanho deveria ser 5");
        }
        
        palavras = conjunto.pegaTodas();
        
        for(String palavra : palavras){
            System.out.println(palavra);
        }
        
        /*for (int i = 0; i < 100; i++) {
            conjunto.adiciona("" + i);
        }*/
        conjunto.imprimeTabela();
        
        
        
        
        
    }
}
