package classes;

public class Estudante {
	
	public String nome;
	public double nota1, nota2, nota3, media;
	
	@Override
	public String toString() {
		return "\nNOTA FINAL: " + media + "\n";
	}

	public double NotaFinal() {
		return media;
	}
	
	public double DiferencaNota() {
		return 60 - media;
	}
	
	public void CalculoMedia() {
		media = nota1 + nota2 + nota3;
	}

}
