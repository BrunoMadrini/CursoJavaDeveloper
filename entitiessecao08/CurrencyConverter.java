package entitiessecao08;

public class CurrencyConverter {
	
	public static double IOF = 1.06;

	public static double dollarToReal(double dollarValue, double bought) {
		return (dollarValue * bought) * IOF;
	}
}
