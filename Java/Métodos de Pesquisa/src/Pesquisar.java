
import java.util.ArrayList;

public class Pesquisar {

    public static int sequencial(int valor, ArrayList<Integer> vetor) {
        int i;

        for (i = 0; i < vetor.size(); i++) {
            if (valor == vetor.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public static int binario(int valor, ArrayList<Integer> vetor) {
        int ini = 0, fim = vetor.size() - 1, meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (vetor.get(meio) == valor) {
                return meio;
            }
            if (valor < vetor.get(meio)) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        return -1;
    }
}
