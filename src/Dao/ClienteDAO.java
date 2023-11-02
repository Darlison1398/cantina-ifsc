
package Dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Endereco;


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
            pstm.setInt(10, objeto.getEndereco().getId());
            pstm.setString(11, objeto.getComplementoEndereco());
          
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
        
        /*
        "SELECT c.id, c.nome, c.fone1, c.fone2, c.email, c.status, c.rg, c.cpf, c.matricula, c.datanascimento, e.cep, e.logradouro, e.status AS endereco_status, c.complementoEndereco, ci.descricao AS cidade, b.descricao AS bairro\n" +
                            "FROM cliente c\n" +
                            "JOIN endereco e ON c.endereco_id = e.id\n" +
                            "JOIN cidade ci ON e.cidade_id = ci.id\n" +
                            "JOIN bairro b ON e.bairro_id = b.id";
        
        
        
                         "LEFT OUTER JOIN endereco ON cliente.endereco_id = endereco.id " +
                         "LEFT OUTER JOIN cidade ON endereco.cidade_id = cidade.id " +
                         "LEFT OUTER JOIN bairro ON endereco.bairro_id = bairro.id";

        */
                
       Connection conexao = ConnectionFactory.getConnection();
       String sqlExecutar = "SELECT cliente.id, cliente.nome, cliente.fone1, cliente.fone2, cliente.email, cliente.status, cliente.rg, cliente.cpf, cliente.matricula, cliente.datanascimento, endereco.cep, endereco.logradouro, cidade.descricao AS cidade_descricao, bairro.descricao AS bairro_descricao " +
                            "FROM mydb.cliente " +                               
                            "LEFT OUTER JOIN endereco ON cliente.endereco_id = endereco.id " +
                            "LEFT OUTER JOIN cidade ON endereco.cidade_id = cidade.id " +
                            "LEFT OUTER JOIN bairro ON endereco.bairro_id = bairro.id";
               
               
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
                 cliente.setStatus(true);
                 cliente.setMatricula(rst.getString("matricula"));
                 cliente.setDataNascimento(rst.getString("datanascimento"));
                 //cliente.setComplementoEndereco(rst.getString("complementoendereco"));
                
                 Endereco endereco = new Endereco();
                 endereco.setId(rst.getInt("id")); 
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 
                     // Configurar cidade
                 Cidade cidade = new Cidade();
                 cidade.setDescricao(rst.getString("cidade_descricao"));
                 endereco.setCidade(cidade);
                 
                     // Configurar bairro
                 Bairro bairro = new Bairro();
                 bairro.setDescricao(rst.getString("bairro_descricao"));
                 endereco.setBairro(bairro);
            
          
                 cliente.setEndereco(endereco);
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
        String sqlExecutar =  "SELECT cliente.id, cliente.nome, cliente.fone1, cliente.fone2, cliente.email, cliente.status, cliente.rg, cliente.cpf, cliente.matricula, cliente.datanascimento, endereco.cep, endereco.logradouro, cidade.descricao AS cidade_descricao, bairro.descricao AS bairro_descricao " +
                            "FROM mydb.cliente " +                               
                            "LEFT OUTER JOIN endereco ON cliente.endereco_id = endereco.id " +
                            "LEFT OUTER JOIN cidade ON endereco.cidade_id = cidade.id " +
                            "LEFT OUTER JOIN bairro ON endereco.bairro_id = bairro.id " +
                            "WHERE cliente.id = ?";
                
                
                
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
                 cliente.setStatus(true);
                 cliente.setMatricula(rst.getString("matricula"));
                 cliente.setDataNascimento(rst.getString("datanascimento"));
                 //cliente.setComplementoEndereco(rst.getString("endereco_id"));
                 
                 Endereco endereco = new Endereco();
                 endereco.setId(rst.getInt("id"));
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 
                                  
                     // Configurar cidade
                 Cidade cidade = new Cidade();
                 cidade.setDescricao(rst.getString("cidade_descricao"));
                 endereco.setCidade(cidade);
                 
                     // Configurar bairro
                 Bairro bairro = new Bairro();
                 bairro.setDescricao(rst.getString("bairro_descricao"));
                 endereco.setBairro(bairro);
                 
                 
                 
                 cliente.setEndereco(endereco);
                         
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
        String sqlExecutar =  "SELECT cliente.id, cliente.nome, cliente.fone1, cliente.fone2, cliente.email, cliente.status, cliente.rg, cliente.cpf, cliente.matricula, cliente.datanascimento, endereco.cep, endereco.logradouro, cidade.descricao AS cidade_descricao, bairro.descricao AS bairro_descricao " +
                            "FROM mydb.cliente " +                               
                            "LEFT OUTER JOIN endereco ON cliente.endereco_id = endereco.id " +
                            "LEFT OUTER JOIN cidade ON endereco.cidade_id = cidade.id " +
                            "LEFT OUTER JOIN bairro ON endereco.bairro_id = bairro.id " +
                            "WHERE nome LIKE ?";
                
                
                
                
           
        
        PreparedStatement pstm = null;
        ResultSet rst = null;  
        List<Cliente> listaCliente = new ArrayList<>();
        
        
         try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 
                 Cliente cliente = new Cliente();
                 cliente.setId(rst.getInt("id"));
                 cliente.setNome(rst.getString("nome"));
                 cliente.setFone1(rst.getString("fone1"));
                 cliente.setFone2(rst.getString("fone2"));
                 cliente.setEmail(rst.getString("email"));
                 cliente.setStatus(true);
                 cliente.setCpf(rst.getString("cpf"));
                 cliente.setRg(rst.getString("rg"));
                 cliente.setMatricula(rst.getString("matricula"));
                 cliente.setDataNascimento(rst.getString("datanascimento"));
                 //cliente.setComplementoEndereco(rst.getString("complementoendereco"));
                 
                 Endereco endereco = new Endereco();
                 endereco.setId(rst.getInt("id"));
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 
                     // Configurar cidade
                 Cidade cidade = new Cidade();
                 cidade.setDescricao(rst.getString("cidade_descricao"));
                 endereco.setCidade(cidade);
                 
                     // Configurar bairro
                 Bairro bairro = new Bairro();
                 bairro.setDescricao(rst.getString("bairro_descricao"));
                 endereco.setBairro(bairro);
                 
                 
                 
                 
                 
                 cliente.setEndereco(endereco);
                 
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
        String sqlExecutar = "UPDATE cliente SET " +
            "cliente.nome = ?, " +
            "cliente.fone1 = ?, " +
            "cliente.fone2 = ?, " +
            "cliente.email = ?, " +
            "cliente.status = ?, " +
            "cliente.rg = ?, " +
            "cliente.cpf = ?, " +
            "cliente.matricula = ?, " +
            "cliente.datanascimento = ?, " +
            "cliente.endereco_id = ?, " +
            "cliente.complementoEndereco = ? " +
            "WHERE cliente.id = ?";
                
              
              

        PreparedStatement pstm = null;
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getEmail());
            pstm.setBoolean(5, objeto.getStatus());
            pstm.setString(6, objeto.getCpf());
            pstm.setString(7, objeto.getRg());
            
            pstm.setString(8, objeto.getMatricula());
            pstm.setString(9, objeto.getDataNascimento());
            pstm.setInt(10, objeto.getEndereco().getId());
            pstm.setString(11, objeto.getEndereco().getCep());
            pstm.setInt(12, objeto.getEndereco().getCidade().getId());
            pstm.setInt(13, objeto.getEndereco().getCidade().getId());
            pstm.setString(14, objeto.getComplementoEndereco());
            pstm.setInt(15, objeto.getId());
            
            
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
