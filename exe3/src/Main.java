import java.util.Scanner;

import classes.Estudante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Estudante estudante = new Estudante();
		
		System.out.printf("Nome: ");
		estudante.nome = scan.nextLine();
		System.out.printf("Nota 1: ");
		estudante.nota1 = scan.nextDouble();
		System.out.printf("Nota 2: ");
		estudante.nota2 = scan.nextDouble();
		System.out.printf("Nota 3: ");
		estudante.nota3 = scan.nextDouble();
		
		estudante.CalculoMedia();
		System.out.print(estudante);
		
		if(estudante.NotaFinal() < 60) {
			System.out.println("ERRO!");
			System.out.printf("FALTAM " + estudante.DiferencaNota() + " PONTOS PARA A MÉDIA");
		} else {
			System.out.println("APROVADO");
		}
		
	}

}
