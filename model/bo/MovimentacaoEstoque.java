
package model.bo;

import java.time.format.DateTimeFormatter;

public class MovimentacaoEstoque {
    
    private int id;
    private DateTimeFormatter dataHoraMovimento;
    private char flagTipoMovimento;
    private float qtdMovimentada;
    private String observacaoMovimento;
    private char status;
    
    private ItemVenda itemVenda;
    private ItemCompra itemCompra;
    private Produto produto;
    private Funcionario funcionario;

    public MovimentacaoEstoque() {
    }

    public MovimentacaoEstoque(int id, DateTimeFormatter dataHoraMovimento, char flagTipoMovimento, float qtdMovimentada, String observacaoMovimento, char status, ItemVenda itemVenda, ItemCompra itemCompra, Produto produto, Funcionario funcionario) {
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.flagTipoMovimento = flagTipoMovimento;
        this.qtdMovimentada = qtdMovimentada;
        this.observacaoMovimento = observacaoMovimento;
        this.status = status;
        this.itemVenda = itemVenda;
        this.itemCompra = itemCompra;
        this.produto = produto;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateTimeFormatter getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(DateTimeFormatter dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    public float getQtdMovimentada() {
        return qtdMovimentada;
    }

    public void setQtdMovimentada(float qtdMovimentada) {
        this.qtdMovimentada = qtdMovimentada;
    }

    public String getObservacaoMovimento() {
        return observacaoMovimento;
    }

    public void setObservacaoMovimento(String observacaoMovimento) {
        this.observacaoMovimento = observacaoMovimento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public ItemVenda getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ItemVenda itemVenda) {
        this.itemVenda = itemVenda;
    }

    public ItemCompra getItemCompra() {
        return itemCompra;
    }

    public void setItemCompra(ItemCompra itemCompra) {
        this.itemCompra = itemCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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
                + this.getDataHoraMovimento() + ", "
                + this.getFlagTipoMovimento()+ ", "
                + this.getQtdMovimentada() + ", "
                + this.getObservacaoMovimento() + ", "
                + this.getStatus() + ", "
                + this.produto.getId() + ", "
                + this.produto.getDescricao() + ", "
                + this.itemCompra.getId() + ", "
                + this.itemCompra.getQtdProduto() + ", "
                + this.itemCompra.getValorUnitario() + ", "
                + this.itemVenda.getId() + ", "
                + this.itemVenda.getQtdProduto() + ", "
                + this.itemVenda.getValorUnitario() + ", "
                + this.funcionario.getUsuario();
    }
    
    
    
}
