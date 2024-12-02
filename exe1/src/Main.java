import java.util.Scanner;

import classes.Retangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("Digite a largura e altura do retângulo: ");
		ret.largura = scan.nextDouble();
		ret.altura = scan.nextDouble();
		
		System.out.printf("ÁREA = %.2f \n", ret.Area());
		System.out.printf("PERIMETRO = %.2f \n", ret.Perimetro());
		System.out.printf("DIAGONAL = %.2f \n", ret.Diagonal());
	}

}
