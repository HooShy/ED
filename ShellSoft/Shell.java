package ShellSoft;

import static ShellSoft.shellsor.Shell;

/**
 *
 * @author Kainan
 */
public class Shell {
    public static void main(String[] atgs){
        int [] array = {5,3,0,2,4,1,0,5,2,3,1,4}; 
        System.out.println("Before Shell Sort");  
        for(int i:array){  
            System.out.print(i+" ");  
        }  
        System.out.println(" ");
        
        Shell(array);
        
        System.out.println("After Shell Sort");  
        for(int i:array){  
            System.out.print(i+" ");  
        }  
        System.out.println(" ");
    }
}
