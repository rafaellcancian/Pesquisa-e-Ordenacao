
import java.util.ArrayList;

public class Lista {
    
    private static ArrayList<Integer> numeros = new ArrayList<Integer>();

    public static void setNumero(int num) {
        numeros.add(num);
    }
    
    public static int getNumero(int i) {
        return numeros.get(i);
    }
    
    public static int getTamanho() {
        return numeros.size();
    }
    
    public static void limpar() {
        numeros.clear();
    }
}
