package util;

public class Calculadora {
	
	public static double valorDollar;
	public static double qtdDollar;
	public static final double IOF = 6;
	public static double impostoCalculado;
	
	public static double Calc() {
		impostoCalculado = (valorDollar * qtdDollar)*IOF/100;
		return (valorDollar * qtdDollar) + impostoCalculado;
		
	}
}
