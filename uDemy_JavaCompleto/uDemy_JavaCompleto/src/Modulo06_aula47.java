import java.util.Scanner;

public class Modulo06_aula47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*
	// exercicio 1
		boolean senhaOk = false;
		String senha;
		
		while (!senhaOk) {
			senha = sc.next();
//			if (senha == "2002") {  // Java não compara String diretamente! 
			if ( senha.compareTo("2002") != 0 ) { 
				System.out.println("Senha Invalida");
			}
			else { 
				System.out.println("Acesso Permitido");
				senhaOk = true;
			}
		}

	// exercicio 2
		int x=1, y=1;
		while ( (x != 0) && (y != 0) ) {
			x = sc.nextInt();
			y = sc.nextInt();
			if      ( (x>0) && (y>0) ) System.out.println("primeiro");
			else if ( (x<0) && (y>0) ) System.out.println("segundo");
			else if ( (x<0) && (y<0) ) System.out.println("terceiro");
			else if ( (x>0) && (y<0) ) System.out.println("quarto");
		}
*/		
	// exercicio 3
		int tipo=0, alcool=0, gasolina=0, diesel=0;
		while ( tipo != 4 ) {
			tipo = sc.nextInt();
			switch (tipo) {
			case 1: alcool += 1; break;
			case 2: gasolina += 1; break;
			case 3: diesel += 1; break;
			case 4: System.out.println("MUITO OBRIGADO");
			default: break;			
			}
		}
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d", diesel);
		
		sc.close();
	}
}