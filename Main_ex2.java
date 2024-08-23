package Aplicacao;
import java.util.Scanner;
import Entidades.Base;
import Entidades.Triangulo;
import Entidades.Retangulo;
public class Main_ex2 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

	System.out.println("Medir área de: ");
    System.out.println("1 - Triangulo");	
    System.out.println("2 - Retangulo");
    int opcao = scn.nextInt();
    
    switch (opcao) {
        case 1:
            System.out.println("Digite a base: ");
            double base = scn.nextDouble();
            System.out.println("Digite a altura: ");
            double altura2 = scn.nextDouble();
            
            Base triangulo = new Triangulo(base, altura2);
            System.out.println(triangulo.mostarInfo2());
            System.out.println("A area desse triangulo é:" + triangulo.calcularArea2());
            break;
        case 2:
        	System.out.println("Digite a largura: ");
            float largura = scn.nextFloat();
            System.out.println("Digite a altura: ");
            float altura = scn.nextFloat();
            
            Base retangulo = new Retangulo(largura, altura);
            System.out.println(retangulo.mostrarInfo());
            System.out.println("A area desse retângulo é:" + retangulo.calcularArea());
            break;
         default:
            System.out.println("Opção inválida, tente novamente");
            }
	}
}
