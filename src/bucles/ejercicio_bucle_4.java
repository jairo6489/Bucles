package bucles;

import java.util.Random;

public class ejercicio_bucle_4 {

	//1-Se simularan 20 tiradas de dado

	public static void main(String[] args) {
		Random random = new Random();

		//1-Se simularan 20 tiradas de dado

		for (int i = 1; i <= 20; ++i) {

			System.out.printf("Die roll (%d)\n", i);
			System.out.println(random.nextInt(6) + 1);
		}

	}

}
