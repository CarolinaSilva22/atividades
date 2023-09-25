package condicional;


import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Primeiro lado do triângulo: ");
		double lado1 = input.nextDouble();
		System.out.println("Segundo lado do triângulo: ");
		double lado2 = input.nextDouble();
		System.out.println("terceiro lado do triângulo: ");
		double lado3 = input.nextDouble();

		if (lado1 == lado2 && lado1 ==lado3){
			System.out.println("Os 3 lados iguais - triângulo equilátero");

		}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
			System.out.println("Os 3 lados diferentes - triângulo escaleno");
		
		}else{
			System.out.println("2 lados iguais e a base diferente - triângulo o isósceles");}




	}

}
