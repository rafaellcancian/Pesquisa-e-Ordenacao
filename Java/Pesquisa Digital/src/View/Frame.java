
package View;

import Controller.Pesquisa;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Rafael Cancian, Guilherme Kuhn e Lucas Heinen
 */

public class Frame extends javax.swing.JFrame {

    StyledDocument styledDocument = new DefaultStyledDocument();
    Pesquisa pesquisa = new Pesquisa(this, styledDocument);

    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
        jRadioSimples.setSelected(true);
        jTextAreaResultado.setLineWrap(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoPesquisa = new javax.swing.ButtonGroup();
        jLabelPalavra = new javax.swing.JLabel();
        jTextFieldPalavra = new javax.swing.JTextField();
        jRadioSimples = new javax.swing.JRadioButton();
        jRadioAvancada = new javax.swing.JRadioButton();
        jLabelTipoPesquisa = new javax.swing.JLabel();
        jLabelInsiraTexto = new javax.swing.JLabel();
        jScrollPaneResultado = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabelResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneTexto = new javax.swing.JTextPane(styledDocument);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisa Digital");
        setResizable(false);

        jLabelPalavra.setText("Insira algo para pesquisar:");

        jTextFieldPalavra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPalavraKeyReleased(evt);
            }
        });

        buttonGroupTipoPesquisa.add(jRadioSimples);
        jRadioSimples.setText("Simples");
        jRadioSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSimplesActionPerformed(evt);
            }
        });

        buttonGroupTipoPesquisa.add(jRadioAvancada);
        jRadioAvancada.setText("Avançada");
        jRadioAvancada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAvancadaActionPerformed(evt);
            }
        });

        jLabelTipoPesquisa.setText("Tipo de pesquisa:");

        jLabelInsiraTexto.setText("Insira um texto abaixo:");

        jTextAreaResultado.setEditable(false);
        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jTextAreaResultado.setWrapStyleWord(true);
        jScrollPaneResultado.setViewportView(jTextAreaResultado);

        jLabelResultado.setText("Resultado:");

        jTextPaneTexto.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jTextPaneTexto.setText("Mensagem de teste");
        jScrollPane1.setViewportView(jTextPaneTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextFieldPalavra, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPalavra)
                            .addComponent(jLabelTipoPesquisa)
                            .addComponent(jLabelInsiraTexto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioSimples)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioAvancada))
                            .addComponent(jLabelResultado))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInsiraTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPalavra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTipoPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioSimples)
                    .addComponent(jRadioAvancada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPalavraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPalavraKeyReleased
        if (jRadioSimples.isSelected()) {
            pesquisa.simples(evt);
        } else {
            pesquisa.avancada();
        }
    }//GEN-LAST:event_jTextFieldPalavraKeyReleased

    private void jRadioSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSimplesActionPerformed
        pesquisa.pintarTexto(0, jTextPaneTexto.getText().length(), Color.WHITE);
        jTextAreaResultado.setText("");
    }//GEN-LAST:event_jRadioSimplesActionPerformed

    private void jRadioAvancadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAvancadaActionPerformed
        pesquisa.pintarTexto(0, jTextPaneTexto.getText().length(), Color.WHITE);
        jTextAreaResultado.setText("");
    }//GEN-LAST:event_jRadioAvancadaActionPerformed

    public JTextArea getjTextAreaResultado() {
        return jTextAreaResultado;
    }

    public JTextField getjTextFieldPalavra() {
        return jTextFieldPalavra;
    }

    public JTextPane getjTextPaneTexto() {
        return jTextPaneTexto;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoPesquisa;
    private javax.swing.JLabel jLabelInsiraTexto;
    private javax.swing.JLabel jLabelPalavra;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTipoPesquisa;
    private javax.swing.JRadioButton jRadioAvancada;
    private javax.swing.JRadioButton jRadioSimples;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneResultado;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextField jTextFieldPalavra;
    private javax.swing.JTextPane jTextPaneTexto;
    // End of variables declaration//GEN-END:variables
}
