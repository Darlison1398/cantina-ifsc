
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
        String sqlExecutar = "INSERT INTO produto (descricao, codigobarras, status) values(?, ?, ?)";
        PreparedStatement pstm = null;
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getCodigoBarra());
            pstm.setBoolean(3, true);
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
        String sqlExecutar = "SELECT produto.id, produto.descricao, produto.codigobarras, produto.status FROM mydb.produto";
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
        String sqlExecutar = "SELECT produto.id, produto.descricao, produto.codigobarras, produto.status FROM mydb.produto WHERE produto.id = ?";
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
        
        //String sqlExecutar = "SELECT produto.id, produto.descricao FROM bairro WHERE descricao like ?";
        
        String sqlExecutar = "SELECT produto.id, produto.descricao, produto.codigobarras, produto.status FROM produto WHERE descricao LIKE ?";
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
    public void update(Produto objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE produto SET produto.descricao = ?, produto.codigobarras = ?, produto.status = ? WHERE produto.id = ?";
        PreparedStatement pstm = null;
        
        try{
             
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, objeto.getDescricao());
             pstm.setString(2, objeto.getCodigoBarra());
             pstm.setBoolean(3, objeto.getStatus());
             pstm.setInt(4, objeto.getId());
             pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm);
         
        }
    }

    @Override
    public void delete(Produto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
