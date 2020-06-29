//uDemy, curso Java Completo, secao 13, aula 68
package entities;

public class Modulo08_Aluno {
	public String name;
	public double trim1Grade;
	public double trim2Grade;
	public double trim3Grade;
	
	public double finalGrade () {
		return ( trim1Grade + trim2Grade + trim3Grade );
	}
}