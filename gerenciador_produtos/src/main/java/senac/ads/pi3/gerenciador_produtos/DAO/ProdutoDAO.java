package senac.ads.pi3.gerenciador_produtos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import senac.ads.pi3.gerenciador_produtos.connection.ConnectionFactory;
import senac.ads.pi3.gerenciador_produtos.model.Produto;

public class ProdutoDAO {       
        
    public static void inserir (Produto produto) throws SQLException{
        Connection con = ConnectionFactory.getConnetion();
        PreparedStatement stmt = null;
        
        try {            
            stmt = con.prepareStatement("INSERT INTO produto (nome, descricao, preco_compra, preco_venda, quantidade, dt_cadastro) VALUES(?,?,?,?,?,?)");
            // Passando os dados para o insert            
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPrecoCompra());
            stmt.setDouble(4, produto.getPrecoVenda());
            stmt.setInt(5, produto.getQuantidade());
            //Crio uma data
            java.sql.Date dt = new java.sql.Date ((new Date()).getTime());
            stmt.setDate(6, dt);                       
            
            stmt.execute();            
        } catch (SQLException ex) {            
            throw ex;            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    public static void atualizar (Produto produto) throws SQLException{
        Connection con = ConnectionFactory.getConnetion();
        PreparedStatement stmt = null;
        
        try {            
            stmt = con.prepareStatement("UPDATE produto SET nome=?, descricao=?, preco_compra=?, preco_venda=?, quantidade=? WHERE id=?");
            // Passando os dados para o update            
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPrecoCompra());
            stmt.setDouble(4, produto.getPrecoVenda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setInt(6, produto.getId());                        
            stmt.execute();            
        } catch (SQLException ex) {            
            throw ex;            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    public static List<Produto> listar () throws SQLException{
        Connection con = ConnectionFactory.getConnetion();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));                
                produto.setNome(rs.getString("nome"));                
                produto.setDescrição(rs.getString("descricao"));
                produto.setPrecoCompra(rs.getDouble("preco_compra"));
                produto.setPrecoVenda(rs.getDouble("preco_venda"));
                produto.setQuantidade(rs.getInt("quantidade"));                                                
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            throw ex;                                    
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
    public static Produto obter(int id) throws SQLException, Exception {                        
        Connection con = null;        
        PreparedStatement stmt = null;        
        ResultSet result = null;
        try {            
            con = ConnectionFactory.getConnetion();            
            stmt = con.prepareStatement("SELECT * FROM produto WHERE (id=?)");            
            stmt.setInt(1, id);            
                        
            result = stmt.executeQuery();
            if (result.next()) {                                
                Produto produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));                                
                produto.setDescrição(result.getString("descricao"));
                produto.setPrecoCompra(result.getDouble("preco_compra"));
                produto.setPrecoVenda(result.getDouble("preco_venda"));                
                produto.setQuantidade(result.getInt("quantidade"));                                                
                return produto;
            }            
        } catch (SQLException ex) {
            throw ex;                                    
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }        
        return null;
    }
    
    public static void excluir(int id) throws SQLException, Exception {                        
        Connection con = null;        
        PreparedStatement stmt = null;
        try {            
            con = ConnectionFactory.getConnetion();            
            stmt = con.prepareStatement("DELETE FROM produto WHERE (id=?)");            
            stmt.setInt(1, id);                        
            stmt.execute();
        } catch (SQLException ex) {
            throw ex;                                    
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        } 
    }
            
}
