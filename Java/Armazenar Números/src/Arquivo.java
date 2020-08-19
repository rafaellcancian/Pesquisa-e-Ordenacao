
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo {
    
    public void lerArquivo(String nomeArquivo) {
        File file = new File(nomeArquivo);
        
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                Lista.setNumero(scanner.nextInt());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }       
    } 
}
