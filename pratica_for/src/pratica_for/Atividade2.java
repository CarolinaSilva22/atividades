package pratica_for;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num1 = input.nextInt();
		System.out.print("Digite um número inteiro: ");
		int num2 = input.nextInt();
	
		for (int i = num1; i <= num2; i++)
		System.out.println(i);
	}

}
