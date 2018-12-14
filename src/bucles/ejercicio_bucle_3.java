package bucles;

import java.util.Scanner;

public class ejercicio_bucle_3 {
	/*1-Pedir 10 notas al usuario.
	 *2-Contar cuantos hay de cada clase.
	  3-Mostrar resultados
	  */

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);

		/* introducimos las variables de la nota y de los contadores, ya que habrá una
		   variable para cada contador.*/

		int note;
		int d = 0, in = 0, a = 0, b = 0, n = 0, s = 0;

		//1-Pedir 10 notas al usuario.

		for (int i = 1; i <= 10; i++) {
			do {

				System.out.printf("Please, insert your note (%d)\n", i);
				note = Keyboard.nextInt();
				
				if (note < 0 || note > 10) {
					System.out.printf("Not valide,Please, insert again (%d)\n", i);
					note = Keyboard.nextInt();
			    }
       
			} while (note < 0 || note > 10);
			
			

			//2-Contar cuantos hay de cada clase.

			//creamos los distintos casos para las notas con su contador al final.

			if (note >= 0 && note <= 2) {
				d++;
			} else if (note >= 3 && note <= 4) {
				in++;
			} else if (note == 5) {
				a++;
			} else if (note == 6) {
				b++;
			} else if (note >= 7 && note <= 8) {
				n++;
			} else {
				s++;
			}
		}

		//3-Mostrar resultados

		System.out.printf("\n");
		System.out.printf("Number of defitients:%d\n", d);
		System.out.printf("\n");
		System.out.printf("Number of insuficents:%d\n", in);
		System.out.printf("\n");
		System.out.printf("Number of approveds:%d\n", a);
		System.out.printf("\n");
		System.out.printf("Number of approveds high:%d\n", b);
		System.out.printf("\n");
		System.out.printf("Number of remarkable:%d\n", n);
		System.out.printf("\n");
		System.out.printf("Number of outstandings:%d\n", s);

		Keyboard.close();

	}

}
