package condicional;


import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
			
		System.out.println("Digite sua altura: ");
		double altura = input.nextDouble();
		
		System.out.println("Digite seu peso: ");
		int peso = input.nextInt();
		
		double imc = peso/Math. pow(altura, 2);
		
		if (imc < 20){
			System.out.println("Abaixo do peso!");

		}else if (imc >=20 && imc <25){
			System.out.println("Normal!");

		}else if (imc >=25 && imc <=30){
			System.out.println("Sobrepeso!");
		
		}else if (imc >=30 && imc <=40){
			System.out.println("Obesidade!");
		
		}else if (imc > 40 ){
			System.out.println("Obesidade Móbida!");
	
	}

	}

}
