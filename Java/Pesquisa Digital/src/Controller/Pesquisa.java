
package Controller;

import View.Frame;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Rafael Cancian, Guilherme Kuhn e Lucas Heinen
 */

public class Pesquisa {

    private final Frame frame;
    private final StyledDocument styledDocument;

    public Pesquisa(Frame frame, StyledDocument styledDocument) {
        this.frame = frame;
        this.styledDocument = styledDocument;
    }

    public void simples(java.awt.event.KeyEvent evt) {
        int inicio, fim, count = 0;
        String texto = frame.getjTextPaneTexto().getText().toLowerCase();
        String palavra = frame.getjTextFieldPalavra().getText().toLowerCase();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            frame.getjTextAreaResultado().setText("");
            if (frame.getjTextFieldPalavra().getText().length() > 0) {
                inicio = texto.indexOf(palavra);
                fim = (inicio + palavra.length()) - 1;
                while (inicio != -1) {
                    count++;
                    frame.getjTextAreaResultado().setText(frame.getjTextAreaResultado().getText() + count + "ª: [" + inicio + ", " + fim + "]" + "\n");
                    inicio = texto.indexOf(palavra, inicio + 1);
                    fim = (inicio + palavra.length()) - 1;
                }
                frame.getjTextAreaResultado().setText("A palavra \"" + palavra + "\" aparece " + count + " vezes, nas seguintes posições:\n" + frame.getjTextAreaResultado().getText());
            } else {
                JOptionPane.showMessageDialog(null, "Insira algo para pesquisar.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void avancada() {
        int inicio, fim, count = 0;
        String texto = frame.getjTextPaneTexto().getText().toLowerCase();
        String palavra = frame.getjTextFieldPalavra().getText().toLowerCase();
        pintarTexto(0, texto.length(), Color.WHITE);
        frame.getjTextAreaResultado().setText("");

        if (frame.getjTextFieldPalavra().getText().length() > 0) {
            inicio = texto.indexOf(palavra);
            fim = (inicio + palavra.length()) - 1;
            while (inicio != -1) {
                count++;
                pintarTexto(inicio, palavra.length(), Color.YELLOW);
                frame.getjTextAreaResultado().setText(frame.getjTextAreaResultado().getText() + count + "ª: [" + inicio + ", " + fim + "]" + "\n");
                inicio = texto.indexOf(palavra, inicio + 1);
                fim = (inicio + palavra.length()) - 1;
            }
            frame.getjTextAreaResultado().setText("A palavra \"" + palavra + "\" aparece " + count + " vezes, nas seguintes posições:\n" + frame.getjTextAreaResultado().getText());
        }
    }

    public void pintarTexto(int posicao, int tamanho, Color cor) {
        SimpleAttributeSet style = new SimpleAttributeSet();
        StyleConstants.setBackground(style, cor);
        styledDocument.setCharacterAttributes(posicao, tamanho, style, false);
    }
}
