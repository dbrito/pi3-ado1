package senac.ads.pi3.gerenciador_produtos.ui;

//import br.com.ads.DAO.ProdutoDAO;
//import br.com.ads.model.produtos.Produto;
//import br.com.ads.service.produto.ServicoProduto;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import senac.ads.pi3.gerenciador_produtos.DAO.ProdutoDAO;
import senac.ads.pi3.gerenciador_produtos.model.Categoria;
import senac.ads.pi3.gerenciador_produtos.model.Produto;
import senac.ads.pi3.gerenciador_produtos.service.ServicoProduto;

/**
 * Tela de cadastro de produtos
 */
public class TelaCadastrarProduto extends javax.swing.JInternalFrame {

    /**
     * Construtor e inicialização de componentes
     */
    public TelaCadastrarProduto() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tableCategoria.getModel();
        tableCategoria.setRowSorter(new TableRowSorter(model));
        
        readTableCategoria();
    }
    
    public void readTableCategoria(){
        DefaultTableModel model = (DefaultTableModel) tableCategoria.getModel();
        model.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
        
        for(Categoria c: pdao.read()){
            model.addRow(new Object[]{
                c.getNome()
            });
        }
    }

    /**
     * Método criado pelo GUI Builder para montagem da tela
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonFechar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecoCompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCategoria = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelCategoriasSelect = new javax.swing.JTable();
        buttonSelectCategoria = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Produto");

        buttonFechar.setText("Fechar");
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Preço de compra (BRL):");

        jLabel4.setText("Preço de venda (BRL):");

        jLabel8.setText("Quantidade:");

        tableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Categorias:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableCategoria.setShowVerticalLines(false);
        tableCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCategoria);

        tabelCategoriasSelect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Categorias Selecionadas:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelCategoriasSelect);

        buttonSelectCategoria.setText("Selecionar Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonSelectCategoria)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtPrecoCompra)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSelectCategoria)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFechar)
                    .addComponent(buttonSalvar))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Listener de fechamento
    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonFecharActionPerformed

    //Listener do botão salvar
    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        //Cria uma instância do produto e obtém
        //seus valores dos campos da tela
        Produto produto = new Produto();
                
        produto.setNome(txtNome.getText().trim());
        produto.setDescrição(txtDescricao.getText().trim());        
        
        try {
            //converto para o formato de moeda
            String precoCompra = txtPrecoCompra.getText().trim();
            if (precoCompra.indexOf("R$") != 0) precoCompra = "R$ " + precoCompra;           
            String precoVenda = txtPrecoVenda.getText().trim();
            if (precoVenda.indexOf("R$") != 0) precoVenda = "R$ " + precoVenda;
            
            Locale meuLocal = new Locale( "pt", "BR" );
            precoCompra = String.valueOf(NumberFormat.getCurrencyInstance(meuLocal).parse(precoCompra));
            produto.setPrecoCompra(Float.parseFloat(precoCompra));            
            precoVenda = String.valueOf(NumberFormat.getCurrencyInstance(meuLocal).parse(precoVenda));
            produto.setPrecoVenda(Float.parseFloat(precoVenda));
                        
            Integer quantidade = Integer.parseInt(txtQuantidade.getText());
            produto.setQuantidade(quantidade);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            //Chama o serviço para cadastrar o produto
            ServicoProduto.cadastrarProduto(produto);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Caso tenha cadastrado exibe a mensagem de sucesso
        JOptionPane.showMessageDialog(rootPane, "Produto cadastrado com sucesso", "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

        readTableCategoria();
        //Limpa os campos da tela após realizar a inserção                
        txtNome.setText("");
        txtPrecoCompra.setText("");
        txtDescricao.setText("");
        txtPrecoCompra.setText("");                
        txtPrecoVenda.setText("");                
        txtQuantidade.setText("");                
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void tableCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoriaMouseClicked
        
    }//GEN-LAST:event_tableCategoriaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonSelectCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelCategoriasSelect;
    private javax.swing.JTable tableCategoria;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
