package pt.iade.gestaoInventarios.models;

public class ItemDeEstoque {

	private int idItemDeEstoque;
	private int quantidade;
	private Estoque estoque;
	private Produto produto;

	public ItemDeEstoque() {

	}

	public int getIdItemDeEstoque() {
		return idItemDeEstoque;
	}

	public void setIdItemDeEstoque(int idItemDeEstoque) {
		this.idItemDeEstoque = idItemDeEstoque;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
