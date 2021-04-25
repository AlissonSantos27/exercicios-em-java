package lista02questao5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero, somatorio = 0, media;
		int contador = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		numero  = teclado.nextFloat();
		
		while (numero > 0) {
			
			somatorio += numero;
			contador += 1;
			System.out.print("Digite um numero: ");
			numero  = teclado.nextFloat();
				
		}
		
		media = somatorio/contador;
		System.out.println("Total do somatorio dos valores positivos: " + somatorio);
		System.out.printf("Média aritmética dos valores positivos: %.2f\n", media);
		System.out.println("Total de valores positivos lidos: " + contador);

	}

}
