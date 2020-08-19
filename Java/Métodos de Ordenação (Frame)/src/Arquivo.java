
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo {

    public static void salvar(int quantidade, int limite, File file) {
        try {
            try (PrintWriter arquivo = new PrintWriter(file + ".txt")) {
                Random gerador = new Random();
                for (int i = 0; i < quantidade; i++) {
                    arquivo.println(gerador.nextInt(limite));
                }
                arquivo.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void abrir(ArrayList vetor, File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                vetor.add(Integer.parseInt(scanner.nextLine()));
            }
            scanner.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
