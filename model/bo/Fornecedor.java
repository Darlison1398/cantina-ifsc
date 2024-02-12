
package model.bo;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private String incricaoEstadual;
    private String razaoSocial;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String incricaoEstadual, String razaoSocial, int id, String nome, String fone1, String fone2, String email, char status, String complementoEndereco, Endereco endereco) {
        super(id, nome, fone1, fone2, email, status, complementoEndereco, endereco);
        this.cnpj = cnpj;
        this.incricaoEstadual = incricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return super.toString() + ", "
                + this.getCnpj() + ", "
                + this.getIncricaoEstadual() + ", "
                + this.getRazaoSocial() + ", ";
    }
    
    
    
    
}
