import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, quantia, nteste = 0;
		char tipo;
		double percentual;
		
		// leitura dos dados
		
		N = sc.nextInt();
		
		
		// calculos
		
		while (nteste != N) {
			quantia = sc.nextInt();
			tipo = sc.next().charAt(0);
			nteste = nteste + 1;
		}
		
		
		sc.close();

	}

}
