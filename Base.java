package Entidades;

public class Base {

	protected float largura;
	protected float altura;
	protected double base2;
	protected double altura2;
	
	public Base(float largura, float altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}
	
	public Base(double base2, double altura2) {
		super();
		this.base2 = base2;
		this.altura2 = altura2;
	}
	public float calcularArea () {
	return largura * altura;
	}
	public double calcularArea2 () {
	return base2 * altura2 / 2;
	}
	public String mostrarInfo() {
		return "Largura: " + largura + "\nAltura: " + altura;
	}
	public String mostarInfo2() {
		return "Base: " + base2 + "\nAltura: " + altura2;
	}
	
	
}
