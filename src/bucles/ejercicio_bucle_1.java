package bucles;

import java.util.Scanner;

public class ejercicio_bucle_1 {
	/*
	1-Pedir al usuario un número entre 0 y 10. 
	2-Mostrar la tabla de multiplicar de dicho número.
	*/

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);

		int num;

		// 1-Pedir al usuario un número entre 0 y 10.

		do {
			System.out.printf("Please, insert a number from 0 to 10.\n");
			num = Keyboard.nextInt();
			

		} while (num < 0 || num > 10);

		// 2-Mostrar la tabla de multiplicar de  dicho número.

		System.out.println("Now we will show the multiplication table.");
		for (int i = 0; i <= 10; ++i) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
			
			Keyboard.close();
		}

	}
}