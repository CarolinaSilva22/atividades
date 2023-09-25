package condicional;


import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:[0 a 10] ");
		int nota1 = input.nextInt();
		
		System.out.println(" Digite a segunda nota:[0 a 10] ");
		int nota2 = input.nextInt();
		
		System.out.println("Digite a terceira nota:[0 a 10] ");
		int nota3 = input.nextInt();
		
		int media = (nota1 + nota2 +nota3)/3;
		
		if (media >= 0 && media <3){
			System.out.println("REPROVADO!");

		}else if (media >=3 && media <7){
			System.out.println("EXAME!");

		}else if (media >=7 && media <=10){
			System.out.println("APROVADO!");
		}else{
			System.out.println("Nota não valida!");}


	}

}
