
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        int TAM = 100000;
        long inicio;

        ArrayList<Integer> vetorGeral = new ArrayList<>();
        Ordenar.popula(TAM, vetorGeral);
        Ordenar.exibe(vetorGeral);
        Ordenar.pente(vetorGeral);
        
        int valorSequencial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor para pesquisar utilizando busca sequencial:"));
        inicio = System.nanoTime();
        int buscaSequencial = Pesquisar.sequencial(valorSequencial, vetorGeral);
        
        if (buscaSequencial == -1) {
            System.out.println("Tempo busca sequencial (NÃO ENCONTRADO): " + timer(inicio) + "µs");
        } else {
            System.out.println("Tempo busca sequencial: " + timer(inicio) + "µs");
        }
        
        int valorBinaria = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor para pesquisar utilizando busca binaria:"));    
        inicio = System.nanoTime();
        int buscaBinaria = Pesquisar.binario(valorBinaria, vetorGeral);
        
        if (buscaBinaria == -1) {
            System.out.println("Tempo busca binaria (NÃO ENCONTRADO): " + timer(inicio) + "µs");
        } else {
            System.out.println("Tempo busca binaria: " + timer(inicio) + "µs");
        }
    }
    
    public static long timer(long inicio) {
        long duracao = ((System.nanoTime() - inicio) / 1000);
        return duracao;
    }
}
