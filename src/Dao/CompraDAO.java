
package Dao;

import java.sql.Connection;

public class CompraDAO {
    
    public void dadosCliente(int parPK){
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT carteirinha.codigocarteirinha, "
                                  + "cliente.nome, "
                                  + "endereco.cep, "
                                  + "cidade.descricao AS cidade_descricao, "
                                  + "cidade.uf AS cidade_uf, "
                                  + "bairro.descricao AS bairro_descricao, "
                                  + "complementoEndereco " 
                                  + "FROM mydb.cliente "                                
                                  + "LEFT OUTER JOIN endereco ON cliente.endereco_id = endereco.id " 
                                  + "LEFT OUTER JOIN cidade ON endereco.cidade_id = cidade.id " 
                                  + "LEFT OUTER JOIN bairro ON endereco.bairro_id = bairro.id " 
                                  + "WHERE cliente.id = ?";
                
                
        
        
    }
    
}
