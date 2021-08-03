package DeitelJava;
//Figura 7.5: SumArray.java
//Calculando a soma dos elementos de um array
public class SumArray {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 4 , 5, 6, 7, 8, 9};
		int total = 0;//zero pelo fato que o total começa nulo!
		
		//adiciona o valor de cada elemento ao total
		for(int counter = 0; counter < array.length; counter++)
			total += array[counter];
		
		System.out.printf("Total of array elements: %d%n", total);
	}
}//fim da classe SumArray
