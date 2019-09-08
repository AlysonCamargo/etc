package hotel;

import java.util.List;
import java.util.Scanner;

public class reserva {

	static int idQuarto;
	String nomeHospede;
	static int[] quartosOcupados = {};

	static Scanner sc = new Scanner(System.in);

	static void reservarQuarto() {
		System.out.println("Digite o número do quarto a ser reservado: ");
		idQuarto = sc.nextInt();

		for (int i = 0; i < quartosOcupados.length; i++) {
			if (quartosOcupados[i] == idQuarto) {
				System.out.println("Este quarto já está ocupado.");
			} else {
				quartosOcupados[i] = idQuarto;
			}
		}

		System.out.println("Quarto reservado com sucesso.");
	}

	static void alugarQuarto() {
		System.out.println("Digite o número do quarto a ser alugado: ");
		idQuarto = sc.nextInt();

		for (int i = 0; i < quartosOcupados.length; i++) {
			if (quartosOcupados[i] == idQuarto) {
				System.out.println("Este quarto já está ocupado.");
			} else {
				quartosOcupados[i] = idQuarto;
			}
		}

		System.out.println("Quarto alugado com sucesso.");
	}

}
