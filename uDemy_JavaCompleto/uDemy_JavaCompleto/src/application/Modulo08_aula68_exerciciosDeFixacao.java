//uDemy, curso Java Completo, secao 13, aula 68 - exercicio de fixacao
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Modulo08_Aluno;

public class Modulo08_aula68_exerciciosDeFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
// exercicio 1
/*		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n", rectangle.area()); 
		System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());

// exercicio 2
		double percentage;
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data : " + employee);
*/
// exercicio 3
////		double cutGrade = 60.0;
		
		Modulo08_Aluno aluno = new Modulo08_Aluno();
		System.out.println("Digite nome do Aluno e suas três notas trimestrais");
		aluno.name = sc.nextLine();
		aluno.trim1Grade = sc.nextDouble();
		aluno.trim2Grade = sc.nextDouble();
		aluno.trim3Grade = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f\n", aluno.finalGrade());
		if ( aluno.finalGrade() >= 60 ) System.out.println("PASS");
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60-aluno.finalGrade());
		}
			
		sc.close();
	}
}
