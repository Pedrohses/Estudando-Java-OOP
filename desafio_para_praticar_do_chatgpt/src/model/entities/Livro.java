package model.entities;

public class Livro extends ItemBiblioteca {

	public Livro() {
		super();
	}

	public Livro(String titulo, Boolean disponivel) {
		super(titulo, disponivel);
	}
	
	@Override
	public void emprestar() {
		disponivel = false;
		System.out.printf("O livro %s foi emprestado. %n", titulo);
	}
	
	@Override
	public void devolver() {
		disponivel = true;
		System.out.printf("O livro %s está disponível. %n", titulo);
	}
	
	@Override
	public String toString() {
		if (disponivel == true) {
			return "Nome: " + titulo + ", Tipo: Livro, Disponível: Sim" ;
		}
		return "Nome: " + titulo + ", Tipo: Livro, Disponível: Não";
	}
}
