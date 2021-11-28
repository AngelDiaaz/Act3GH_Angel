package Metodos;

public class NumeroAleatorios {

	public static void main(String[] args) {
		int[] array = new int[20];
		int num, contador;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*10);
		}
		
		for (int i = 0; i < array.length; i++) {
			num = array[i];
			contador = 0;
			for (int j = 0; j < array.length; j++) {
				if (num == array[j]) {
					contador++;
				}
			}
			if (contador == 1)
				System.out.println(array[i] + " se repite " + contador + " vez");
			else
				System.out.println(array[i] + " se repite " + contador + " veces");

		}

}
}
