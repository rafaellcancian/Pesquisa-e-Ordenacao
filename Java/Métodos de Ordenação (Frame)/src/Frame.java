
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.JFileChooser;

public class Frame extends javax.swing.JFrame {

    int selecionado, finalizado;
    long inicio;
    boolean trava;
    File arquivoAbrir;

    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
        ((DefaultEditor) jSpinnerQuantidadeNumeros.getEditor()).getTextField().setEditable(false);
        ((DefaultEditor) jSpinnerLimiteNumeros.getEditor()).getTextField().setEditable(false);
        jFileChooserSalvar.setFileFilter(new FileNameExtensionFilter("Documentos de texto (*.txt)", "txt"));
        jFileChooserAbrir.setFileFilter(new FileNameExtensionFilter("Documentos de texto (*.txt)", "txt"));
        jLabelArquivoSelecionado.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameFileChooserSalvar = new javax.swing.JFrame();
        jFileChooserSalvar = new javax.swing.JFileChooser();
        buttonGroupTipoOrdenacao = new javax.swing.ButtonGroup();
        jFrameFileChooserAbrir = new javax.swing.JFrame();
        jFileChooserAbrir = new javax.swing.JFileChooser();
        jPanelMetodos = new javax.swing.JPanel();
        jCheckSelecao = new javax.swing.JCheckBox();
        jCheckInsercao = new javax.swing.JCheckBox();
        jCheckBolha = new javax.swing.JCheckBox();
        jCheckAgitacao = new javax.swing.JCheckBox();
        jCheckPente = new javax.swing.JCheckBox();
        jCheckShell = new javax.swing.JCheckBox();
        jProgressBar = new javax.swing.JProgressBar();
        jPanelStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jPanelTempos = new javax.swing.JPanel();
        jLabelSelecao = new javax.swing.JLabel();
        jLabelInsercao = new javax.swing.JLabel();
        jLabelBolha = new javax.swing.JLabel();
        jLabelAgitacao = new javax.swing.JLabel();
        jLabelPente = new javax.swing.JLabel();
        jLabelShell = new javax.swing.JLabel();
        jButtonIniciar = new javax.swing.JButton();
        jSpinnerQuantidadeNumeros = new javax.swing.JSpinner();
        jLabelNumerosOrdenar = new javax.swing.JLabel();
        jButtonGerarArquivo = new javax.swing.JButton();
        jLabelNumerosGerados = new javax.swing.JLabel();
        jSpinnerLimiteNumeros = new javax.swing.JSpinner();
        jRadioArquivo = new javax.swing.JRadioButton();
        jRadioAleatorios = new javax.swing.JRadioButton();
        jLabelTipoOrdenacao = new javax.swing.JLabel();
        jLabelArquivoSelecionado = new javax.swing.JLabel();

        jFrameFileChooserSalvar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameFileChooserSalvar.setTitle("Métodos de Ordenação: Gerar arquivo");
        jFrameFileChooserSalvar.setResizable(false);

