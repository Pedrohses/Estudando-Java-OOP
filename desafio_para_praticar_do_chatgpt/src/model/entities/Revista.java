package model.entities;

public class Revista extends ItemBiblioteca {

	public Revista() {
		super();
	}

	public Revista(String titulo, Boolean disponivel) {
		super(titulo, disponivel);
	}
	
	@Override
	public void emprestar() {
		disponivel = false;
		System.out.printf("A revista %s foi emprestado. %n", titulo);
	}
	
	@Override
	public void devolver() {
		disponivel = true;
		System.out.printf("A revista %s está disponível. %n", titulo);
	}
	
	@Override
	public String toString() {
		if (disponivel == true) {
			return "Nome: " + titulo + ", Tipo: Revista, Disponível: Sim" ;
		}
		return "Nome: " + titulo + ", Tipo: Revista, Disponível: Não";
	}
}
