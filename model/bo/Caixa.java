
package model.bo;

import java.time.format.DateTimeFormatter;

public class Caixa {
    
    private int id;
    private DateTimeFormatter dataHoraAbertura;
    private DateTimeFormatter dataHoraFechamento;
    private float valorAbertura;
    private float valorFechamento;
    private String observacao;
    private char status;
    
    private Funcionario funcionario;

    public Caixa() {
    }

    public Caixa(int id, DateTimeFormatter dataHoraAbertura, DateTimeFormatter dataHoraFechamento, float valorAbertura, float valorFechamento, String observacao, char status, Funcionario funcionario) {
        this.id = id;
        this.dataHoraAbertura = dataHoraAbertura;
        this.dataHoraFechamento = dataHoraFechamento;
        this.valorAbertura = valorAbertura;
        this.valorFechamento = valorFechamento;
        this.observacao = observacao;
        this.status = status;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateTimeFormatter getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public void setDataHoraAbertura(DateTimeFormatter dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }

    public DateTimeFormatter getDataHoraFechamento() {
        return dataHoraFechamento;
    }

    public void setDataHoraFechamento(DateTimeFormatter dataHoraFechamento) {
        this.dataHoraFechamento = dataHoraFechamento;
    }

    public float getValorAbertura() {
        return valorAbertura;
    }

    public void setValorAbertura(float valorAbertura) {
        this.valorAbertura = valorAbertura;
    }

    public float getValorFechamento() {
        return valorFechamento;
    }

    public void setValorFechamento(float valorFechamento) {
        this.valorFechamento = valorFechamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        
        return this.getId() + ", "
                + this.getDataHoraAbertura() + ", "
                + this.getDataHoraFechamento() + ", "
                + this.getValorAbertura() + ", "
                + this.getObservacao() + ", "
                + this.getObservacao() + ", "
                + this.getStatus() + ", "
                + this.funcionario.getUsuario();
    }
    
    
    
    
}
