package condicional;


import java.util.Scanner;


public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Digite quantas diárias foram passadas no hotel: ");
		int diaria = input.nextInt();

		int sem_taxa = diaria * 500;

		if (diaria < 15) {
			int taxa = diaria * 15;
			int total = sem_taxa + taxa;
			System.out.println("Valor total da taxa de serviço(R$15): " + taxa);
			System.out.println("Total a ser pago: " + total);

		} else if (diaria == 15) {
			int taxa = diaria * 10;
			int total = sem_taxa + taxa;
			System.out.println("Valor total da taxa de serviço(R$10): " + taxa);
			System.out.println("Total a ser pago: " + total);

		} else if (diaria > 15) {
			int taxa = diaria * 5;
			int total = sem_taxa + taxa;
			System.out.println("Valor total da taxa de serviço(R$5): " + taxa);
			System.out.println("Total a ser pago: " + total);
		}

	}

}
