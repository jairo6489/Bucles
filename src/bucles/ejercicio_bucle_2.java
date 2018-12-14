package bucles;

import java.util.Scanner;

public class ejercicio_bucle_2 {

	/*1-Pedimos al usuario 2 números enteros positivos.
	  2-Sumar el primer numero tantas veces como me indique el segundo.*/

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int x, y;
		int result = 0;

		//1-Pedimos al usuario 2 números enteros positivos.

		do {
			System.out.printf("Please, insert a first number.\n");
			x = Keyboard.nextInt();
			System.out.printf("Please, insert a second number.\n");
			y = Keyboard.nextInt();

		} while (x < 0 && y < 0);

		//2-Sumar el primer numero tantas veces como me indique el segundo.

		for (int i = 1; i <= y; ++i) {
			result += x;
		}
		System.out.println("The result is");
		System.out.printf("%d", result);

		Keyboard.close();

	}
}
