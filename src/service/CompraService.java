
package service;

import Dao.CompraDAO;
import model.bo.Carteirinha;
import model.bo.Cliente;


public class CompraService {
    
    public static Carteirinha dadosCliente (int clienteId){
        CompraDAO compraDAO = new CompraDAO();
        return compraDAO.dadosCliente(clienteId);
    }
    
}
