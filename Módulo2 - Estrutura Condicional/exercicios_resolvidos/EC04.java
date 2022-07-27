package exercicios_resolvidos;

import java.util.Scanner;

public class EC04 {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int horaInicio, horaFinal, duracao;

		System.out.println("=============================");
		System.out.println("        TEMPO DE JOGO        ");
		System.out.println("=============================");

		// Pula Linha
		System.out.println("");

		System.out.printf("Informe a hora que iniciou o jogo: ");
		horaInicio = sc.nextInt();
		System.out.printf("Informe a hora que terminou o jogo: ");
		horaFinal = sc.nextInt();

		// Pula Linha
		System.out.println("");

		if (horaInicio > horaFinal) {
			duracao = (24 + horaFinal) - horaInicio;
			System.out.printf("O jogo durou %d horas.", duracao);
		} else if (horaInicio == horaFinal) {
			System.out.println("O jogo durou 24 horas.");
		} else {
			duracao = horaFinal - horaInicio;
			System.out.printf("O jogo durou %d horas.", duracao);
		}
		sc.close();
	}
}
