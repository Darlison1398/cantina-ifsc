
package Dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Cliente;


public class ClienteDAO implements InterfaceDAO<Cliente> {

    @Override
    public void create(Cliente objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cliente (nome, fone1, fone2, email, status, rg, cpf, matricula, datanascimento, endereco_id, complementoEndereco) "
                            + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null;
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getEmail());
            pstm.setBoolean(5, true);
            pstm.setString(6, objeto.getRg());
            pstm.setString(7, objeto.getCpf());
            pstm.setString(8, objeto.getMatricula());
            pstm.setString(9, objeto.getDataNascimento());
            pstm.setString(10, objeto.getComplementoEndereco());
            //pstm.setInt(11, objeto.getEndereco());
            pstm.setInt(12, objeto.getId());
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
    public List<Cliente> retrieve() {
                
       Connection conexao = ConnectionFactory.getConnection();
       String sqlExecutar = "SELECT cliente.id, cliente.nome, cliente.fone1, cliente.fone2, cliente.email, cliente.status, cliente.rg, cliente.cpf, cliente.matricula, cliente.datanascimento, cliente.endereco_id, cliente.complementoEndereco "
                            + "FROM mydb.cliente";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        // a lista tem que ser criada fora do while
        List<Cliente> listaCliente = new ArrayList<>();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Cliente cliente = new Cliente();
                 cliente.setId(rst.getInt("id"));
                 cliente.setNome(rst.getString("nome"));
                 cliente.setFone1(rst.getString("fone1"));
                 cliente.setFone2(rst.getString("fone2"));
                 cliente.setEmail(rst.getString("email"));
                 cliente.setCpf(rst.getString("cpf"));
                 cliente.setRg(rst.getString("rg"));
                 //cliente.setStatus(rst.getBoolean("status"));
                 cliente.setStatus(true);
                 cliente.setMatricula(rst.getString("matricula"));
                 cliente.setDataNascimento(rst.getString("datanascimento"));
                 cliente.setComplementoEndereco(rst.getString("endereco_id"));
               
                 listaCliente.add(cliente);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCliente;
        }
        
        
        
        
    }

    @Override
    public Cliente retrieve(int parPK) {
                 
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cliente.id, cliente.nome, cliente.fone1, cliente.fone2, cliente.email, cliente.status, cliente.rg, cliente.cpf, cliente.matricula, cliente.datanascimento, cliente.endereco_id, cliente.complementoEndereco "
                            + "FROM mydb.cliente WHERE cliente.id = ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        Cliente cliente = new Cliente();
        
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setInt(1, parPK);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 cliente.setId(rst.getInt("id"));
                 cliente.setNome(rst.getString("nome"));
                 cliente.setFone1(rst.getString("fone1"));
                 cliente.setFone2(rst.getString("fone2"));
                 cliente.setEmail(rst.getString("email"));
                 cliente.setCpf(rst.getString("cpf"));
                 cliente.setRg(rst.getString("rg"));
                 //cliente.setStatus(rst.getBoolean("status"));
                 cliente.setStatus(true);
                 cliente.setMatricula(rst.getString("matricula"));
                 cliente.setDataNascimento(rst.getString("datanascimento"));
                 cliente.setComplementoEndereco(rst.getString("endereco_id"));
                         
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cliente;
        }
        
    }

    

    @Override
    public List<Cliente> retrieve(String parString) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cliente.id, cliente.nome, cliente.fone1, cliente.fone2, cliente.email, cliente.status, cliente.rg, cliente.cpf, cliente.matricula, cliente.datanascimento, cliente.endereco_id, cliente.complementoEndereco "
                            + "FROM cliente WHERE nome LIKE ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;  
        List<Cliente> listaCliente = new ArrayList<>();
        
        
         try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             //pstm.setInt(2, parId);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 
                 Cliente cliente = new Cliente();
                 cliente.setId(rst.getInt("id"));
                 cliente.setNome(rst.getString("nome"));
                 cliente.setFone1(rst.getString("fone1"));
                 cliente.setFone2(rst.getString("fone2"));
                 cliente.setEmail(rst.getString("email"));
                 //cliente.setStatus(rst.getBoolean("status"));
                 cliente.setStatus(true);
                 cliente.setCpf(rst.getString("cpf"));
                 cliente.setRg(rst.getString("rg"));
                 cliente.setMatricula(rst.getString("matricula"));
                 cliente.setDataNascimento(rst.getString("datanascimento"));
                 cliente.setComplementoEndereco(rst.getString("endereco_id"));
                 //cliente.setEndereco(rst.getInt(""));
                 
                 listaCliente.add(cliente);
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCliente;
        }
        
        
        
    }

    @Override
    public void update(Cliente objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cliente SET cliente.nome = ?, cliente.fone1 = ?, cliente.fone2 = ?, cliente.email = ?, cliente.status = ?, cliente.rg = ?, cliente.cpf = ?, cliente.matricula = ?, cliente.datanascimento = ?, cliente.endereco_id = ?, cliente.complementoEndereco = ? "
                            + " WHERE cliente.id = ?";

        PreparedStatement pstm = null;
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getEmail());
            pstm.setString(5, objeto.getCpf());
            pstm.setString(6, objeto.getRg());
            pstm.setBoolean(7, objeto.getStatus());
            pstm.setString(8, objeto.getMatricula());
            pstm.setString(9, objeto.getDataNascimento());
            pstm.setString(10, objeto.getComplementoEndereco());
            //pstm.setInt(11, objeto.getEndereco());
            
            
            pstm.setInt(10, objeto.getId());
            
            pstm.execute();
            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } finally{
            
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
        
        
        
    }

    @Override
    public void delete(Cliente objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM mydb.cliente WHERE cliente.id = ?";
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
