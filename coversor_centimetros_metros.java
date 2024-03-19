package exercicio_operadores_aritmeicos;

import java.util.Scanner;

public class coversor_centimetros_metros {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
			// valor em Celsius
			System.out.println("Insira a distância em centímetros:");
			float n1 = scan.nextFloat();
							
			System.out.println("\nA distância em centímetros é " + (n1));
			System.out.println("A distância em Metros é " + (n1/100));

		scan.close();
		

	}
}