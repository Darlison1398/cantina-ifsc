
package model.bo;

import java.time.format.DateTimeFormatter;

public class Compras {
    
    private int id; 
    private int numeroNF;
    private DateTimeFormatter dataHoraCompra;
    private float valorDesconto;
    private char flagTipoDesconto;
    private char status;
    private String observacao;
    
    private Fornecedor fornecedor;

    public Compras() {
    }

    public Compras(int id, int numeroNF, DateTimeFormatter dataHoraCompra, float valorDesconto, char flagTipoDesconto, char status, String observacao, Fornecedor fornecedor) {
        this.id = id;
        this.numeroNF = numeroNF;
        this.dataHoraCompra = dataHoraCompra;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.status = status;
        this.observacao = observacao;
        this.fornecedor = fornecedor;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(int numroNF) {
        this.numeroNF = numroNF;
    }

    public DateTimeFormatter getDataHCompra() {
        return dataHoraCompra;
    }

    public void setDataHCompra(DateTimeFormatter dataHCompra) {
        this.dataHoraCompra = dataHCompra;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char sttaus) {
        this.status = sttaus;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public DateTimeFormatter getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(DateTimeFormatter dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public char getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public void setFlagTipoDesconto(char flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }
    
    

    @Override
    public String toString() {
        return this.getId() + ", "
                + this.getNumeroNF() + ", "
                + this.getDataHoraCompra() + ", "
                + this.getValorDesconto() + ", "
                + this.getValorDesconto() + ", "
                + this.getFlagTipoDesconto() + ", "
                + this.getStatus() + ", "
                + this.getObservacao() + ", "
                + this.fornecedor.getCnpj() + ", "
                + this.fornecedor.getRazaoSocial();
    }
    
    
    
    
}
