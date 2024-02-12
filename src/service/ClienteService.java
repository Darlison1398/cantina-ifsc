
package service;


import Dao.ClienteDAO;
import java.util.List;
import model.bo.Cliente;

public class ClienteService {
    
    public static void adicionar(Cliente objeto) {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.create(objeto);
    }
    
    public static List<Cliente> carregar(){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.retrieve();
    }
    
    public static Cliente carregar(int parPK){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.retrieve(parPK);
    }
    
    public static List<Cliente> carregar(String parString){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.retrieve(parString);
    }
    
    public static void atualizar(Cliente objeto){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.update(objeto);
    }
    
    public static void remover(Cliente objeto){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.delete(objeto);
    }
    
}
