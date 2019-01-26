/*package Arranjo;

/**
 *
 * @author Kainan
 */
/*public class CalcPolonesa{
    public String CalcPolonesa(String express){
        ReservaPilhaArranjo <String> pilha1 = new ReservaPilhaArranjo <String>();
        ReservaPilhaArranjo<String> pilha2 = new ReservaPilhaArranjo<String>();
        int n1, n2, result=0;
        char op;
        String ope[] =  express.split(" ");
        
        for(int i=0; i<ope.length; i++){
            if(itsNumber(ope[i])){
                pilha1.insert(ope[i]);
             }else if((ope[i].equals("+") || ope[i].equals("-") || ope[i].equals("*") || ope[i].equals("/")) && ope.length>=1){
                pilha2.insert(ope[i]);
            }
                     
            if((pilha1.size()>=2) && (pilha2.size()>=1)){
                n1 = Integer.parseInt(pilha1.remove());
                n2 = Integer.parseInt(pilha1.remove());
                op = pilha2.remove().toString().charAt(0);
                switch(op){
                    case '+':
                        result = n1+n2;
                        pilha1.insert(result);
                        break;
                    case '-':
                        result = n1-n2;
                        pilha1.insert(result);
                        break;
                    case '*':
                        result = n1*n2;
                        pilha1.insert(result);
                        break;
                    case '/':
                        if(n2==0){
                            System.out.println("Divisão por 0 não permitida");
                        }else{
                            result = n1/n2;
                            pilha1.insert(result);
                            break;
                        }
                    }
            }else{
                System.out.println("Impossivel operação sem dois operandos");
            }
        }    
        
        return pilha1.remove();
        
    }
        
        private boolean itsNumber(String digito){
            for(int i=0; i<digito.length(); i++){
                if(!Character.isDigit(digito.charAt(i)))
                    return false;
            }
            return true;
        }
    

        
   
}*/
