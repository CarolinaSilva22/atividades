package sequencial;
import java.util.Scanner;
public class CalculoEsfera {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o raio da esfera:");
        double raio = input.nextDouble();
        
     
        int comprimentoEsfera = (int) Math.round(2 * Math.PI * raio);
        
   
        int areaEsfera = (int) Math.round(Math.PI * Math.pow(raio, 2));
        
      
        int volumeEsfera = (int) Math.round((3.0 / 4.0) * Math.PI * Math.pow(raio, 3));
        
        System.out.println("Comprimento da esfera: " + comprimentoEsfera);
        System.out.println("Area da esfera: " + areaEsfera);
        System.out.println("Volume da esfera: " + volumeEsfera);
        
        input.close();
        System.exit(0);
    }
}