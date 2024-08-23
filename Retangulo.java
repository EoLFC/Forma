package Entidades;

public class Retangulo extends Base{

	public Retangulo(float largura, float altura) {
		super(largura, altura);
	}
		 Base arear = new Base(largura, altura);
	
		public float calcularArea () {
			return largura * altura;
			
	}
}
