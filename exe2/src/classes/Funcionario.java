package classes;

public class Funcionario {
	
	public String nome;
	public double salario_bruto;
	public double imposto;
	
	public double Salario() {
		return salario_bruto - imposto;
	}
	
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", Salario());
	}
	
	public void Aumento(double porcentagem) {
		salario_bruto += salario_bruto * (porcentagem / 100);
	}

}
