package DeitelJava;
//Figura 7.3: InitArray.java
//Inicializando os elementos de um array com um inicializador de array
public class InitArray {

	public static void main(String[] args) {
		//A lista de inicializador especifica o valor inicial de cada elemento
		int[] array = { 37, 45, 22, 85, 75, 15, 29, 55, 92, 33};
		
		System.out.printf("%s%8s%n", "Index", "Value");//titulos da coluna
		
		//gera saída do valor de cada elemento do array
		for(int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	
	}

}//fim da classe InitArray
