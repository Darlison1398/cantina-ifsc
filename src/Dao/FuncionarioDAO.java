
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
import model.bo.Funcionario;

public class FuncionarioDAO implements InterfaceDAO<Funcionario> {

    @Override
    public void create(Funcionario objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO funcionario (nome, fone1, fone2, email, status, rg, cpf, usuario, senha, endereco_id, complementoEndereco)"
                           + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            pstm.setString(8, objeto.getUsuario());
            pstm.setString(9, objeto.getSenha());
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
    public List<Funcionario> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar =  "SELECT funcionario.id, funcionario.nome, funcionario.fone1, funcionario.fone2, funcionario.email, funcionario.status, funcionario.rg, funcionario.cpf, funcionario.usuario, funcionario.senha, endereco.cep, cidade.descricao AS cidade_descricao, cidade.uf AS cidade_uf, bairro.descricao AS bairro_descricao, endereco.logradouro, complementoEndereco " +
                            "FROM mydb.funcionario " +                               
                            "LEFT OUTER JOIN endereco ON funcionario.endereco_id = endereco.id " +
                            "LEFT OUTER JOIN cidade ON endereco.cidade_id = cidade.id " +
                            "LEFT OUTER JOIN bairro ON endereco.bairro_id = bairro.id";
                
                

        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        List<Funcionario> listaFuncionario = new ArrayList<>();
        
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Funcionario funcionario = new Funcionario();
                 funcionario.setId(rst.getInt("id"));
                 funcionario.setNome(rst.getString("nome"));
                 funcionario.setFone1(rst.getString("fone1"));
                 funcionario.setFone2(rst.getString("fone2"));
                 funcionario.setEmail(rst.getString("email"));
                 funcionario.setCpf(rst.getString("cpf"));
                 funcionario.setRg(rst.getString("rg"));
                 funcionario.setStatus(true);
                 funcionario.setUsuario(rst.getString("usuario"));
                 funcionario.setSenha(rst.getString("senha"));
                 funcionario.setComplementoEndereco(rst.getString("complementoEndereco"));
                   
                 Endereco endereco = new Endereco();
                 endereco.setId(rst.getInt("id")); 
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 
                 Cidade cidade = new Cidade();
                 cidade.setDescricao(rst.getString("cidade_descricao"));
                 cidade.setUf(rst.getString("cidade_uf"));
                 endereco.setCidade(cidade);
                 
                 Bairro bairro = new Bairro();
                 bairro.setDescricao(rst.getString("bairro_descricao"));
                 endereco.setBairro(bairro);
            
          
                 funcionario.setEndereco(endereco);
               
                 listaFuncionario.add(funcionario);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaFuncionario;
        }
        
    }

    
    
    
    @Override
    public Funcionario retrieve(int parPK) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar =  "SELECT funcionario.id, funcionario.nome, funcionario.fone1, funcionario.fone2, funcionario.email, funcionario.status, funcionario.rg, funcionario.cpf, funcionario.usuario, funcionario.senha, endereco.cep, cidade.descricao AS cidade_descricao, cidade.uf AS cidade_uf, bairro.descricao AS bairro_descricao, endereco.logradouro, complementoEndereco " +
                            "FROM mydb.funcionario " +                               
                            "LEFT OUTER JOIN endereco ON funcionario.endereco_id = endereco.id " +
                            "LEFT OUTER JOIN cidade ON endereco.cidade_id = cidade.id " +
                            "LEFT OUTER JOIN bairro ON endereco.bairro_id = bairro.id " +
                            " WHERE funcionario.id = ?";
                
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        Funcionario funcionario = new Funcionario();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setInt(1, parPK);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 funcionario.setId(rst.getInt("id"));
                 funcionario.setNome(rst.getString("nome"));
                 funcionario.setFone1(rst.getString("fone1"));
                 funcionario.setFone2(rst.getString("fone2"));
                 funcionario.setEmail(rst.getString("email"));
                 funcionario.setCpf(rst.getString("cpf"));
                 funcionario.setRg(rst.getString("rg"));
                 funcionario.setStatus(true);
                 funcionario.setUsuario(rst.getString("usuario"));
                 funcionario.setSenha(rst.getString("senha"));             
                 funcionario.setComplementoEndereco(rst.getString("complementoEndereco"));
                         
                                  
                 Endereco endereco = new Endereco();
                 endereco.setId(rst.getInt("id")); 
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 
                 Cidade cidade = new Cidade();
                 cidade.setDescricao(rst.getString("cidade_descricao"));
                 cidade.setUf(rst.getString("cidade_uf"));
                 endereco.setCidade(cidade);
                 
                 Bairro bairro = new Bairro();
                 bairro.setDescricao(rst.getString("bairro_descricao"));
                 endereco.setBairro(bairro);
            
          
                 funcionario.setEndereco(endereco);
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return funcionario;
        }

    }
    
    
    

    @Override
    public List<Funcionario> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT funcionario.id, funcionario.nome, funcionario.fone1, funcionario.fone2, funcionario.email, funcionario.status, funcionario.rg, funcionario.cpf, funcionario.usuario, funcionario.senha, endereco.cep, cidade.descricao AS cidade_descricao, cidade.uf AS cidade_uf, bairro.descricao AS bairro_descricao, endereco.logradouro, complementoEndereco " +
                            "FROM mydb.funcionario " +                               
                            "LEFT OUTER JOIN endereco ON funcionario.endereco_id = endereco.id " +
                            "LEFT OUTER JOIN cidade ON endereco.cidade_id = cidade.id " +
                            "LEFT OUTER JOIN bairro ON endereco.bairro_id = bairro.id " +
                            " WHERE nome LIKE ?";
                
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        List<Funcionario> listaFuncionario = new ArrayList<>();
        
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 
                 Funcionario funcionario = new Funcionario();
                 funcionario.setId(rst.getInt("id"));
                 funcionario.setNome(rst.getString("nome"));
                 funcionario.setFone1(rst.getString("fone1"));
                 funcionario.setFone2(rst.getString("fone2"));
                 funcionario.setEmail(rst.getString("email"));
                 funcionario.setCpf(rst.getString("cpf"));
                 funcionario.setRg(rst.getString("rg"));
                 //cliente.setStatus(rst.getBoolean("status"));
                 funcionario.setStatus(true);
                 funcionario.setUsuario(rst.getString("usuario"));
                 funcionario.setSenha(rst.getString("senha"));
                 funcionario.setComplementoEndereco(rst.getString("complementoEndereco"));
                                   
                 Endereco endereco = new Endereco();
                 endereco.setId(rst.getInt("id")); 
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 
                 Cidade cidade = new Cidade();
                 cidade.setDescricao(rst.getString("cidade_descricao"));
                 cidade.setUf(rst.getString("cidade_uf"));
                 endereco.setCidade(cidade);
                 
                 Bairro bairro = new Bairro();
                 bairro.setDescricao(rst.getString("bairro_descricao"));
                 endereco.setBairro(bairro);
            
          
                 funcionario.setEndereco(endereco);
               
                 listaFuncionario.add(funcionario);
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaFuncionario;
        }
        
    }
    
    
    

    @Override
    public void update(Funcionario objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE funcionario SET "
                + "funcionario.nome = ?, "
                + "funcionario.fone1 = ?, "
                + "funcionario.fone2 = ?, "
                + "funcionario.email = ?, "
                + "funcionario.status = ?, "
                + "funcionario.rg = ?, "
                + "funcionario.cpf = ?, "
                + "funcionario.usuario = ?, "
                + "funcionario.senha = ?, "
                + "funcionario.endereco_id = ?, "
                + "funcionario.complementoEndereco = ? "
                + " WHERE funcionario.id = ?";

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
            pstm.setString(8, objeto.getUsuario());
            pstm.setString(9, objeto.getSenha());
            pstm.setInt(10, objeto.getEndereco().getId());
            pstm.setString(11, objeto.getComplementoEndereco());
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
    public void delete(Funcionario objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM mydb.funcionario WHERE funcionario.id = ?";
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
