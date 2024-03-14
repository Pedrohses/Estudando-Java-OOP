package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> products = new ArrayList<>();

		String name;
		Double price;
		String manufactureDate;
		Double customsFee;

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);

			switch (type) {

			case 'c':
				System.out.print("Name: ");
				name = sc.next();
				System.out.print("Price: ");
				price = sc.nextDouble();
				products.add(new Product(name, price));
				break;

			case 'u':
				System.out.print("Name: ");
				name = sc.next();
				System.out.print("Price: ");
				price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				manufactureDate = sc.next();
				products.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
				break;

			case 'i':
				System.out.print("Name: ");
				name = sc.next();
				System.out.print("Price: ");
				price = sc.nextDouble();
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
				break;
			}
		}
		
		System.out.println("PRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}
