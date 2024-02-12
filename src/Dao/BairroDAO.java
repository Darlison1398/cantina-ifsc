
package Dao;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import model.bo.Bairro;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BairroDAO implements InterfaceDAO<Bairro> {
    

    @Override
    public void create(Bairro objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO bairro (descricao) values(?)";
        PreparedStatement pstm = null;
        
       // pstm = conexao.prepareStatement(sqlExecutar);
        
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
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
    public List<Bairro> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao FROM mydb.bairro";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        // a lista tem que ser criada fora do while
        List<Bairro> listaBairro = new ArrayList<>();
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {
                 Bairro bairro = new Bairro();
                 bairro.setId(rst.getInt("id"));
                 bairro.setDescricao(rst.getString("descricao"));
                 listaBairro.add(bairro);
                 
             }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaBairro;
        }
        
        
    }

    @Override
    public Bairro retrieve(int parPK) {
        
         
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao FROM mydb.bairro WHERE bairro.id = ?"; 
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        Bairro bairro = new Bairro();
        
        
        try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setInt(1, parPK);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 bairro.setId(rst.getInt("id"));
                 bairro.setDescricao(rst.getString("descricao"));
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return bairro;
        }
        
    }

    @Override
    public List<Bairro> retrieve(String parString) {
        
        Connection conexao = ConnectionFactory.getConnection();
        
        /*   OLHAR AQUI COMO EXEMPLO */
        //String sqlExecutar = "SELECT bairro.id, bairro.descricao FROM bairro WHERE descricao like ? AND id = ?";
        String sqlExecutar = "SELECT bairro.id, bairro.descricao FROM bairro WHERE descricao like ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;  
        List<Bairro> listaBairro = new ArrayList<>();
        
        
         try{
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, "%" + parString + "%");
             //pstm.setInt(2, parId);
             rst = pstm.executeQuery();
             
             
             while(rst.next()) {   
                 Bairro bairro = new Bairro();
                 bairro.setId(rst.getInt("id"));
                 bairro.setDescricao(rst.getString("descricao"));
                 listaBairro.add(bairro);
             }
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }  finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaBairro;
        }
        
    }
    
    

    @Override
    public void update(Bairro objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE bairro SET bairro.descricao = ? WHERE bairro.id = ?";

        PreparedStatement pstm = null;
        
        try {
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setInt(2, objeto.getId());
            pstm.execute();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } finally{
            
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Bairro objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM mydb.bairro WHERE bairro.id = ?";
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
