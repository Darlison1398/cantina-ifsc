
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.bo.Fornecedor;


public class FornecedorDAO implements InterfaceDAO<Fornecedor>{

    @Override
    public void create(Fornecedor objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO fornecedor (nome, fone1, fone2, email, status, cnpj, matricula, inscricaoestadual, endereco_id, razaosocial) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null;
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome() + objeto.getFone1() + objeto.getFone2() + objeto.getEmail() + objeto.getStatus() + objeto.getCnpj() + objeto.getInscricaoEstadual() + objeto.getEndereco() + objeto.getComplementoEndereco() + objeto.getRazaoSocial());
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Fornecedor retrieve(int parPK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Fornecedor> retrieve(String pasString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Fornecedor objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Fornecedor objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
