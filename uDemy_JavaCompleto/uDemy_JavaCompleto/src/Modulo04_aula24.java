import java.util.Locale;
import java.util.Scanner;

public class Modulo04_aula24 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);   // obriga a digitar com PONTO no lugar de VÍRGULA
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite uma palavra...");
		String x; 
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		System.out.println();
		
		System.out.println("Digite um número inteiro...");
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		System.out.println();
				
		System.out.println("Digite um número decimal...");
		double z;
		z = sc.nextDouble();
		System.out.println("Voce digitou: " + z); // considera a localidade do sistema!
		System.out.println();
				
		System.out.println("Digite um caractere...");
		char a;
		a = sc.next().charAt(0);  // pega o primeiro caractere da string que informar
		System.out.println("Voce digitou: " + a);
		System.out.println();
		
		System.out.println("Digite uma palavra, um número inteiro e um número decimal...");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
}
