public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break;
		
		System.out.println(numero);
		
	}
	//Embora a condição proposta seria de que teríamos numeros de 1 a 5 foi solicitado que no 3 haveria uma parada, então printou apenas 1 e 2

    }
}

// Se fizessemos a utilização do CONTINUE na aplicação em vez de BREAK vamos ter o resultado de 1,2,4,5
/* 
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue;
		
		System.out.println(numero);
		
	}

*/