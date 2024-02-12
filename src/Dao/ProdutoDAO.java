
package Dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Produto;



public class ProdutoDAO implements InterfaceDAO<Produto>{

    @Override
    public void create(Produto objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO produto (descricao, codigobarras, status, valor) values(?, ?, ?, ?)";
        PreparedStatement pstm = null;
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getCodigoBarra());
            pstm.setBoolean(3, true);
            pstm.setFloat(4, objeto.getValor());
            pstm.execute();
            
            
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            try {
                if (pstm != null) {
                    pstm.close();
                    
                } if (conexao != null) {
                    conexao.close();
                    
                }
            } catch (SQLException ex) {
                ex.printStackTrace();     
            }    
            
        } 
    }

    @Override
    public List<Produto> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT produto.id, produto.descricao, produto.codigobarras, produto.status, produto.valor FROM mydb.produto";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        // a lista tem que ser criada fora do while
        List<Produto> listaProduto = new ArrayList<>();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Produto produto = new Produto();
                 produto.setId(rst.getInt("id"));
                 produto.setDescricao(rst.getString("descricao"));
                 produto.setCodigoBarra(rst.getString("codigoBarras"));
                 produto.setStatus(true);
                 produto.setValor(rst.getFloat("valor"));
                 listaProduto.add(produto);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaProduto;
        }
    }

    @Override
    public Produto retrieve(int parPK) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT produto.id, produto.descricao, produto.codigobarras, produto.status, produto.valor FROM mydb.produto WHERE produto.id = ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        Produto produto = new Produto();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setInt(1, parPK);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 //Produto produto = new Produto();
                 produto.setId(rst.getInt("id"));
                 produto.setDescricao(rst.getString("descricao"));
                 produto.setCodigoBarra(rst.getString("codigoBarras"));
                 produto.setStatus(true);
                 produto.setValor(rst.getFloat("valor"));
                 //listaProduto.add(produto);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return produto;
        }
    }

    @Override
    public List<Produto> retrieve(String parString) {
                
        Connection conexao = ConnectionFactory.getConnection();        
        String sqlExecutar = "SELECT produto.id, produto.descricao, produto.codigobarras, produto.status, produto.valor FROM produto WHERE descricao LIKE ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;  
        List<Produto> listaProduto = new ArrayList<>();
        
        
         try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             //pstm.setInt(2, parId);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 Produto produto = new Produto();
                 produto.setId(rst.getInt("id"));
                 produto.setDescricao(rst.getString("descricao"));        
                 produto.setCodigoBarra(rst.getString("codigoBarras"));
                 produto.setStatus(true);
                 produto.setValor(rst.getFloat("valor"));
                 listaProduto.add(produto);
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaProduto;
        }
        
        
        
    }
    
    //@Override
    public List<Produto> retrieveByCodBarras(String codBarras) {
    Connection conexao = ConnectionFactory.getConnection();
    String sqlExecutar = "SELECT produto.id, produto.descricao, produto.codigobarras, produto.status, produto.valor FROM produto WHERE codigoBarras LIKE ?";
    PreparedStatement pstm = null;
    ResultSet rst = null;
    List<Produto> listaProduto = new ArrayList<>();

    try {
        pstm = conexao.prepareStatement(sqlExecutar);
        pstm.setString(1, "%" + codBarras + "%");
        rst = pstm.executeQuery();

        while (rst.next()) {
            Produto produto = new Produto();
            produto.setId(rst.getInt("id"));
            produto.setDescricao(rst.getString("descricao"));
            produto.setCodigoBarra(rst.getString("codigobarras"));
            produto.setStatus(true);
            produto.setValor(rst.getFloat("valor"));
            listaProduto.add(produto);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        ConnectionFactory.closeConnection(conexao, pstm, rst);
    }

    return listaProduto;
}

    
    
    

    @Override
    public void update(Produto objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE produto SET produto.descricao = ?, produto.codigobarras = ?, produto.status = ?, produto.valor = ? WHERE produto.id = ?";
        PreparedStatement pstm = null;
        
        try{
             
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, objeto.getDescricao());
             pstm.setString(2, objeto.getCodigoBarra());             
             pstm.setBoolean(3, objeto.getStatus());
             pstm.setFloat(4, objeto.getValor());
             pstm.setInt(5, objeto.getId());
             pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm);
         
        }
    }

    @Override
    public void delete(Produto objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM mydb.produto WHERE produto.id = ?";
        PreparedStatement pstm = null;

        try {
              pstm = conexao.prepareStatement(sqlExecutar);
              pstm.setInt(1, objeto.getId());
              pstm.execute();
       } catch (SQLException ex) {
              ex.printStackTrace();
       } finally {
              ConnectionFactory.closeConnection(conexao, pstm);
       }

    
    }
    
}
