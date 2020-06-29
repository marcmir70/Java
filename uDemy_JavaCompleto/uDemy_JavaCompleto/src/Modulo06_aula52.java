import java.util.Locale;
import java.util.Scanner;

public class Modulo06_aula52 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
/*		
	// exercicio 1
		int x=0;
		while ( (x<1) || (x>1000) ) {
			System.out.println("Informe um numero entre 1 e 1000");
			x = sc.nextInt();
		}
		for ( int i=1; i<=x; i +=2) {
			System.out.println(i);
		}

	// exercicio 2
		int N, in=0, out=0, a;
		N = sc.nextInt();
		for ( int i=1; i<=N; i++) {
			a = sc.nextInt();
//			((a>=10) && (a<=20)) ? in++ : out++; << porque não funciona? Resp. da uDemy: precisa declarar tipo int/Integer...
//			if ((a>=10) && (a<=20)) in++;
//			else out++;
			int cond = ((a >= 10) && (a <= 20)) ? in++ : out++; // correção sugerida pelo Rafael da EducandoWeb/uDemy
		}
		System.out.printf("%d in\n", in);
		System.out.printf("%d out", out);

	// exercicio 3
		int Ncasos;
		double valor1, valor2, valor3, media;
		Ncasos = sc.nextInt();
		for ( int i=1; i<=Ncasos; i++ ) {
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			media = ( valor1*2 + valor2*3 + valor3*5 ) / 10;
			System.out.printf("%.1f", media);
		}

	// exercicio 4
		int Npares;
		double a, b;
		Npares = sc.nextInt();
		for ( int i=1; i<=Npares; i++ ) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			if ( b==0 ) System.out.println("divisao impossivel");
			else System.out.printf( "%.1f", a/b );
		}		

	// exercicio 5
		long Numero, fatorial;  // usando long para grandes fatoriais
		Numero = sc.nextInt();
		fatorial = 1;
		for ( long i=Numero; i>0; i-- ) {
			fatorial *= i;
		}		
		System.out.println(fatorial);
*/
	// exercicio 6
		
	// exercicio 7
		
		sc.close();
	}
}