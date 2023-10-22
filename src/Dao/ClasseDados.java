
package Dao;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import model.bo.Bairro;
import model.bo.Caixa;
import model.bo.Carteirinha;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Compra;
import model.bo.Contas;
import model.bo.Endereco;
import model.bo.Fornecedor;
import model.bo.Funcionario;
import model.bo.ItemCompra;
import model.bo.ItemVenda;
import model.bo.MovimentacaoEstoque;
import model.bo.MovimentoCaixa;
import model.bo.Produto;
import model.bo.Venda;

public class ClasseDados {
    private static ClasseDados instance;
    public static ArrayList<Bairro> bairros;
    public static ArrayList<Caixa> caixas;
    public static ArrayList<Carteirinha> carteirinhas;
    public static ArrayList<Cidade> cidades;
    public static ArrayList<Cliente> clientes;
    public static ArrayList<Compra> compras;
    public static ArrayList<Contas> contas;
    public static ArrayList<Endereco> enderecos;
    public static ArrayList<Fornecedor> fornecedores;
    public static ArrayList<Funcionario> funcionarios;
    public static ArrayList<ItemCompra> itensCompras;
    public static ArrayList<ItemVenda> itensVendas;
    public static ArrayList<MovimentacaoEstoque> movimentacoesDeEstoque;
    public static ArrayList<MovimentoCaixa> movimentacoesDeCaixas;
    public static ArrayList<Produto> produtos;
    public static ArrayList<Venda> vendas;
    
    public static synchronized ClasseDados getInstance(){
        if(instance == null){
            instance = new ClasseDados();
        }
        return instance;
    }
    
    private ClasseDados(){
        bairros = new ArrayList<>();
        caixas = new ArrayList<>();
        carteirinhas = new ArrayList<>();
        cidades = new ArrayList<>();
        clientes = new ArrayList<>();
        compras = new ArrayList<>();
        contas = new ArrayList<>();
        enderecos = new ArrayList<>();
        fornecedores = new ArrayList<>();
        funcionarios = new ArrayList<>();
        itensCompras = new ArrayList<>();
        itensVendas = new ArrayList<>();
        movimentacoesDeEstoque = new ArrayList<>();
        movimentacoesDeCaixas = new ArrayList<>();
        produtos = new ArrayList<>();
        vendas = new ArrayList<>();
        
        //Teste, não precisa
        
        //Bairros
        Bairro bairro1 = new Bairro(1, "Dehon");
        Bairro bairro2 = new Bairro(2, "Vila Moema");
        Bairro bairro3 = new Bairro(3, "Humaita");
        
        bairros.add(bairro1);
        bairros.add(bairro2);
        bairros.add(bairro3);
        
        //Cidades
        Cidade cidade1 = new Cidade(1, "Tubarão", "SC");
        Cidade cidade2 = new Cidade(2, "Criciúma", "SC");
        Cidade cidade3 = new Cidade(3, "Laguna", "SC");
        
        cidades.add(cidade1);
        cidades.add(cidade2);
        cidades.add(cidade3);
        
        //Endereços
        /* Endereco endereco1 = new Endereco(1, "88708-695", "Rua João da Silva", 'A', bairro1, cidade3);
        Endereco endereco2 = new Endereco(2, "01032-030", "Rua anilton miranda", 'A', bairro2, cidade2);
        Endereco endereco3 = new Endereco(3, "88708-695", "Avenida Patricio Lima", 'A', bairro3, cidade1);
        
        enderecos.add(endereco1);
        enderecos.add(endereco2);
        enderecos.add(endereco3);
        
        //Clientes
        /*
        Cliente cliente1 = new Cliente("123-456-969-08", "8.659.985", "202318A", "13/10/98", 1, "Darlison", "48 00000 - 6002","null",
                "mdcAdi123@gmail.com",'A', "Morro do gato", endereco1);
        
        Cliente cliente2 = new Cliente("123-248-156-58", "6.611.995", "202238B", "21/02/02", 2, "Carla", "48 00000 - 8123","null",
                "Yara@gmail.com",'A', "", endereco2);
        
        Cliente cliente3 = new Cliente("508-008-909-56", "6.989.685", "202238C", "21/09/07", 1, "Cristina", "48 11111 - 2323","null",
                "Carla@gmail.com",'A', "Ap 03", endereco3);
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
        //Fornecedores
        Fornecedor fornecedor1 = new Fornecedor("18.345.678/0003-00", "123.456.789.012", " TecnoCop LTDA", 1, "TecnoCop", "48 9 9856 - 2121",
                "null", "contato@tecnocop.com", 'A', "em frente a prefeitura", endereco1);
        
        
        fornecedores.add(fornecedor1);
        
        
        //Funcionarios
        Funcionario funcionario1 = new Funcionario("123.456.789-00", "9.000.229", "funcionario1", "funcionario1**");
        Funcionario funcionario2 = new Funcionario("543.678.930-65", "8.656.229", "funcionario2", "funcionario2**");
        Funcionario funcionario3= new Funcionario("123.456.789-10", "7.887.874", "funcionario3", "funcionario3**");
        
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        
        //Carteirinhas
        Carteirinha carteirinha1 = new Carteirinha(1, "123000000", "10/12/2022", "", cliente1);
        Carteirinha carteirinha2 = new Carteirinha(2, "432100000", "21/08/2023", "", cliente2);
        Carteirinha carteirinha3 = new Carteirinha(3, "100123457", "30/11/2022", "", cliente3);
        
        carteirinhas.add(carteirinha1);
        carteirinhas.add(carteirinha2);
        carteirinhas.add(carteirinha3);
        
        /*Produtos
        Produto produto1 = new Produto(1, "Risolho", "123456987", 'A');
        Produto produto2 = new Produto(2, "Coxinha", "123456998", 'A');
        Produto produto3 = new Produto(3, "Misto", "123456998", 'A');
        
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        
        //Compras
        Compra compra1 = new Compra(1, 05, DateTimeFormatter.ISO_LOCAL_DATE, 0, 'S', 'A', "", fornecedor1);
        //Compra compra2 = new Compra(2, 30, DateTimeFormatter.ISO_LOCAL_DATE, 0, 'S', 'A', "", fornecedor2);
       // Compra compra3 = new Compra(3, 70, DateTimeFormatter.ISO_LOCAL_DATE, 0, 'S', 'A', "", fornecedor3);
        
        compras.add(compra1);
       // compras.add(compra2);
       // compras.add(compra3);
        
        //Vendas
        Venda venda1 = new Venda(1, DateTimeFormatter.ISO_LOCAL_DATE, 0, 'S', "", 'A', carteirinha1, funcionario1);
        Venda venda2 = new Venda(2, DateTimeFormatter.ISO_LOCAL_DATE, 0, 'S', "", 'A', carteirinha2, funcionario2);
        Venda venda3 = new Venda(3, DateTimeFormatter.ISO_LOCAL_DATE, 0, 'S', "", 'A', carteirinha3, funcionario3);
        
        vendas.add(venda1);
        vendas.add(venda2);
        vendas.add(venda3);*/
        
        //Contas
        

    }
    
}
