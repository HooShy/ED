package ShellSoft;

/**
 * twenth-one pilots
 * @author Kainan
 */
public class shellsor {
    public static void Shell(int[] a){
        int quebra = 1;
        int tam = a.length;
        while(quebra < tam){
            quebra = quebra * 3 ;
        }
        quebra = quebra / 3;
        int aux, index;
        while (quebra > 0) {
            for (int i = quebra; i < tam; i++) {
            aux = a[i];
            index = i;
                while (index >= quebra && a[index - quebra] > aux) {
                    a[index] = a[index - quebra];
                    index = index - quebra;
                }
                a[index] = aux;
            }
        quebra = quebra / 2;
        }
    }
}
