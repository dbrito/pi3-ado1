package senac.ads.pi3.gerenciador_produtos.ui;

//import br.com.ads.DAO.ProdutoDAO;
//import br.com.ads.model.produtos.Produto;
//import br.com.ads.service.produto.ServicoProduto;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoVenda)
                            .addComponent(txtPrecoCompra)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSalvar))
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
                        .addComponent(txtQuantidade)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonFechar))
                .addContainerGap())
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

        //Limpa os campos da tela após realizar a inserção                
        txtNome.setText("");
        txtPrecoCompra.setText("");
        txtDescricao.setText("");
        txtPrecoCompra.setText("");                
        txtPrecoVenda.setText("");                
        txtQuantidade.setText("");                
    }//GEN-LAST:event_buttonSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
