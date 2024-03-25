package application;

import model.entities.CD;
import model.entities.ItemBiblioteca;
import model.entities.Livro;
import model.entities.Revista;
import model.exception.FindTypeException;

public class Program {

	public static void main(String[] args) {
		
		/* Poderia fazer de outras formas mais eficientes, porém fiz 
		para usar os conceitos principais de orientação a objetos apenas.
		Sendo: Encapsulamento, Herança e Poliformismo (Usei também
		tratamento de erros).*/

		ItemBiblioteca livro = new Livro("Domcasmurro", false);
		ItemBiblioteca revista = new Revista("Capricho", true);
		ItemBiblioteca cd = new CD("Beatles", true);
		String buscar = "Capricho";
		
		livro.devolver();
		cd.emprestar();
		System.out.println();
		
		try {
			revista.pesquisarPorTitulo(buscar);
			System.out.println(livro);
			System.out.println(revista);
			System.out.println(cd);
			livro.pesquisarPorTitulo(buscar);
		} catch (FindTypeException e) {
			System.out.println(e.getMessage());
		}
	}

}
