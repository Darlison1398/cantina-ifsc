
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Carteirinha;


public class CarteirinhaDAO implements InterfaceDAO<Carteirinha> {

    @Override
    public void create(Carteirinha objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO carteirinha (codigocarteirinha, datageracao, datacancelamento, cliente_id) values(?, ?, ?, ?)";
        PreparedStatement pstm = null;
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataGeracao());
            pstm.setString(3, objeto.getDataCancelamento());
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
        String sqlExecutar = "SELECT carteirinha.id, carteirinha.codigobarras, carteirinha.datageracao, carteirinha.datacancelamento, carteirinha.cliente_id FROM mydb.carteirinha";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        List<Carteirinha> listaCarteirinha = new ArrayList<>();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Carteirinha carteirinha = new Carteirinha();
                 carteirinha.setId(rst.getInt("id"));
                 carteirinha.setCodigoBarra(rst.getString("codigoBarras"));
                 carteirinha.setDataGeracao(rst.getString("datageracao"));
                 carteirinha.setDataCancelamento(rst.getString("datacancelamento"));
                 //carteirinha.setCliente(rst.getInt("cliente_id"));
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Carteirinha> retrieve(String pasString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Carteirinha objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Carteirinha objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
