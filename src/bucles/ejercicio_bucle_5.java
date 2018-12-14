package bucles;

import java.util.Scanner;

import java.util.Random;

public class ejercicio_bucle_5 {

	//1-Pediremos al usuario dos numeros para nuestro programa.
	//2-Generaremos 15 número aleatorios entre el rango de ambos números.

	public static void main(String[] args) {
		Random random = new Random();
		Scanner Keyboard = new Scanner(System.in);

		int x, y;
		
		//1-Pediremos al usuario dos numeros para nuestro programa.

		System.out.printf("Please, insert the largest parameter\n");
		x = Keyboard.nextInt();
		System.out.printf("Please, insert the lower parameter\n");
		y = Keyboard.nextInt();

		Keyboard.close();
		
		//2-Generaremos 15 número aleatorios entre el rango de ambos números.
		
        // Aquí tenemos el bucle para los 15 números aleatorios.
		for (int i = 1; i <= 15; i++) {
			
		//Si el número x es menor al número y se ejecutará este if.
			if (x < y) {
				System.out.printf("random numbers between the parameters %d, %d, (%d)\n", x, y, i);
				System.out.println(random.nextInt(y - x + 1) + x);

		//Se ejecutará siempre que x sea mayor a y.		
			} else {
				System.out.printf("random numbers between the parameters %d, %d, (%d)\n", x, y, i);
				System.out.println(random.nextInt(x - y + 1) + y);
			}
		}
	}
}
