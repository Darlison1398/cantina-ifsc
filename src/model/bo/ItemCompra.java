
package model.bo;

public class ItemCompra {

    private int id;
    private float qtdProduto;
    private float valorUnitario;
    private char status;

    private Produto produto;
    private Compra compra;

    public ItemCompra() {
    }

    public ItemCompra(int id, float qtdProduto, float valorUnitario, char status, Produto produto, Compra compra) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
        this.produto = produto;
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public int getId() {
        return id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public char getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getId() + ", "
                + this.getQtdProduto() + ", "
                + this.getValorUnitario() + ", "
                + this.getStatus() + ", "
                + this.compra.getId() + ", "
                + this.produto.getId() + ", "
                + this.produto.getDescricao();

    }

}
