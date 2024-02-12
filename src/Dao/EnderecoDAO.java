
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Endereco;


import model.bo.Endereco;


public class EnderecoDAO implements InterfaceDAO<Endereco> {

    @Override
    public void create(Endereco objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO endereco (cep, logradouro, status, cidade_id, bairro_id) values(?,?,?,?, ?)";
        PreparedStatement pstm = null;
        
        try {
            
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, objeto.getCep());
             //pstm.setString(2, objeto.getLogradouro());
             pstm.setString(2, objeto.getLogradouro());
             pstm.setBoolean(3, objeto.getStatus());
             pstm.setInt(4, objeto.getCidade().getId());
             pstm.setInt(5, objeto.getBairro().getId());
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
    public List<Endereco> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT endereco.id, "
                + "endereco.cep, "
                + "endereco.status, "
                + "endereco.logradouro, "
                + "endereco.cidade_id, "
                + "endereco.bairro_id, "
                + "bairro.descricao, "
                + "cidade.descricao, "
                + "cidade.uf "
                + "FROM mydb.endereco "
                + "LEFT OUTER JOIN bairro ON bairro.id = endereco.bairro_id "
                + "LEFT OUTER JOIN cidade ON cidade.id = endereco.cidade_id ";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        // a lista tem que ser criada fora do while
        List<Endereco> listaEndereco = new ArrayList<>();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Endereco endereco = new Endereco();
                 endereco.setId(rst.getInt("id"));
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 endereco.setStatus(true);
                 
                 Bairro bairro = new Bairro();
                 bairro.setId(rst.getInt("bairro_id"));
                 bairro.setDescricao(rst.getString("bairro.descricao"));
                 endereco.setBairro(bairro);
                 
                 
                 Cidade cidade = new Cidade();
                 cidade.setId(rst.getInt("cidade_id"));
                 cidade.setDescricao(rst.getString("cidade.descricao"));
                 cidade.setUf(rst.getString("cidade.uf"));
                
                 endereco.setCidade(cidade);

                 listaEndereco.add(endereco);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaEndereco;
        }
    }

    @Override
    public Endereco retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT endereco.id, "
                + "endereco.cep, "
                + "endereco.status, "
                + "endereco.logradouro, "
                + "endereco.cidade_id, "
                + "endereco.bairro_id, "
                + "bairro.descricao, "
                + "cidade.descricao, "
                + "cidade.uf " 
                + "FROM mydb.endereco "
                + "LEFT OUTER JOIN bairro ON bairro.id = endereco.bairro_id "
                + "LEFT OUTER JOIN cidade ON cidade.id = endereco.cidade_id "
                + "WHERE endereco.id = ?"; 
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Endereco endereco = new Endereco();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setInt(1, parPK);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 endereco.setId(rst.getInt("id"));
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 endereco.setStatus(true);
                 
                 Bairro bairro = new Bairro();
                 bairro.setId(rst.getInt("bairro_id"));
                 bairro.setDescricao(rst.getString("bairro.descricao"));
                 endereco.setBairro(bairro);

                 Cidade cidade = new Cidade();
                 cidade.setId(rst.getInt("cidade_id"));
                 cidade.setDescricao(rst.getString("cidade.descricao"));
                 cidade.setUf(rst.getString("cidade.uf"));
                 endereco.setCidade(cidade);
                 
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return endereco;
        }
        
        
        
    }

    @Override
    public List<Endereco> retrieve(String parString) {
        
       /* Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT endereco.id, endereco.cep, endereco.logradouro, endereco.status, endereco.cidade_id, endereco.bairro_id "
                             + " FROM endereco WHERE logradouro LIKE ?"; 
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Endereco> listaEndereco = new ArrayList<>();
                
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             //pstm.setInt(2, parId);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 Endereco endereco = new Endereco();
                 endereco.setId(rst.getInt("id"));
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("cep"));
                 endereco.setStatus(true);
                 endereco.setBairro(rst.getInt(("bairro_id")));
                 endereco.setCidade(rst.getInt(("cidade_id")));
                 listaEndereco.add(endereco);
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaEndereco;
        }*/
       
                return null;
         
    }
    
    
    
    
    
    
    public List<Endereco> retrieve(String nomeParametro, String parString){
                
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT endereco.id, "
                             + "endereco.cep, "
                             + "endereco.status, "
                             + "endereco.logradouro, "
                             + "endereco.cidade_id, "
                             + "endereco.bairro_id, "
                             + "bairro.descricao AS bairro_descricao, "
                             + "cidade.descricao AS cidade_descricao, "
                             + "cidade.uf AS cidade_uf "
                             + "FROM endereco "
                             + "LEFT OUTER JOIN bairro ON bairro.id = endereco.bairro_id "
                             + "LEFT OUTER JOIN cidade ON cidade.id = endereco.cidade_id "
                             + "WHERE 1 = 1";
        
            if ("logradouro".equals(nomeParametro)) {
                sqlExecutar += " AND endereco.logradouro LIKE ?";
            } else if ("cidade".equals(nomeParametro)) {
                sqlExecutar += " AND cidade.descricao LIKE ?";
            } else if ("bairro".equals(nomeParametro)) {
                sqlExecutar += " AND bairro.descricao LIKE ?";
            } else {
              return new ArrayList<>(); 
            }
        
        
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Endereco> listaEndereco = new ArrayList<>();
                
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 Endereco endereco = new Endereco();
                 endereco.setId(rst.getInt("id"));
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 endereco.setStatus(true);
                 
                 Bairro bairro = new Bairro();
                 bairro.setId(rst.getInt("bairro_id"));
                 bairro.setDescricao(rst.getString("bairro_descricao"));
                 endereco.setBairro(bairro);

                 Cidade cidade = new Cidade();
                 cidade.setId(rst.getInt("cidade_id"));
                 cidade.setDescricao(rst.getString("cidade_descricao"));
                 cidade.setUf(rst.getString("cidade_uf"));
                 endereco.setCidade(cidade);

                 
                 
                 listaEndereco.add(endereco);
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaEndereco;
        }
       
        
    }
            
            
            
            
            
            

    @Override
    public void update(Endereco objeto) {
                
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE endereco SET endereco.cep = ?, "
                + "endereco.status = ?, "
                + "endereco.logradouro = ?, "
                + "endereco.cidade_id = ?, "
                + "endereco.bairro_id = ? "
                + "WHERE endereco.id = ?";
        PreparedStatement pstm = null;
                
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, objeto.getCep());
             pstm.setBoolean(2, objeto.getStatus());
             pstm.setString(3, objeto.getLogradouro());
             pstm.setInt(4, objeto.getCidade().getId());
             pstm.setInt(5, objeto.getBairro().getId());
             pstm.setInt(6, objeto.getId());
             pstm.execute();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } finally{
            
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
        
        
        
        
        
        
    }

    @Override
    public void delete(Endereco objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM mydb.endereco WHERE endereco.id = ?";
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
