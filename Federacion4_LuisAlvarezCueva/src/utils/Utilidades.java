package utils;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Object;

/**
 *
 * @author luis
 */
public class Utilidades {

	/**
	 * Función que pide al usuario que introduzca 's' o 'S' para Sí o 'n' o 'N' para
	 * No y devuelve true o false en cada caso. Si el usuario no introduce ni 's' ni
	 * 'S' ni 'n' ni 'N' entonces avisa al usuario y le vuelve a pedir a que lo
	 * introduzca de nuevo.
	 *
	 * @return true si el usuario introduce 's' o 'S'; false si el usuario introduce
	 *         'n' o 'N'
	 */
	public static boolean leerBoolean() {
		boolean ret;
		Scanner in;
		char resp;
		do {
			System.out.println("Pulse s para Sí o n para No");
			in = new Scanner(System.in, "ISO-8859-1");
			resp = in.nextLine().charAt(0);
			if (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N') {
				System.out.println("Valor introducido incorrecto.");
			}
		} while (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N');
		if (resp == 's' || resp != 'S') {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	/**
	 * Función que pide al usuario que introduzca un valor decimal por la entrada
	 * estándar. Si el formato introducido no es correcto, avisa al usuario y le
	 * vuelve a pedir que lo introduzca de nuevo.
	 *
	 * @return el valor double introducido por el usuario
	 */
	public static double leerDouble() {
		double ret = 0.0;
		boolean correcto = false;
		Scanner in;
		do {
			System.out.println("Introduzca un valor decimal (xx.xx)");
			in = new Scanner(System.in, "ISO-8859-1");
			try {
				ret = in.nextDouble();
				correcto = true;
			} catch (InputMismatchException ime) {
				System.out.println("Formato introducido incorrecto.");
				correcto = false;
			}
		} while (!correcto);
		return ret;
	}

	/**
	 * Función que pide al usuario que introduce un valor para una fecha a partir de
	 * 3 enteros para el día, mes y año respectivamente. Si los valores introducidos
	 * no producen una fecha correcta, avisa al usuario y le pide que los introduzca
	 * de nuevo. Si no lo consigue, devolverá null
	 *
	 * @return una fecha de la clase java.time.LocalDate o null si hay error
	 */
	public static java.time.LocalDate leerFecha() {
		LocalDate ret = null;
		int dia, mes, anio;
		boolean correcto = false;
		Scanner in;
		do {
			System.out.println("Introduzca un valor para el día (1...31)");
			in = new Scanner(System.in, "ISO-8859-1");
			dia = in.nextInt();
			System.out.println("Introduzca un valor para el mes (1...12)");
			in = new Scanner(System.in, "ISO-8859-1");
			mes = in.nextInt();
			System.out.println("Introduzca un valor para el año");
			in = new Scanner(System.in, "ISO-8859-1");
			anio = in.nextInt();

			try {
				ret = LocalDate.of(anio, mes, dia);
				correcto = true;
			} catch (Exception e) {
				System.out.println("Fecha introducida incorrecta.");
				correcto = false;
			}
		} while (!correcto);
		return ret;
	}

	public static String removeDiacriticalMarks(String string) {
		// Form.NFC acepta ñ y distingue las tildes en español
		return Normalizer.normalize(string, Form.NFC).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	}

	public static LocalDateTime leerFechaHora() {
		Scanner sc = new Scanner(System.in);
		int anno = 0;
		int mes = 0;
		int dia = 0;
		int hora = 0;
		int min = 0;
		int seg = 0;

		System.out.println("Introduza el anno");
		anno = sc.nextInt();

		boolean validM = false;
		do {
			System.out.println("Introduza el mes [1 - 12].");
			mes = sc.nextInt();

			if (mes > 0 && mes < 13) {
				validM = true;
			} else {
				System.out.println("Ha introducido un valor invalido.");
			}

		} while (!validM);

		boolean validD = false;

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			boolean validIm = false;
			do {
				System.out.println("Introduzca el dia [1 - 31].");
				dia = sc.nextInt();

				if (dia > 0 && dia < 32) {
					validIm = true;
				} else {
					System.out.println("Ha introducido un valor invalido.");
				}
			} while (!validIm);
			break;
		case 2:
			GregorianCalendar ca = new GregorianCalendar();
			if(ca.isLeapYear(anno)) {
				boolean validF = false;
				do {
					System.out.println("Introduzca el dia [1 - 29].");
					dia = sc.nextInt();

					if (dia > 0 && dia < 30) {
						validF = true;
					} else {
						System.out.println("Ha introducido un valor invalido.");
					}
				} while (!validF);
			}else {
				boolean validFn = false;
				do {
					System.out.println("Introduzca el dia [1 - 28].");
					dia = sc.nextInt();

					if (dia > 0 && dia < 29) {
						validFn = true;
					} else {
						System.out.println("Ha introducido un valor invalido.");
					}
				} while (!validFn);
			}
			break;
		case 4, 6, 9, 11:
			boolean validPa = false;
			do {
				System.out.println("Introduzca el dia [1 - 30].");
				dia = sc.nextInt();

				if (dia > 0 && dia < 31) {
					validPa = true;
				} else {
					System.out.println("Ha introducido un valor invalido.");
				}
			} while (!validPa);
			break;
		}
		
		boolean validH = false;
		do {
			System.out.println("Introduza la hora [0 - 23].");
			hora = sc.nextInt();

			if (hora > -1 && hora < 24) {
				validH = true;
			} else {
				System.out.println("Ha introducido un valor invalido.");
			}

		} while (!validH);
		
		boolean validMin = false;
		do {
			System.out.println("Introduza los minutos [0 - 59].");
			min = sc.nextInt();

			if (min > -1 && min < 60) {
				validMin = true;
			} else {
				System.out.println("Ha introducido un valor invalido.");
			}

		} while (!validMin);
		
		boolean validSeg = false;
		do {
			System.out.println("Introduza los segundos [0 - 59].");
			seg = sc.nextInt();

			if (seg > -1 && seg < 60) {
				validSeg = true;
			} else {
				System.out.println("Ha introducido un valor invalido.");
			}

		} while (!validSeg);

		return LocalDateTime.of(anno, mes, dia, hora, min, seg);
	}
	
	public static String quitarEspaciosTildes(String s) {
		String ret = removeDiacriticalMarks(s.trim());
		return ret;
	}
}
