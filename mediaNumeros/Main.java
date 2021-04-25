package mediaNumeros;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		float soma = 0, media;
		float numeros[] = new float[4];
		Scanner teclado = new Scanner(System.in);
		
		
		for (i = 0; i <= 3; i++ ) {
			
			System.out.print("Digite o " + (i+1) + "° numero: ");
			numeros[i] = teclado.nextFloat();
			soma += numeros[i];
			
		}
		
		media = soma/4;
		System.out.printf("\n\nA média dos numeros informados é %.2f", media);

	}

}