        jFileChooserSalvar.setAcceptAllFileFilterUsed(false);
        jFileChooserSalvar.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooserSalvar.setApproveButtonText("Gerar");
        jFileChooserSalvar.setCurrentDirectory(new java.io.File("C:\\Users\\Rafael\\Desktop"));
        jFileChooserSalvar.setDialogTitle("");
        jFileChooserSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameFileChooserSalvarLayout = new javax.swing.GroupLayout(jFrameFileChooserSalvar.getContentPane());
        jFrameFileChooserSalvar.getContentPane().setLayout(jFrameFileChooserSalvarLayout);
        jFrameFileChooserSalvarLayout.setHorizontalGroup(
            jFrameFileChooserSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooserSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        jFrameFileChooserSalvarLayout.setVerticalGroup(
            jFrameFileChooserSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooserSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        jFrameFileChooserAbrir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameFileChooserAbrir.setTitle("Métodos de Ordenação: Abrir arquivo");
        jFrameFileChooserAbrir.setResizable(false);

        jFileChooserAbrir.setAcceptAllFileFilterUsed(false);
        jFileChooserAbrir.setCurrentDirectory(new java.io.File("C:\\Users\\Rafael\\Desktop"));
        jFileChooserAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameFileChooserAbrirLayout = new javax.swing.GroupLayout(jFrameFileChooserAbrir.getContentPane());
        jFrameFileChooserAbrir.getContentPane().setLayout(jFrameFileChooserAbrirLayout);
        jFrameFileChooserAbrirLayout.setHorizontalGroup(
            jFrameFileChooserAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooserAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        jFrameFileChooserAbrirLayout.setVerticalGroup(
            jFrameFileChooserAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooserAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Métodos de Ordenação");
        setResizable(false);

        jPanelMetodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Métodos"));
        jPanelMetodos.setName(""); // NOI18N

        jCheckSelecao.setText("Seleção");
        jCheckSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSelecaoActionPerformed(evt);
            }
        });

        jCheckInsercao.setText("Inserção");
        jCheckInsercao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckInsercaoActionPerformed(evt);
            }
        });

        jCheckBolha.setText("Bolha");
        jCheckBolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBolhaActionPerformed(evt);
            }
        });

        jCheckAgitacao.setText("Agitação");
        jCheckAgitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckAgitacaoActionPerformed(evt);
            }
        });

        jCheckPente.setText("Pente");
        jCheckPente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckPenteActionPerformed(evt);
            }
        });

        jCheckShell.setText("Shell");
        jCheckShell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckShellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMetodosLayout = new javax.swing.GroupLayout(jPanelMetodos);
        jPanelMetodos.setLayout(jPanelMetodosLayout);
        jPanelMetodosLayout.setHorizontalGroup(
            jPanelMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMetodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMetodosLayout.createSequentialGroup()
                        .addComponent(jCheckSelecao)
                        .addGap(82, 82, 82)
                        .addComponent(jCheckShell))
                    .addComponent(jCheckAgitacao)
                    .addComponent(jCheckPente)
                    .addComponent(jCheckBolha)
                    .addComponent(jCheckInsercao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMetodosLayout.setVerticalGroup(
            jPanelMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMetodosLayout.createSequentialGroup()
                .addGroup(jPanelMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckSelecao)
                    .addComponent(jCheckShell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckInsercao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBolha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckAgitacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckPente)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jProgressBar.setStringPainted(true);

        jPanelStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        jLabelStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus.setText("PRONTO");
        jLabelStatus.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelStatus, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanelTempos.setBorder(javax.swing.BorderFactory.createTitledBorder("Tempos"));

        jLabelSelecao.setText("Tempo seleção: N/S");
        jLabelSelecao.setEnabled(false);

        jLabelInsercao.setText("Tempo inserção: N/S");
        jLabelInsercao.setEnabled(false);

        jLabelBolha.setText("Tempo bolha: N/S");
        jLabelBolha.setEnabled(false);

        jLabelAgitacao.setText("Tempo agitação: N/S");
        jLabelAgitacao.setEnabled(false);

        jLabelPente.setText("Tempo pente: N/S");
        jLabelPente.setEnabled(false);

        jLabelShell.setText("Tempo shell: N/S");
        jLabelShell.setEnabled(false);

        javax.swing.GroupLayout jPanelTemposLayout = new javax.swing.GroupLayout(jPanelTempos);
        jPanelTempos.setLayout(jPanelTemposLayout);
        jPanelTemposLayout.setHorizontalGroup(
            jPanelTemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInsercao)
                    .addComponent(jLabelBolha)
                    .addComponent(jLabelAgitacao)
                    .addComponent(jLabelPente)
                    .addComponent(jLabelSelecao)
                    .addComponent(jLabelShell))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTemposLayout.setVerticalGroup(
            jPanelTemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemposLayout.createSequentialGroup()
                .addComponent(jLabelSelecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInsercao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBolha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAgitacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelShell))
        );

        jButtonIniciar.setText("INICIAR ORDENAÇÃO");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jSpinnerQuantidadeNumeros.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000000, 25000));

        jLabelNumerosOrdenar.setText("Números para ordenar:");

        jButtonGerarArquivo.setText("Gerar arquivo...");
        jButtonGerarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarArquivoActionPerformed(evt);
            }
        });

        jLabelNumerosGerados.setText("Gerar números de 0 à:");

        jSpinnerLimiteNumeros.setModel(new javax.swing.SpinnerNumberModel(1000, 0, 1000000, 100));

        buttonGroupTipoOrdenacao.add(jRadioArquivo);
        jRadioArquivo.setText("De um arquivo...");
        jRadioArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioArquivoActionPerformed(evt);
            }
        });

        buttonGroupTipoOrdenacao.add(jRadioAleatorios);
        jRadioAleatorios.setSelected(true);
        jRadioAleatorios.setText("Aleatórios");
        jRadioAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAleatoriosActionPerformed(evt);
            }
        });

        jLabelTipoOrdenacao.setText("Utilizar números:");

        jLabelArquivoSelecionado.setText("Arquivo selecionado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMetodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTempos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelNumerosOrdenar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumerosGerados)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerQuantidadeNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonGerarArquivo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerLimiteNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelArquivoSelecionado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIniciar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTipoOrdenacao)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioAleatorios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioArquivo)))
                        .addGap(220, 220, 220)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTempos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGerarArquivo)
                    .addComponent(jSpinnerQuantidadeNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumerosOrdenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumerosGerados)
                    .addComponent(jSpinnerLimiteNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTipoOrdenacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioAleatorios)
                    .addComponent(jRadioArquivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIniciar)
                    .addComponent(jLabelArquivoSelecionado))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        if (verificarErros() == false) {
            limparMetodos();
            travarMetodos();

            int quantidade = (int) jSpinnerQuantidadeNumeros.getValue();
            int limite = (int) jSpinnerLimiteNumeros.getValue();
            ArrayList<Integer> vetorGeral = new ArrayList<>();

            if (jRadioAleatorios.isSelected()) {
                Ordenar.popula(quantidade, limite, vetorGeral);
            } else {
                Arquivo.abrir(vetorGeral, arquivoAbrir);
            }

            trava = false;

            Runnable threadGeral = new Runnable() {
                @Override
                public void run() {
                    jLabelStatus.setText("Ordenando...");
                    jProgressBar.setValue(0);
                }
            };
            new Thread(threadGeral).start();

            if (jCheckSelecao.isSelected()) {
                selecionado++;
                Runnable threadSelecao = new Runnable() {
                    @Override
                    public void run() {
                        ArrayList<Integer> vetorSelecao = new ArrayList<>(vetorGeral);
                        inicio = System.nanoTime();
                        Ordenar.selecao(vetorSelecao);
                        jLabelSelecao.setText("Tempo seleção: " + timer(inicio) + "ms");
                        jLabelStatus.setText("Seleção finalizado.");
                        finalizado++;
                        barraProgresso();
                    }
                };
                new Thread(threadSelecao).start();
            }
            if (jCheckInsercao.isSelected()) {
                selecionado++;
                Runnable threadInsercao = new Runnable() {
                    @Override
                    public void run() {
                        ArrayList<Integer> vetorInsercao = new ArrayList<>(vetorGeral);
                        inicio = System.nanoTime();
                        Ordenar.insercao(vetorInsercao);
                        jLabelInsercao.setText("Tempo inserção: " + timer(inicio) + "ms");
                        jLabelStatus.setText("Inserção finalizado.");
                        finalizado++;
                        barraProgresso();
                    }
                };
                new Thread(threadInsercao).start();
            }
            if (jCheckBolha.isSelected()) {
                selecionado++;
                Runnable threadBolha = new Runnable() {
                    @Override
                    public void run() {
                        ArrayList<Integer> vetorBolha = new ArrayList<>(vetorGeral);
                        inicio = System.nanoTime();
                        Ordenar.bolha(vetorBolha);
                        jLabelBolha.setText("Tempo bolha: " + timer(inicio) + "ms");
                        jLabelStatus.setText("Bolha finalizado.");
                        finalizado++;
                        barraProgresso();
                    }
                };
                new Thread(threadBolha).start();
            }
            if (jCheckAgitacao.isSelected()) {
                selecionado++;
                Runnable threadAgitacao = new Runnable() {
                    @Override
                    public void run() {
                        ArrayList<Integer> vetorAgitacao = new ArrayList<>(vetorGeral);
                        inicio = System.nanoTime();
                        Ordenar.agitacao(vetorAgitacao);
                        jLabelAgitacao.setText("Tempo agitação: " + timer(inicio) + "ms");
                        jLabelStatus.setText("Agitação finalizado.");
                        finalizado++;
                        barraProgresso();
                    }
                };
                new Thread(threadAgitacao).start();
            }
            if (jCheckPente.isSelected()) {
                selecionado++;
                Runnable threadPente = new Runnable() {
                    @Override
                    public void run() {
                        ArrayList<Integer> vetorPente = new ArrayList<>(vetorGeral);
                        inicio = System.nanoTime();
                        Ordenar.pente(vetorPente);
                        jLabelPente.setText("Tempo pente: " + timer(inicio) + "ms");
                        jLabelStatus.setText("Pente finalizado.");
                        finalizado++;
                        barraProgresso();
                    }
                };
                new Thread(threadPente).start();
            }
            if (jCheckShell.isSelected()) {
                selecionado++;
                Runnable threadShell = new Runnable() {
                    @Override
                    public void run() {
                        ArrayList<Integer> vetorShell = new ArrayList<>(vetorGeral);
                        inicio = System.nanoTime();
                        Ordenar.shell(vetorShell);
                        jLabelShell.setText("Tempo shell: " + timer(inicio) + "ms");
                        jLabelStatus.setText("Shell finalizado.");
                        finalizado++;
                        barraProgresso();
                    }
                };
                new Thread(threadShell).start();
            }
        }
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jCheckSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSelecaoActionPerformed
        if (jCheckSelecao.isSelected()) {
            jLabelSelecao.setEnabled(true);
            jLabelSelecao.setText("Tempo seleção:");
        } else {
            jLabelSelecao.setEnabled(false);
            jLabelSelecao.setText("Tempo seleção: N/S");
        }
    }//GEN-LAST:event_jCheckSelecaoActionPerformed

    private void jCheckInsercaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckInsercaoActionPerformed
        if (jCheckInsercao.isSelected()) {
            jLabelInsercao.setEnabled(true);
            jLabelInsercao.setText("Tempo inserção:");
        } else {
            jLabelInsercao.setEnabled(false);
            jLabelInsercao.setText("Tempo inserção: N/S");
        }
    }//GEN-LAST:event_jCheckInsercaoActionPerformed

    private void jCheckBolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBolhaActionPerformed
        if (jCheckBolha.isSelected()) {
            jLabelBolha.setEnabled(true);
            jLabelBolha.setText("Tempo bolha:");
        } else {
            jLabelBolha.setEnabled(false);
            jLabelBolha.setText("Tempo bolha: N/S");
        }
    }//GEN-LAST:event_jCheckBolhaActionPerformed

    private void jCheckAgitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckAgitacaoActionPerformed
        if (jCheckAgitacao.isSelected()) {
            jLabelAgitacao.setEnabled(true);
            jLabelAgitacao.setText("Tempo agitação:");
        } else {
            jLabelAgitacao.setEnabled(false);
            jLabelAgitacao.setText("Tempo agitação: N/S");
        }
    }//GEN-LAST:event_jCheckAgitacaoActionPerformed

    private void jCheckPenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckPenteActionPerformed
        if (jCheckPente.isSelected()) {
            jLabelPente.setEnabled(true);
            jLabelPente.setText("Tempo pente:");
        } else {
            jLabelPente.setEnabled(false);
            jLabelPente.setText("Tempo pente: N/S");
        }
    }//GEN-LAST:event_jCheckPenteActionPerformed

    private void jCheckShellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckShellActionPerformed
        if (jCheckShell.isSelected()) {
            jLabelShell.setEnabled(true);
            jLabelShell.setText("Tempo shell:");
        } else {
            jLabelShell.setEnabled(false);
            jLabelShell.setText("Tempo shell: N/S");
        }
    }//GEN-LAST:event_jCheckShellActionPerformed

    private void jButtonGerarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarArquivoActionPerformed
        jFrameFileChooserSalvar.setVisible(true);
        jFrameFileChooserSalvar.setSize(634, 419);
    }//GEN-LAST:event_jButtonGerarArquivoActionPerformed

    private void jFileChooserSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooserSalvarActionPerformed
        File arquivoSalvar = new File(jFileChooserSalvar.getSelectedFile() + ".txt");
        if (arquivoSalvar.exists()) {
            JOptionPane.showMessageDialog(this, "O arquivo selecionado já existe.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            int quantidade = (int) jSpinnerQuantidadeNumeros.getValue();
            int limite = (int) jSpinnerLimiteNumeros.getValue();

            Arquivo.salvar(quantidade, limite, jFileChooserSalvar.getSelectedFile());
            jFrameFileChooserSalvar.dispose();
        }
    }//GEN-LAST:event_jFileChooserSalvarActionPerformed

    private void jFileChooserAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooserAbrirActionPerformed
        if (jFileChooserAbrir.getSelectedFile().exists()) {
            arquivoAbrir = jFileChooserAbrir.getSelectedFile();
            jFrameFileChooserAbrir.dispose();
            jLabelArquivoSelecionado.setText("Arquivo selecionado: " + arquivoAbrir.getName());
        } else {
            JOptionPane.showMessageDialog(this, "O arquivo selecionado não existe.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jFileChooserAbrirActionPerformed

    private void jRadioArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioArquivoActionPerformed
        jFrameFileChooserAbrir.setVisible(true);
        jFrameFileChooserAbrir.setSize(634, 419);
    }//GEN-LAST:event_jRadioArquivoActionPerformed

    private void jRadioAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAleatoriosActionPerformed
        jLabelArquivoSelecionado.setText("");
    }//GEN-LAST:event_jRadioAleatoriosActionPerformed

    public boolean verificarErros() {
        boolean erro = false;
        if (jRadioAleatorios.isSelected()) {
            if ((!jCheckSelecao.isSelected()) && (!jCheckInsercao.isSelected()) && (!jCheckBolha.isSelected())
                    && (!jCheckAgitacao.isSelected()) && (!jCheckPente.isSelected()) && (!jCheckShell.isSelected())) {
                JOptionPane.showMessageDialog(this, "Por favor selecione um método de ordenação.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                erro = true;
            } else if ((int) jSpinnerQuantidadeNumeros.getValue() == 0) {
                JOptionPane.showMessageDialog(this, "Por favor defina uma quantidade de números para ordenar.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                erro = true;
            } else if ((int) jSpinnerLimiteNumeros.getValue() == 0) {
                JOptionPane.showMessageDialog(this, "Por favor defina um limite de números para ordenar.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                erro = true;
            }
        } else {
            if ((!jCheckSelecao.isSelected()) && (!jCheckInsercao.isSelected()) && (!jCheckBolha.isSelected())
                    && (!jCheckAgitacao.isSelected()) && (!jCheckPente.isSelected()) && (!jCheckShell.isSelected())) {
                JOptionPane.showMessageDialog(this, "Por favor selecione um método de ordenação.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                erro = true;
            }
        }

        return erro;
    }

    public void limparMetodos() {
        if (jCheckSelecao.isSelected()) {
            jLabelSelecao.setText("Tempo seleção:");
        }
        if (jCheckInsercao.isSelected()) {
            jLabelInsercao.setText("Tempo inserção:");
        }
        if (jCheckBolha.isSelected()) {
            jLabelBolha.setText("Tempo bolha:");
        }
        if (jCheckAgitacao.isSelected()) {
            jLabelAgitacao.setText("Tempo agitação:");
        }
        if (jCheckPente.isSelected()) {
            jLabelPente.setText("Tempo pente:");
        }
        if (jCheckShell.isSelected()) {
            jLabelShell.setText("Tempo shell:");
        }
    }

    public void travarMetodos() {
        jCheckSelecao.setEnabled(false);
        jCheckInsercao.setEnabled(false);
        jCheckBolha.setEnabled(false);
        jCheckAgitacao.setEnabled(false);
        jCheckPente.setEnabled(false);
        jCheckShell.setEnabled(false);
        jButtonIniciar.setEnabled(false);
        jButtonGerarArquivo.setEnabled(false);
        jSpinnerQuantidadeNumeros.setEnabled(false);
        jSpinnerLimiteNumeros.setEnabled(false);
        jRadioAleatorios.setEnabled(false);
        jRadioArquivo.setEnabled(false);
    }

    public void destravarMetodos() {
        jCheckSelecao.setEnabled(true);
        jCheckInsercao.setEnabled(true);
        jCheckBolha.setEnabled(true);
        jCheckAgitacao.setEnabled(true);
        jCheckPente.setEnabled(true);
        jCheckShell.setEnabled(true);
        jButtonIniciar.setEnabled(true);
        jButtonGerarArquivo.setEnabled(true);
        jSpinnerQuantidadeNumeros.setEnabled(true);
        jSpinnerLimiteNumeros.setEnabled(true);
        jRadioAleatorios.setEnabled(true);
        jRadioArquivo.setEnabled(true);
    }

    public long timer(long inicio) {
        long duracao = ((System.nanoTime() - inicio) / 1000000);
        return duracao;
    }

    public void barraProgresso() {
        Runnable threadBarraProgresso = new Runnable() {
            @Override
            public void run() {
                if (trava == false) {
                    jProgressBar.setMaximum(selecionado);
                    trava = true;
                }
                jProgressBar.setValue(finalizado);

                if (selecionado == finalizado) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    destravarMetodos();
                    jLabelStatus.setText("FINALIZADO");
                    selecionado = 0;
                    finalizado = 0;
                }
            }
        };
        new Thread(threadBarraProgresso).start();
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
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoOrdenacao;
    private javax.swing.JButton jButtonGerarArquivo;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JCheckBox jCheckAgitacao;
    private javax.swing.JCheckBox jCheckBolha;
    private javax.swing.JCheckBox jCheckInsercao;
    private javax.swing.JCheckBox jCheckPente;
    private javax.swing.JCheckBox jCheckSelecao;
    private javax.swing.JCheckBox jCheckShell;
    private javax.swing.JFileChooser jFileChooserAbrir;
    private javax.swing.JFileChooser jFileChooserSalvar;
    private javax.swing.JFrame jFrameFileChooserAbrir;
    private javax.swing.JFrame jFrameFileChooserSalvar;
    private javax.swing.JLabel jLabelAgitacao;
    private javax.swing.JLabel jLabelArquivoSelecionado;
    private javax.swing.JLabel jLabelBolha;
    private javax.swing.JLabel jLabelInsercao;
    private javax.swing.JLabel jLabelNumerosGerados;
    private javax.swing.JLabel jLabelNumerosOrdenar;
    private javax.swing.JLabel jLabelPente;
    private javax.swing.JLabel jLabelSelecao;
    private javax.swing.JLabel jLabelShell;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTipoOrdenacao;
    private javax.swing.JPanel jPanelMetodos;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JPanel jPanelTempos;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JRadioButton jRadioAleatorios;
    private javax.swing.JRadioButton jRadioArquivo;
    private javax.swing.JSpinner jSpinnerLimiteNumeros;
    private javax.swing.JSpinner jSpinnerQuantidadeNumeros;
    // End of variables declaration//GEN-END:variables
}
