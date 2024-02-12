
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bo.Bairro;
import model.bo.Carteirinha;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Compra;
import model.bo.Endereco;

public class CompraDAO {
    
    public Carteirinha dadosCliente(int parPK){
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT carteirinha.codigocarteirinha, "
                                  + "cliente.nome, "
                                  + "endereco.cep, "
                                  + "cidade.descricao AS cidade_descricao, "
                                  + "cidade.uf AS cidade_uf, "
                                  + "bairro.descricao AS bairro_descricao, "
                                  + "cliente.complementoEndereco " 
                                  + "FROM mydb.carteirinha "
                                  + "LEFT OUTER JOIN cliente ON cliente.id = carteirinha.cliente_id "
                                  + "LEFT OUTER JOIN endereco ON cliente.endereco_id = endereco.id " 
                                  + "LEFT OUTER JOIN cidade ON endereco.cidade_id = cidade.id " 
                                  + "LEFT OUTER JOIN bairro ON endereco.bairro_id = bairro.id " 
                                  + "WHERE carteirinha.id = ?";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        //Compra compra = new Compra();
        Carteirinha carteirinha = new Carteirinha();
        
        try{
            
             pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setInt(1, parPK);
             rst = pstm.executeQuery();
             
             while(rst.next()){
                 
                 Cliente cliente = new Cliente();
                 cliente.setNome(rst.getString("nome"));
                 carteirinha.setCliente(cliente);
                 
                 Endereco endereco = new Endereco ();
                 endereco.setCep(rst.getString("cep"));
                 endereco.setLogradouro(rst.getString("logradouro"));
                 cliente.setEndereco(endereco);
                 
                 Cidade cidade = new Cidade();
                 cidade.setUf(rst.getString("uf"));
                 cidade.setDescricao(rst.getString("cidade.descricao"));
                 endereco.setCidade(cidade);
                 
                 Bairro bairro = new Bairro();
                 bairro.setDescricao(rst.getString("bairro.descricao"));
                 endereco.setBairro(bairro);
                 
                 //carteirinha.setId(rst.getInt("id"));
                 
                 
             }
             
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        }  finally{ 
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return carteirinha;
        }
        
        
                
                
        
        
    }
    
}
