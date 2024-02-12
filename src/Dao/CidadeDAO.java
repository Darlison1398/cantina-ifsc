
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Bairro;
import model.bo.Cidade;

public class CidadeDAO implements InterfaceDAO<Cidade> {

    
    /*public static Cidade obterCidadePorId(int cidadeId) {
    Connection conexao = ConnectionFactory.getConnection();
    String sqlExecutar = "SELECT * FROM cidade WHERE id = ?";
    PreparedStatement pstm = null;
    ResultSet rst = null;
    Cidade cidade = null;

    try {
        pstm = conexao.prepareStatement(sqlExecutar);
        pstm.setInt(1, cidadeId);
        rst = pstm.executeQuery();

        if (rst.next()) {
            cidade = new Cidade();
            cidade.setId(rst.getInt("id"));
            cidade.setDescricao(rst.getString("descricao"));
            // Defina outros atributos da cidade conforme necessário.
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        ConnectionFactory.closeConnection(conexao, pstm, rst);
    }

    return cidade;
    }*/
    
    
    
    
    
    
    
    

    @Override
    public void create(Cidade objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cidade (descricao, uf) values(?, ?)";
        PreparedStatement pstm = null;
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getUf());
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
    public List<Cidade> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection(); 
        String sqlExecutar = "SELECT cidade.id, cidade.descricao, cidade.uf FROM mydb.cidade";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        // a lista tem que ser criada fora do while
        List<Cidade> listaCidade = new ArrayList<>();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Cidade cidade = new Cidade();
                 cidade.setId(rst.getInt("id"));
                 cidade.setDescricao(rst.getString("descricao"));
                 cidade.setUf(rst.getString("uf"));
                 
                 listaCidade.add(cidade);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCidade;
        }
    }

    @Override
    public Cidade retrieve(int parPK) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cidade.id, cidade.descricao, cidade.uf FROM mydb.cidade WHERE cidade.id = ?"; 
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        Cidade cidade = new Cidade();
        
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setInt(1, parPK);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 cidade.setId(rst.getInt("id"));
                 cidade.setDescricao(rst.getString("descricao"));
                 cidade.setUf(rst.getString("uf"));
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cidade;
        }
    }

    @Override
    public List<Cidade> retrieve(String parString) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cidade.id, cidade.descricao, cidade.uf FROM cidade WHERE descricao like ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;  
        List<Cidade> listaCidade = new ArrayList<>();
        
        
         try{
            // pstm = conexao.prepareStatement(sqlExecutar);
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 Cidade cidade = new Cidade();
                 cidade.setId(rst.getInt("id"));
                 cidade.setDescricao(rst.getString("descricao"));
                 cidade.setUf(rst.getString("uf"));
                 listaCidade.add(cidade);
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCidade;
        }  
       
       //return null;
        
        
        
    }
    
    
    
    /**  nova implementação aqui. Se não de certo, devo descomentar a parte de cima **/
    
   /* public List<Cidade> retrieve(String nomeParametro, String parString){
                
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cidade.id, "
                                    + " cidade.descricao, "
                                    + " cidade.uf "
                                    + " FROM cidade WHERE " + nomeParametro +  " like ?";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;  
        List<Cidade> listaCidade = new ArrayList<>();
        
        
         try{
             
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 Cidade cidade = new Cidade();
                 cidade.setId(rst.getInt("id"));
                 cidade.setDescricao(rst.getString("descricao"));
                 cidade.setUf(rst.getString("uf"));
                 listaCidade.add(cidade);
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCidade;
        } 
       
    }*/
    
    
    
    
    
    
    
    

    @Override
    public void update(Cidade objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cidade "
                             + "SET cidade.descricao = ?, "
                             + "cidade.uf = ? "
                             + "WHERE cidade.id = ?";

        PreparedStatement pstm = null;
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getUf());
            pstm.setInt(3, objeto.getId());
            pstm.execute();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } finally{
            
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Cidade objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM mydb.cidade WHERE cidade.id = ?";
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
