package questao2;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float onibus;
		float carro;
		float bicicleta;
		float pe;
		float porcentagem;
		
		onibus = (float)(0.5);
		carro = (float)(0.2);
		bicicleta = (float) (0.125);
	
		
		pe = 1 - onibus - carro - bicicleta;
		porcentagem = (float) (pe*100);
		
		System.out.printf("\n\nPorcentagem de pessoas que vão a pé para o trabalho %.2f %%", porcentagem);

	}

}
