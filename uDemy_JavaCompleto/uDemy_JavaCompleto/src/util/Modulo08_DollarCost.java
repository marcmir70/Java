//uDemy, curso Java Completo, secao 13, aula 71 - exercicio de fixacao
package util;

public class Modulo08_DollarCost{
	public static final double IOF = 0.06;
	
	public static double costCalc (double dollarPrice, double dollarsQuantity) {
		return dollarPrice * dollarsQuantity * ( 1 + IOF );
	}
}
