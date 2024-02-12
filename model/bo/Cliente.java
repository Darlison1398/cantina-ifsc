
package model.bo;
public class Cliente extends Pessoa{
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNascimento;

    public Cliente() {
    }
    
    

    public Cliente(String nome, String cpf, String rg, String matricula, String dataNascimento) {
       
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + 
                this.getCpf() + ", " + 
                this.getRg() + ", " + 
                this.getDataNascimento() + ", "+ 
                this.getMatricula();
    }
    
    
    
}
