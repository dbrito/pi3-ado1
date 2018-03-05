package senac.ads.pi3.gerenciador_produtos.ui;

import java.awt.Dimension;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import senac.ads.pi3.gerenciador_produtos.model.Produto;
import senac.ads.pi3.gerenciador_produtos.service.ServicoProduto;

/**
 * Tela de consulta de produtos
 */
public class TelaConsultarProdutos extends javax.swing.JInternalFrame {

    //Instância do form de edição de produtos
    TelaEditarProduto formEditarProduto = new TelaEditarProduto();
    
    /**
     * Construtor e inicialização de componentes
     */
    public TelaConsultarProdutos() {
        initComponents();
    }

    //Atualiza a lista de produtos. Pode ser chamado por outras telas
    public boolean refreshList() throws Exception {                
        List<Produto> resultado = ServicoProduto.procurarProduto(null);
                
        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();                
        model.setRowCount(0);

        //Verifica se houve retorno da busca        
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        //Percorre a lista de resultados e os adiciona na tabela
        for (int i = 0; i < resultado.size(); i++) {
            Produto prd = resultado.get(i);
            if (prd != null) {
                Object[] row = new Object[5];
                row[0] = prd.getId();
                row[1] = prd.getNome();
                row[2] = NumberFormat.getCurrencyInstance().format(prd.getPrecoCompra());                
                row[3] = NumberFormat.getCurrencyInstance().format(prd.getPrecoVenda());                
                row[4] = prd.getQuantidade();
                model.addRow(row);
            }
        }        
        return true;
    }
    
    private void editaProduto() {
        try {
            //Obtém a linha selecionada na tabela de resultados
            final int row = tabelaResultados.getSelectedRow();
            //Verifica se há linha selecionada na tabela
            if (row >= 0) {
                //Obtém a linha selecionada na tabela
                int id = (int) tabelaResultados.getValueAt(row, 0);                
                Produto pro = ServicoProduto.obterProduto(id);
                
                formEditarProduto.dispose();
                formEditarProduto = new TelaEditarProduto();
                formEditarProduto.setProduto(pro);
                formEditarProduto.setTitle("Produto: " + pro.getNome());
                this.getParent().add(formEditarProduto);
                this.openFrameInCenter(formEditarProduto);                
                formEditarProduto.toFront();
            }
        } catch (Exception e) {            
            e.printStackTrace();            
            JOptionPane.showMessageDialog(rootPane, "Não é possível exibir os detalhes deste produto.", "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Código criado pelo GUI Builder para montagem da tela
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTabelaResultados = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        buttonFechar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Produtos");

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Preço Compra", "Preço Venda", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResultados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaResultadosMouseClicked(evt);
            }
        });
        scrollTabelaResultados.setViewportView(tabelaResultados);

        buttonFechar.setText("Fechar");
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });

        buttonAlterar.setText("Alterar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabelaResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAlterar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabelaResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFechar)
                    .addComponent(buttonAlterar)
                    .addComponent(buttonExcluir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Listener do botão fechar
    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonFecharActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        //Verifica se há itens selecionados para exclusão.
        //Caso negativo, ignora o comando
        if (tabelaResultados.getSelectedRow() >= 0) {            
            //Obtém a linha do item selecionado
            final int row = tabelaResultados.getSelectedRow();                        
            String nome = (String) tabelaResultados.getValueAt(row, 1);
            //Mostra o diálogo de confirmação de exclusão
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Excluir \"" + nome + "\"?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);            
            if (resposta == JOptionPane.YES_OPTION) {
                try {                    
                    int id = (int) tabelaResultados.getValueAt(row, 0);                    
                    ServicoProduto.excluirProduto(id);                    
                    this.refreshList();
                } catch (Exception e) {                    
                    e.printStackTrace();                    
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        editaProduto();
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void tabelaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaResultadosMouseClicked
        //Verifica se o clique é um clique duplo       
        if (evt.getClickCount() == 2) {
            editaProduto();
        }
    }//GEN-LAST:event_tabelaResultadosMouseClicked

    //Abre um internal frame centralizado na tela
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFechar;
    private javax.swing.JScrollPane scrollTabelaResultados;
    private javax.swing.JTable tabelaResultados;
    // End of variables declaration//GEN-END:variables
}
