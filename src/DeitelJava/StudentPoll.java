package DeitelJava;
//Figura 7.8: StudentPoll.java
//Programa de an�lise de enquete.

public class StudentPoll {

	public static void main(String[] args) {
		//array das respostas dos alunos
		int[] responses = { 1, 2, 5, 1, 4, 5, 1, 2, 14};
		
		int[] frequency = new int[6];//array de contadores de frequ�ncia
		
		//para cada resposta, seleciona elemento de respostas e utiliza esse valor 
		//como �ndice de frequencia para determina elemento a incrementar
		
		for(int answer = 0; answer < responses.length; answer++)
		{
			try {
				++frequency[responses[answer]];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);//invoca o m�todo toString
				System.out.printf(" responses[%d] = %d%n%n", answer, responses[answer]);
			}
		}
		
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		
		//gera sa�da do valor de cada elemento do array
		for(int rating = 1; rating < frequency.length; rating++)
			System.out.printf("%6d%10d%n", rating, frequency[rating]);
	}

}//Fim da classe StudentPoll
