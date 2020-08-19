
import java.util.ArrayList;
import java.util.Random;


public class Ordenar {
    public static void popula(int quantidade, ArrayList vetor) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            vetor.add(gerador.nextInt(100));
        }
    }

    public static void exibe(ArrayList vetor) {
        for (int i = 0; i < vetor.size(); i++) {
            System.out.println(vetor.get(i));
        }
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
}
