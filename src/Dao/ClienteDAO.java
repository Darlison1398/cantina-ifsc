
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.bo.Cliente;


public class ClienteDAO implements InterfaceDAO<Cliente> {

    @Override
    public void create(Cliente objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cliente (nome, fone1, fone2, email, status, rg, cpf, matricula, datanascimento, complementoEndereco) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null;
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome() + objeto.getFone1() + objeto.getFone2() + objeto.getEmail() + objeto.getStatus() + objeto.getRg() + objeto.getCpf() + objeto.getMatricula() + objeto.getDataNascimento() + objeto.getComplementoEndereco());
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente retrieve(int parPK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> retrieve(String pasString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
