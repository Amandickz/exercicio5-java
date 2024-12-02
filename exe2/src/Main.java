import java.util.Scanner;

import classes.Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		double porcentagem;
		
		System.out.print("Nome: ");
		func.nome = scan.nextLine();
		System.out.print("Salário Bruto: R$ ");
		func.salario_bruto = scan.nextDouble();
		System.out.print("Imposto: R$ ");
		func.imposto = scan.nextDouble();
		
		System.out.printf("\nFuncionário: " + func);
		System.out.print("\n\nQual a porcentagem do aumento? ");
		porcentagem = scan.nextDouble();
		func.Aumento(porcentagem);
		System.out.printf("\nAtualização do Funcionário: " + func);

	}

}
