package exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class ES05 {

public static void main(String[] args) {
		
		//Local US
		Locale.setDefault(Locale.US);
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int peca1, peca2, qtd1, qtd2;
		double valorUnit1, valorUnit2;
		
		System.out.println("");
		System.out.println("========== CALCULA TOTAL PRODUTO ==========\n");
		System.out.println("");
		
		
		System.out.println("===== PRODUTO 1 =====\n");
		//Product 1		
		System.out.printf("Informe o c�código do item: ");
		peca1 = sc.nextInt();
		
		System.out.printf("Informe a quantidade do item: ");
		qtd1 = sc.nextInt();
		
		System.out.printf("Informe o valor do item: ");
		valorUnit1 = sc.nextDouble();
		
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("===== PRODUTO 2 =====\n");
		
		//Product 2	
		System.out.printf("Informe o código do item: ");
		peca2 = sc.nextInt();
		
		System.out.printf("Informe a quantidade do item: ");
		qtd2 = sc.nextInt();
		
		System.out.printf("Informe o valor do item: ");
		valorUnit2 = sc.nextDouble();
		
		double total = (qtd1 * valorUnit1) + (qtd2 * valorUnit2);
		
		//Pula Linha
		System.out.println("");
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		sc.close();
	}
}
