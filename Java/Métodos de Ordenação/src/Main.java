
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int TAM = 100000;
        long inicio;

        ArrayList<Integer> vetorGeral = new ArrayList<>();
        Ordenar.popula(TAM, vetorGeral);

        ArrayList<Integer> vetor1 = new ArrayList<>(vetorGeral);
        ArrayList<Integer> vetor2 = new ArrayList<>(vetorGeral);
        ArrayList<Integer> vetor3 = new ArrayList<>(vetorGeral);
        ArrayList<Integer> vetor4 = new ArrayList<>(vetorGeral);
        ArrayList<Integer> vetor5 = new ArrayList<>(vetorGeral);

        //Seleção
        inicio = System.nanoTime();
        Ordenar.selecao(vetor1);
        System.out.println("Tempo seleção: " + timer(inicio) + "ms");

        //Inserção
        inicio = System.nanoTime();
        Ordenar.insercao(vetor2);
        System.out.println("Tempo inserção: " + timer(inicio) + "ms");

        //Bolha
        inicio = System.nanoTime();
        Ordenar.bolha(vetor3);
        System.out.println("Tempo bolha: " + timer(inicio) + "ms");

        //Agitação
        inicio = System.nanoTime();
        Ordenar.agitacao(vetor4);
        System.out.println("Tempo agitação: " + timer(inicio) + "ms");

        //Pente
        inicio = System.nanoTime();
        Ordenar.pente(vetor5);
        System.out.println("Tempo pente: " + timer(inicio) + "ms");
    }
    
    public static long timer(long inicio) {
        long duracao = ((System.nanoTime() - inicio) / 1000000);
        return duracao;
    }
}
