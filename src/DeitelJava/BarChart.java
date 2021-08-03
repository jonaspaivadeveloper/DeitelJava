package DeitelJava;
//Figura 7.6: BarChart.java
//programa de impressão de gráfico de barras
public class BarChart {

	public static void main(String[] args) {
		int[] array = { 2, 0, 0, 0, 0, 0, 1, 3 , 4, 30, 1};
		
		System.out.println("Grade distribuition:");
		
		//para cada elemento de array, gera saída de uma barra do gráfico
		for(int counter = 0; counter < array.length; counter++)
		{
			//gera saída do rótulo de barra
			if(counter == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
			
			//imprime a barra de asteriscos
			for(int stars = 0; stars < array[counter]; stars++)
				System.out.print("*");
			System.out.println();
		}
	}
}//fim da classe BarChart
