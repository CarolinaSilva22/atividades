package sequencial;

import javax.swing.JOptionPane;
public class CalculoEsferaDialogo {

	public static void main(String[] args) {
     
        String raioStr = JOptionPane.showInputDialog("Digite o raio da esfera:");
        
       
        double raio = Double.parseDouble(raioStr);
        
       
        int comprimentoEsfera = (int) Math.round(2 * Math.PI * raio);
        
     
        int areaEsfera = (int) Math.round(Math.PI * Math.pow(raio, 2));
        
      
        int volumeEsfera = (int) Math.round((3.0 / 4.0) * Math.PI * Math.pow(raio, 3));
        
        
        JOptionPane.showMessageDialog(null, "Comprimento da esfera: " + comprimentoEsfera);
        JOptionPane.showMessageDialog(null, "Área da esfera: " + areaEsfera);
        JOptionPane.showMessageDialog(null, "Volume da esfera: " + volumeEsfera);
        System.exit(0);
    }
}
		

	