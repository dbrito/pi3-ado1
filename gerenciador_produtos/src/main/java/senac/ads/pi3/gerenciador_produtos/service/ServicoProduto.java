package senac.ads.pi3.gerenciador_produtos.service;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import senac.ads.pi3.gerenciador_produtos.DAO.ProdutoDAO;
import senac.ads.pi3.gerenciador_produtos.model.Produto;

public class ServicoProduto {

    //Insere um produto
    public static void cadastrarProduto(Produto prd) {       
        try {        
            ProdutoDAO.inserir(prd);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar! "+ex);
        }
    }    
    
    //Atualiza um produto
    public static void atualizaProduto(Produto prd) {       
        try {        
            ProdutoDAO.atualizar(prd);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar! "+ex);
        }
    }    
    
    //Realiza a pesquisa de um produto
    public static List<Produto> procurarProduto(String termo) {
        try {
            if (termo == null) {
                return ProdutoDAO.listar();
            } else {                
                return ProdutoDAO.listar();
            }
        } catch (Exception ex) {                        
            JOptionPane.showMessageDialog(null,"Erro na fonte de dados! "+ex);            
        }
        return null;
    }
    
    //Obtem um produto específico
    public static Produto obterProduto(int id) {
        try {            
            return ProdutoDAO.obter(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Erro na fonte de dados! "+ex);
        }
        return null;
    }
    
    //Exclui um produto especifico
    public static void excluirProduto(int id) {
        try {            
            ProdutoDAO.excluir(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir! "+ex);
        }
    }
}
