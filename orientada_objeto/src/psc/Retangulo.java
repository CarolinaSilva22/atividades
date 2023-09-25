package psc;

public class Retangulo {
	private float altura, largura;

	public Retangulo() {
		/**Atributos*/
		altura = 0;
		largura = 0;
	}
	/**Metodos*/
	public float getAltura() {
		return (altura);
	}

	public void setAltura(float alt) {
		altura = alt;
	}

	public float getLargura() {
		return (largura);
	}

	public void setLargura(float larg) {
		largura = larg;
	}

	public float calculaArea() {
		return altura * largura;
	}

	public float calculaPerimetro() {
		return 2 * altura + 2 * largura;
	}
	
	public String exibir() {
		String info = "\nAltura: " + altura + "\nLargura: " + largura +"\nPerimetro: "+ calculaPerimetro() + "\nÁrea: " + calculaArea();
		return(info);
	}
	
}