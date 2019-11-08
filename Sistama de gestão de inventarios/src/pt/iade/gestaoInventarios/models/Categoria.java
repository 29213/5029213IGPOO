package pt.iade.gestaoInventarios.models;

public class Categoria {
	private int idCategoria;
	private String descrição;
	public Categoria(int idCategoria, String descrição) {
		this.idCategoria = idCategoria;
		this.descrição = descrição;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	@Override
	public String toString() {
		return this.descrição;
	}
	
	
}
