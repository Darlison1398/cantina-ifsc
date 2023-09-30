
package model.bo;

public class Produto {
    
    /*
    Eu mudei a propriedade do status de char para boolean
    */

    private int id;
    private String descricao;
    private String codigoBarra;
    //private char status;
    private boolean status;

    public Produto() {
    }

    public Produto(int id, String descricao, String codigoBarra, boolean status) {
        this.id = id;
        this.descricao = descricao;
        this.codigoBarra = codigoBarra;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public boolean getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public void setStatus(boolean status) {
        this.status = status;    
    }
    
    /*public void setStatus(boolean status){
        if(status == true){
            this.status = 'I';
        } else{
            this.status = 'A';
        }
    
    }*/
    
    
    



    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getDescricao() + ", " 
                + this.getCodigoBarra() 
                + ", " + this.getStatus();

    }

}
