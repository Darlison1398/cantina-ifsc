
package model.bo;

public abstract class Pessoa {

    private int id;
    private String nome;
    private String fone1;
    private String fone2;
    private String email;
    private boolean status;
    private String complementoEndereco;
    
    private Endereco endereco;
    
    

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String fone1, String fone2, String email, boolean status, String complementoEndereco, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.email = email;
        this.status = status;
        this.complementoEndereco = complementoEndereco;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFone1() {
        return fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public String getEmail() {
        return email;
    }

    public boolean getStatus() {
        return status;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getNome() + ", " 
                + this.getFone1() + ", " 
                + this.getFone2() + ", " 
                + this.getEmail() + ", " 
                + this.getStatus() + ", " 
                + this.getComplementoEndereco() + ", "
                + this.getEndereco().toString();
    }

}
