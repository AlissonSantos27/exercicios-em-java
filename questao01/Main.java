package questao01;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total;
		double porcentagemIntoxicacao;
		
		int queimados = 28;
		int intoxicacao = 45;
		int ilesos = 7;
		
		total = queimados + intoxicacao + ilesos;
		porcentagemIntoxicacao = (intoxicacao/total)*100;
		
		
		System.out.println("Porcentagem de queimados: " + porcentagemIntoxicacao + "%");		
	}

}
