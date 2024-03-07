package entities;

public class Rectangle {
	
	public double largura;
	public double altura;
	
	public double Area() {
		return largura*altura;
	}
	
	public double Perimeter() {
		return (largura*2)+(altura*2);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}
	
}
