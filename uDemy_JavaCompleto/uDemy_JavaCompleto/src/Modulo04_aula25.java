import java.util.Scanner;

public class Modulo04_aula25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();   // pula a linha seguinte pelo ENTER como quebra de linha pro próximo comando
		sc.nextLine(); 		   // para mitigar o problema acima...
		s1 = sc.nextLine(); // para ler a linha inteira ; só next lè apenas a primeira palavra
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}
}