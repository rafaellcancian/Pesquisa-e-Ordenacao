
import java.util.ArrayList;
import java.util.Random;

public class Ordenar {

    public static void popula(int quantidade, int limite, ArrayList vetor) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            vetor.add(gerador.nextInt(limite));
        }
    }

    public static void exibe(ArrayList vetor) {
        for (int i = 0; i < vetor.size(); i++) {
            System.out.println(vetor.get(i));
        }
    }

    public static void selecao(ArrayList<Integer> vetor) {
        int i, j, posMenor;
        int aux;

        for (i = 0; i < vetor.size() - 1; i++) {
            posMenor = i;
            for (j = i + 1; j < vetor.size(); j++) {
                if (vetor.get(j) < vetor.get(posMenor)) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                aux = vetor.get(i);
                vetor.set(i, vetor.get(posMenor));
                vetor.set(posMenor, aux);
            }
        }
    }

    public static void insercao(ArrayList<Integer> vetor) {
        int i, j;
        int aux;

        for (i = 1; i < vetor.size(); i++) {
            aux = vetor.get(i);
            for (j = i - 1; j >= 0 && aux < vetor.get(j); j--) {
                vetor.set(j + 1, vetor.get(j));
            }
            vetor.set(j + 1, aux);
        }
    }

    public static void bolha(ArrayList<Integer> vetor) {
        int i, aux;
        boolean houveTroca;

        do {
            houveTroca = false;
            for (i = 0; i < vetor.size() - 1; i++) {
                if (vetor.get(i) > vetor.get(i + 1)) {
                    aux = vetor.get(i);
                    vetor.set(i, vetor.get(i + 1));
                    vetor.set(i + 1, aux);
                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }

    public static void agitacao(ArrayList<Integer> vetor) {
        int i, aux, ini = 0, fim = vetor.size();
        boolean houveTroca;

        do {
            //da esquerda para direita
            houveTroca = false;
            for (i = 0; i < fim - 1; i++) {
                if (vetor.get(i) > vetor.get(i + 1)) {
                    aux = vetor.get(i);
                    vetor.set(i, vetor.get(i + 1));
                    vetor.set(i + 1, aux);
                    houveTroca = true;
                }
            }
            fim--;

            if (!houveTroca) {
                break;
            }

            //da direita para esquerda
            houveTroca = false;
            for (i = fim; i > ini; i--) {
                if (vetor.get(i) < vetor.get(i - 1)) {
                    aux = vetor.get(i);
                    vetor.set(i, vetor.get(i - 1));
                    vetor.set(i - 1, aux);
                    houveTroca = true;
                }
            }
            ini++;
        } while (houveTroca && ini < fim);
    }

    public static void pente(ArrayList<Integer> vetor) {
        int i, aux, distancia = vetor.size();
        boolean houveTroca;

        do {
            distancia /= 1.3;
            if (distancia < 1) {
                distancia = 1;
            }

            houveTroca = false;
            for (i = 0; i + distancia < vetor.size(); i++) {
                if (vetor.get(i) > vetor.get(i + distancia)) {
                    aux = vetor.get(i);
                    vetor.set(i, vetor.get(i + distancia));
                    vetor.set(i + distancia, aux);
                    houveTroca = true;
                }
            }
        } while (distancia != 1 || houveTroca);
    }

    public static void shell(ArrayList<Integer> vetor) {
        int i, j, aux, distancia = 1;

        do {
            distancia = 3 * distancia + 1;
        } while (distancia < vetor.size());

        do {
            distancia /= 3;

            for (i = distancia; i < vetor.size(); i++) {
                aux = vetor.get(i);

                for (j = i - distancia; j >= 0 && aux < vetor.get(j); j = j - distancia) {
                    vetor.set(j + distancia, vetor.get(j));
                }
                vetor.set(j + distancia, aux);
            }
        } while (distancia > 1);
    }
}
