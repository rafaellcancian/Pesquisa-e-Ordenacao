
import java.util.ArrayList;

public class Ordenar {

    public static void bolha(ArrayList<Pessoa> vetor) {
        int i;
        boolean houveTroca;
        Pessoa pessoaAux;

        do {
            houveTroca = false;
            for (i = 0; i < vetor.size() - 1; i++) {
                if (vetor.get(i).getNome().compareTo(vetor.get(i + 1).getNome()) > 0) {
                    pessoaAux = vetor.get(i);
                    vetor.set(i, vetor.get(i + 1));
                    vetor.set(i + 1, pessoaAux);
                    houveTroca = true;
                } 
                else if ((vetor.get(i).getNome().compareTo(vetor.get(i + 1).getNome()) == 0) && (vetor.get(i).getIdade() > vetor.get(i + 1).getIdade())) {
                    pessoaAux = vetor.get(i);
                    vetor.set(i, vetor.get(i + 1));
                    vetor.set(i + 1, pessoaAux);
                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }
}
