package curso_programacao;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
//Fazer um programa que l� n�meros
	//inteiros at� que um zero seja lido. Ao
		//final mostra a soma dos n�meros lidos
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x; // ou soma =+ x;
			x = sc.nextInt();
			
		}
		System.out.println(soma);
		sc.close();
	}

}
