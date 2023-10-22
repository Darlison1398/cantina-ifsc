
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Fornecedor;


public class FornecedorDAO implements InterfaceDAO<Fornecedor>{

    @Override
    public void create(Fornecedor objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO fornecedor (nome, fone1, fone2, email, status, cnpj, inscricaoestadual, endereco_id, razaosocial) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null;
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getEmail());
            pstm.setBoolean(5, true);
            pstm.setString(6, objeto.getCnpj());
            pstm.setString(7, objeto.getInscricaoEstadual());
            pstm.setString(8, objeto.getRazaoSocial());
            pstm.setString(9, objeto.getComplementoEndereco());           
            pstm.setInt(10, objeto.getId()); 
            
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
    public List<Fornecedor> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT fornecedor.id, fornecedor.nome, fornecedor.fone1, fornecedor.fone2, fornecedor.email, fornecedor.status, fornecedor.cnpj, fornecedor.inscricaoestadual, fornecedor.razaosocial, fornecedor.endereco_id"
                           + " FROM mydb.fornecedor";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        List<Fornecedor> listaFornecedor = new ArrayList<>();
        
        try {
            
             pstm = conexao.prepareStatement(sqlExecutar);
             rst = pstm.executeQuery();
             
             while(rst.next()) {
                 
                 Fornecedor fornecedor = new Fornecedor();
                 fornecedor.setId(rst.getInt("id"));
                 fornecedor.setNome(rst.getString("nome"));
                 fornecedor.setFone1(rst.getString("fone1"));
                 fornecedor.setFone2(rst.getString("fone2"));
                 fornecedor.setEmail(rst.getString("email"));
                 fornecedor.setCnpj(rst.getString("cnpj"));
                 fornecedor.setStatus(true);
                 fornecedor.setInscricaoEstadual(rst.getString("inscricaoestadual"));
                 fornecedor.setRazaoSocial(rst.getString("razaosocial"));
                 fornecedor.setComplementoEndereco(rst.getString("endereco_id")); 
                 
                 listaFornecedor.add(fornecedor);
                 
             }
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
            
        }  finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaFornecedor;
        }
        
        
        
    }

    @Override
    public Fornecedor retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT fornecedor.id, fornecedor.nome, fornecedor.fone1, fornecedor.fone2, fornecedor.email, fornecedor.status, fornecedor.cnpj, fornecedor.inscricaoestadual, fornecedor.razaosocial, fornecedor.endereco_id"
                + " FROM mydb.fornecedor WHERE fornecedor.id = ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        Fornecedor fornecedor = new Fornecedor();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setInt(1, parPK);
             rst = pstm.executeQuery();
             
             while (rst.next()) {
                                  
                 fornecedor.setId(rst.getInt("id"));
                 fornecedor.setNome(rst.getString("nome"));
                 fornecedor.setFone1(rst.getString("fone1"));
                 fornecedor.setFone2(rst.getString("fone2"));
                 fornecedor.setEmail(rst.getString("email"));
                 fornecedor.setCnpj(rst.getString("cnpj"));
                 fornecedor.setStatus(true);
                 fornecedor.setInscricaoEstadual(rst.getString("inscricaoestadual"));
                 fornecedor.setRazaoSocial(rst.getString("razaosocial"));
                 fornecedor.setComplementoEndereco(rst.getString("endereco_id"));             
                 
             }
             
          } catch (SQLException ex) {
            ex.printStackTrace();
            
          } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return fornecedor;
          }
        
        
        
        
    }

    @Override
    public List<Fornecedor> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT fornecedor.id, fornecedor.nome, fornecedor.fone1, fornecedor.fone2, fornecedor.email, fornecedor.status, fornecedor.cnpj, fornecedor.inscricaoestadual, fornecedor.razaosocial, fornecedor.endereco_id"
                + " FROM fornecedor WHERE nome LIKE ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        List<Fornecedor> listaFornecedor = new ArrayList<>();
        
        try{
            
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             rst = pstm.executeQuery();
             
             while(rst.next()) {
                 
                 Fornecedor fornecedor = new Fornecedor();
                 fornecedor.setId(rst.getInt("id"));
                 fornecedor.setNome(rst.getString("nome"));
                 fornecedor.setFone1(rst.getString("fone1"));
                 fornecedor.setFone2(rst.getString("fone2"));
                 fornecedor.setEmail(rst.getString("email"));
                 fornecedor.setCnpj(rst.getString("cnpj"));
                 fornecedor.setStatus(true);
                 fornecedor.setInscricaoEstadual(rst.getString("inscricaoestadual"));
                 fornecedor.setRazaoSocial(rst.getString("razaosocial"));
                 fornecedor.setComplementoEndereco(rst.getString("endereco_id"));
                 
                 listaFornecedor.add(fornecedor);
                 
                 
                 
             }
             
         } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaFornecedor;
            
        }
        
        
        
    }

    @Override
    public void update(Fornecedor objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE fornecedor SET fornecedor.nome = ?, fornecedor.fone1 = ?, fornecedor.fone2 = ?, fornecedor.email = ?, fornecedor.status = ?, fornecedor.cnpj = ?, fornecedor.inscricaoestadual = ?, fornecedor.razaosocial = ?, fornecedor.endereco_id = ?"
                + "  WHERE fornecedor.id = ?";
        PreparedStatement pstm = null;
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getEmail());
            pstm.setBoolean(5, true);
            pstm.setString(6, objeto.getCnpj());
            pstm.setString(7, objeto.getInscricaoEstadual());
            pstm.setString(8, objeto.getRazaoSocial());
            pstm.setString(9, objeto.getComplementoEndereco());           
            pstm.setInt(10, objeto.getId()); 
            
            pstm.execute();
                
                
                
             
            }catch (SQLException ex) {
                ex.printStackTrace();
            
            } finally{
               ConnectionFactory.closeConnection(conexao, pstm);
        }
        
    }

    @Override
    public void delete(Fornecedor objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM mydb.fornecedor WHERE fornecedor.id = ?";
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
