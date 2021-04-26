package fahrenheit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahrenheit;
		double celsius;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		celsius = teclado.nextDouble();
		fahrenheit = (double)(((1.8) * celsius) + 32);
		System.out.println("A temperatura em Fahrenheit é " + fahrenheit);

	}

}
