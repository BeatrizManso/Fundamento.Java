import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculoMedia {
	public static void main(String[] args) {
	double nota1, nota2, media;
	System.out.println("C�lculo da M�dia");
	// criando um objeto para o c�lculo de dados
	// tudo que come�a com letra mai�scula � classe, scanner � usado para entrada de dados
	Scanner leia = new Scanner(System.in);
	// a linha abaixo configura o separador para o ponto
	leia.useLocale(Locale.ENGLISH);
	// criando um objeto para formatar o resultado
	DecimalFormat formatador = new DecimalFormat("#0.0");
	System.out.print("Digite a nota1: ");
	nota1 = leia.nextDouble();
	System.out.print("Digite a nota2: ");
	nota2 = leia.nextDouble();
	media = (nota1 + nota2)/ 2;
	System.out.println("M�dia:"+ formatador.format(media));
	if (media < 5) {
		System.out.println("Reprovado.");
	} else {
		System.out.println("Aprovado.");
	}
	leia.close();
	
	}
}
