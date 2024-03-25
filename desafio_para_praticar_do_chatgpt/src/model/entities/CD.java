package model.entities;

public class CD extends ItemBiblioteca {

	public CD() {
		super();
	}

	public CD(String titulo, Boolean disponivel) {
		super(titulo, disponivel);
	}
	
	@Override
	public void emprestar() {
		disponivel = false;
		System.out.printf("O CD %s foi emprestado. %n", titulo);
	}
	
	@Override
	public void devolver() {
		disponivel = true;
		System.out.printf("O CD %s está disponível. %n", titulo);
	}
	
	@Override
	public String toString() {
		if (disponivel == true) {
			return "Nome: " + titulo + ", Tipo: CD, Disponível: Sim" ;
		}
		return "Nome: " + titulo + ", Tipo: CD, Disponível: Não";
	}
}
