package pt.iade.gestaoInventarios.models;

public class Colaborador {
	private int idColaboarador;
	private String nome;
	private int nColaborador;
	private String telefone;

	public Colaborador(int idColaboarador, String nome, int nColaborador) {
		this.idColaboarador = idColaboarador;
		this.nome = nome;
		this.nColaborador = nColaborador;
	}

	public Colaborador() {
	}

	public int getIdColaboarador() {
		return idColaboarador;
	}

	public void setIdColaboarador(int idColaboarador) {
		this.idColaboarador = idColaboarador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnColaborador() {
		return nColaborador;
	}

	public void setnColaborador(int nColaborador) {
		this.nColaborador = nColaborador;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return this.nome;
	}

}
