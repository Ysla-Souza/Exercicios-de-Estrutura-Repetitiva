package curso_programacao;

import java.util.Scanner;

public class uri1153 {

	public static void main(String[] args) {
		// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		//Lembrando que, por defini��o, fatorial de 0 � 1.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int fatorial = 1;
		for(int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}

}