
package service;

import Dao.FuncionarioDAO;
import java.util.List;
import model.bo.Funcionario;

public class FuncionarioService {
    
        
    public static void adicionar(Funcionario objeto) {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.create(objeto);
    }
    
    public static List<Funcionario> carregar(){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.retrieve();
    }
    
    public static Funcionario carregar(int parPK){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.retrieve(parPK);
    }
    
    public static List<Funcionario> carregar(String parString){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.retrieve(parString);
    }
    
    public static void atualizar(Funcionario objeto){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.update(objeto);
    }
    
    public static void remover(Funcionario objeto){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.delete(objeto);
    }
    
}
