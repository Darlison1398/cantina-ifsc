
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Carteirinha;
import model.bo.Cliente;


public class CarteirinhaDAO implements InterfaceDAO<Carteirinha> {

    @Override
    public void create(Carteirinha objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO carteirinha (codigocarteirinha, datageracao, datacancelamento, cliente_id) "
                             + "values(?, ?, ?, ?)";
        PreparedStatement pstm = null;
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataGeracao());
            pstm.setString(3, objeto.getDataCancelamento());
            pstm.setInt(4, objeto.getCliente().getId());
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
    public List<Carteirinha> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar =  "SELECT carteirinha.id, "
                + "carteirinha.codigocarteirinha, "
                + "carteirinha.datageracao, "
                + "carteirinha.datacancelamento, "
                + "cliente.nome, "
                + "cliente.cpf "
                + "FROM mydb.carteirinha "
                + "LEFT OUTER JOIN cliente ON cliente.id = carteirinha.cliente_id";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        List<Carteirinha> listaCarteirinha = new ArrayList<>();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Carteirinha carteirinha = new Carteirinha();
                 carteirinha.setId(rst.getInt("id"));
                 carteirinha.setCodigoBarra(rst.getString("codigocarteirinha"));
                 carteirinha.setDataGeracao(rst.getString("datageracao"));
                 carteirinha.setDataCancelamento(rst.getString("datacancelamento"));
                 
                 Cliente cliente = new Cliente();
                 cliente.setId(rst.getInt("id"));
                 cliente.setNome(rst.getString("nome"));
                 cliente.setCpf(rst.getString("cpf"));
                 
                 carteirinha.setCliente(cliente);
                 
                 listaCarteirinha.add(carteirinha);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCarteirinha;
        }
        
    }

    @Override
    public Carteirinha retrieve(int parPK) {  
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar =  "SELECT carteirinha.id, "
                + "carteirinha.codigocarteirinha, "
                + "carteirinha.datageracao, "
                + "carteirinha.datacancelamento, "
                + "cliente.nome, "
                + "cliente.cpf "
                + "FROM mydb.carteirinha "
                + "LEFT OUTER JOIN cliente ON cliente.id = carteirinha.cliente_id "
                + "WHERE carteirinha.id = ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        Carteirinha carteirinha = new Carteirinha();
                
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setInt(1, parPK);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 
                 carteirinha.setId(rst.getInt("id"));
                 carteirinha.setCodigoBarra(rst.getString("codigocarteirinha"));
                 carteirinha.setDataGeracao(rst.getString("datageracao"));
                 carteirinha.setDataCancelamento(rst.getString("datacancelamento"));
                 
                 Cliente cliente = new Cliente();
                 cliente.setId(rst.getInt("id"));
                 cliente.setNome(rst.getString("nome"));
                 cliente.setCpf(rst.getString("cpf"));
                 
                 carteirinha.setCliente(cliente);
                         
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return carteirinha;
        }
       
       
        
        
        
    }

    @Override
    public List<Carteirinha> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar =  "SELECT carteirinha.id, "
                + "carteirinha.codigocarteirinha, "
                + "carteirinha.datageracao, "
                + "carteirinha.datacancelamento, "
                + "cliente.nome, "
                + "cliente.cpf "
                + "FROM mydb.carteirinha "
                + "LEFT OUTER JOIN cliente ON cliente.id = carteirinha.cliente_id "
                + "WHERE cliente.nome LIKE ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        List<Carteirinha> listaCarteirinha = new ArrayList<>();
                
        try{
            
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Carteirinha carteirinha = new Carteirinha();
                 carteirinha.setId(rst.getInt("id"));
                 carteirinha.setCodigoBarra(rst.getString("codigocarteirinha"));
                 carteirinha.setDataGeracao(rst.getString("datageracao"));
                 carteirinha.setDataCancelamento(rst.getString("datacancelamento"));
                 
                 Cliente cliente = new Cliente();
                 cliente.setId(rst.getInt("id"));
                 cliente.setNome(rst.getString("nome"));
                 cliente.setCpf(rst.getString("cpf"));
                 
                 carteirinha.setCliente(cliente);
                 
                 listaCarteirinha.add(carteirinha);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCarteirinha;
        }
            
        
    }
    
   // @Override
    public List<Carteirinha> retrieveByCodBarras(String codBarras) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar =  "SELECT carteirinha.id, "
                + "carteirinha.codigocarteirinha, "
                + "carteirinha.datageracao, "
                + "carteirinha.datacancelamento, "
                + "cliente.nome, "
                + "cliente.cpf "
                + "FROM mydb.carteirinha "
                + "LEFT OUTER JOIN cliente ON cliente.id = carteirinha.cliente_id "
                + "WHERE carteirinha.codigocarteirinha LIKE ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        List<Carteirinha> listaCarteirinha = new ArrayList<>();
                
        try{
            
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + codBarras + "%");
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Carteirinha carteirinha = new Carteirinha();
                 carteirinha.setId(rst.getInt("id"));
                 carteirinha.setCodigoBarra(rst.getString("codigocarteirinha"));
                 carteirinha.setDataGeracao(rst.getString("datageracao"));
                 carteirinha.setDataCancelamento(rst.getString("datacancelamento"));
                 
                 Cliente cliente = new Cliente();
                 cliente.setId(rst.getInt("id"));
                 cliente.setNome(rst.getString("nome"));
                 cliente.setCpf(rst.getString("cpf"));
                 
                 carteirinha.setCliente(cliente);
                 
                 listaCarteirinha.add(carteirinha);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCarteirinha;
        }
            
        
    }

    

    
    @Override
    public void update(Carteirinha objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar =  "UPDATE carteirinha SET "
                   + "codigocarteirinha = ?, "
                   + "datageracao = ?, "
                   + "datacancelamento = ?, "
                   + "cliente_id = ? "
                   + "WHERE id = ?";
        PreparedStatement pstm = null;
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataGeracao());
            pstm.setString(3, objeto.getDataCancelamento());
            pstm.setInt(4, objeto.getCliente().getId());
            pstm.setInt(5, objeto.getId());
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
    public void delete(Carteirinha objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM mydb.carteirinha WHERE carteirinha.id = ?";
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
