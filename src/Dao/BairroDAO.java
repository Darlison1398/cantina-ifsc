
package Dao;

//import com.sun.jdi.connect.spi.Connection;
import model.bo.Bairro;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;



public class BairroDAO implements InterfaceDAO<Bairro> {

    @Override
    public void Create(Bairro objeto) {
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
    public List<Bairro> Retrieve() {
        return null;
    }

    @Override
    public Bairro Retrieve(int parPK) {
        return null;
        
    }

    @Override
    public Bairro Retrieve(String pasString) {
        return null;
    }

    @Override
    public void Update(Bairro objeto) {

    }

    @Override
    public void Delete(Bairro objeto) {

    }



    
}
