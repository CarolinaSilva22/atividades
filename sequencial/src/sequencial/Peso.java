package sequencial;

import java.util.Scanner;
public class Peso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso atual da pessoa em quilogramas: ");
        double pesoAtual = scanner.nextDouble();

        double novoPesoEngordar = calcularNovoPesoEngordar(pesoAtual);
        double novoPesoEmagrecer = calcularNovoPesoEmagrecer(pesoAtual);

        System.out.println("Se a pessoa engordar 15%, o novo peso será: " + novoPesoEngordar + " kg");
        System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + novoPesoEmagrecer + " kg");

        scanner.close();
        System.exit(0);
    }

    public static double calcularNovoPesoEngordar(double pesoAtual) {
        return pesoAtual * 1.15;
    }

    public static double calcularNovoPesoEmagrecer(double pesoAtual) {
        return pesoAtual * 0.8;
    }
}

	