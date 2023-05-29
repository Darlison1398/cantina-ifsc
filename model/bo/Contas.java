
package model.bo;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Contas {
    private int id;
    private DateTimeFormatter dataHoraEmissao;
    private Date dataVencimento;
    private Date dataQuitacao;
    private float valorDesconto;
    private float valorEmitido;
    private float valorAcrescimo;
    private float valorQuitado;
    private float observacao;
    private char flagTipoConta;
    private char status;
    
    private Venda venda;
    private Compras compra;

    public Contas() {
    }

    public Contas(int id, DateTimeFormatter dataHoraEmissao, Date dataVencimento, Date dataQuitacao, float valorDesconto, float valorEmitido, float valorAcrescimo, float valorQuitado, float observacao, char flagTipoConta, char status, Venda venda, Compras compra) {
        this.id = id;
        this.dataHoraEmissao = dataHoraEmissao;
        this.dataVencimento = dataVencimento;
        this.dataQuitacao = dataQuitacao;
        this.valorDesconto = valorDesconto;
        this.valorEmitido = valorEmitido;
        this.valorAcrescimo = valorAcrescimo;
        this.valorQuitado = valorQuitado;
        this.observacao = observacao;
        this.flagTipoConta = flagTipoConta;
        this.status = status;
        this.venda = venda;
        this.compra = compra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateTimeFormatter getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public void setDataHoraEmissao(DateTimeFormatter dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(Date dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorQuitado() {
        return valorQuitado;
    }

    public void setValorQuitado(float valorQuitado) {
        this.valorQuitado = valorQuitado;
    }

    public float getObservacao() {
        return observacao;
    }

    public void setObservacao(float observacao) {
        this.observacao = observacao;
    }

    public char getFlagTipoConta() {
        return flagTipoConta;
    }

    public void setFlagTipoConta(char flagTipoConta) {
        this.flagTipoConta = flagTipoConta;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Compras getCompra() {
        return compra;
    }

    public void setCompra(Compras compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return this.getId() + ", "
                + this.getDataHoraEmissao() + ", "
                + this.getDataVencimento() + ", "
                + this.getDataQuitacao() + ", "
                + this.getValorEmitido() + ", "
                + this.getValorDesconto() + ", "
                + this.getValorAcrescimo() + ", "
                + this.getValorQuitado() + ", "
                + this.getObservacao() + ", "
                + this.getFlagTipoConta() + ", "
                + this.getStatus() + ", "
                + this.venda.getId() + ", "
                + this.venda.getFuncionario().getUsuario() + ", "
                + this.venda.getCarteirinha().getId() + ", "
                + this.compra.getId() + ", "
                + this.compra.getFornecedor() + ", "
                + this.compra.getNumeroNF();
    }
    
    
    
    
    
    
}
