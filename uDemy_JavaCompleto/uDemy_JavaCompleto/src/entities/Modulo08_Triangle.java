//uDemy, curso Java Completo, secao 13, aula 63
package entities;

public class Modulo08_Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}
}