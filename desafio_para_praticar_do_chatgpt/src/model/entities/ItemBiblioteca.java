package model.entities;

import model.exception.FindTypeException;

abstract public class ItemBiblioteca {

	protected String titulo;
	protected Boolean disponivel;

	public ItemBiblioteca() {
	}

	public ItemBiblioteca(String titulo, Boolean disponivel) {
		this.titulo = titulo;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public void emprestar() {
		disponivel = false;
		System.out.printf("O item %s está emprestado.", titulo);
	}

	public void devolver() {
		disponivel = true;
		System.out.println("O item está disponível");
	}

	public void pesquisarPorTitulo(String titulo) {
		if (titulo == this.titulo) {
			System.out.printf("O item %s foi encontrado. %n", this.titulo);
		} else {
			throw new FindTypeException("FindTypeException: Item não encontrado.");
		}
	}
}
