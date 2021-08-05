package DeitelJava;

import java.security.SecureRandom;

//Figura 7.7: RollDie.java
//Programa de jogo de dados utilizando arrays em vez de switch.
public class RollDie {

	public static void main(String[] args) {
		
		SecureRandom randomSecure = new SecureRandom();
		int[] frequency = new int[7];//array com contadores de frequencia
		
		//lança o dado 6mil vezes; usa o valor do dado como índice de frequencia
		for( int roll = 1; roll <= 7; roll++)
			++frequency[1 + randomSecure.nextInt(6)];
		
		System.out.printf("%s%10s%n", "Face", "Frequency");
		
		//gera saída do valor de cada elemento do array
		for (int face = 1; face < frequency.length; face++)
			System.out.printf("%4d%10d%n", face, frequency[face]);
	}

}//fim da classe RollDie
