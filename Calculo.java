package calculadora;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Numero numero1 = new Numero();
		Numero numero2 = new Numero();
		Numero resultado = new Numero();
		
		System.out.println("Digite o primeiro número ");
		numero1.setValor(read.nextDouble());
		
		System.out.println("Digite o segundo número ");
		numero2.setValor(read.nextDouble());
		
		resultado.setValor(numero1.getValor() + numero2.getValor());
		System.out.println("A soma do " +numero1.getValor()+ " com " + numero2.getValor() + " e igual a : " +resultado.getValor());
	}

}
