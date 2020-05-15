import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, quantia, nteste = 0, coelhos=0, ratos=0, sapos=0, totalCobaias;
		char tipo;
		double percentualCoelhos, percentualRatos, percentualSapos;
		
		// leitura dos dados
		
		N = sc.nextInt();
		
		
		// Contagem das cobaias
		
		while (nteste != N) {
			quantia = sc.nextInt();
			tipo = sc.next().charAt(0);
			nteste = nteste + 1;
			
		if (tipo == 'C') {
			coelhos = coelhos + quantia;
		}
		if (tipo == 'R') {
			ratos = ratos + quantia;
		}
		if (tipo == 'S') {
			sapos = sapos + quantia;
		}
		}
		//cálculos
		
		totalCobaias = sapos + coelhos + ratos;
		percentualCoelhos = (double) (100 * coelhos) / totalCobaias;
		percentualRatos = (double) (100 * ratos) / totalCobaias;
		percentualSapos = (double) (100 * sapos) / totalCobaias;
		
		//impressão dos resultados
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);
		
		sc.close();

	}

}
