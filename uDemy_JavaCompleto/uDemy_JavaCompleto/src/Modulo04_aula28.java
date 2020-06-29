import java.util.Locale;
import java.util.Scanner;

public class Modulo04_aula28 {

	public static void main(String[] args) {
		// exercícios propostos
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

/*		
		// exercício 1
		int a;
		int b; 		
		System.out.println("Digite o primeiro valor...");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor...");
		b = sc.nextInt();
		System.out.printf("SOMA = %d", a + b);
		
		// exercício 2
		double raio;
		double pi = 3.14159;
		System.out.println("Digite o raio...");
		raio = sc.nextDouble();
		System.out.printf("A = %.4f", pi * Math.pow(raio,2.0));
		
		// exercício 3
		int A, B, C, D;
		System.out.println("Digite o primeiro valor...");
		A = sc.nextInt();
		System.out.println("Digite o segundo valor...");
		B = sc.nextInt();
		System.out.println("Digite o terceiro valor...");
		C = sc.nextInt();
		System.out.println("Digite o quarto valor...");
		D = sc.nextInt();
		System.out.printf("DIFERENCA = %d", (A * B) - (C * D));

		// exercício 4
		int NUMBER, workedHours;
		double salary, workedHourCost;
		System.out.println("Digite o número do funcionário...");
		NUMBER = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas...");
		workedHours = sc.nextInt();
		System.out.println("Digite o custo por hora trabalhada...");
		workedHourCost = sc.nextDouble();
		salary = (double) workedHours * workedHourCost;
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = US$ %.2f", salary);

		// exercício 5
		int piece1code, piece2code, piece1quantity, piece2quantity;
		double piece1cost, piece2cost;
		
		piece1code = sc.nextInt();
		piece1quantity = sc.nextInt();
		piece1cost = sc.nextDouble();
		piece2code = sc.nextInt();
		piece2quantity = sc.nextInt();
		piece2cost = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", (piece1quantity * piece1cost) + (piece2quantity * piece2cost));		
*/
		// exercício 6
		double A, B, C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		double PI = 3.14159;
		
		System.out.printf("TRIANGULO: %.3f\n", A * C / 2);
		System.out.printf("CIRCULO: %.3f\n", PI * Math.pow(C, 2));
		System.out.printf("TRAPEZIO: %.3f\n", C * (A + B) / 2);
		System.out.printf("QUADRADO: %.3f\n", Math.pow(B, 2));
		System.out.printf("RETANGULO: %.3f", A * B);
				
		sc.close();
	}
}
