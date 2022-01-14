package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import utils.Utilidades;

public class Oro extends Metal {
	private long id;
	private float pureza; // % pureza
	// Ejercicio 5, parte B
	static private float maxPureza;
	static private long idMaxPureza;

	public Oro() {
		
	}
	
	public Oro(long id, float pureza) {
		super();
		this.id = id;
		this.pureza = pureza;
		if (pureza > maxPureza) {
			maxPureza = pureza;
			idMaxPureza = id;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getPureza() {
		return pureza;
	}

	public void setPureza(float pureza) {
		this.pureza = pureza;
	}

	@Override
	public String toString() {
		return "O" + id + "(" + pureza + "%)";
	}

	// Ejercicio 5, parte B
	@Override
	public float maximaPurezaAlcanzada() {
		return Oro.maxPureza;
	}

	@Override
	public float[] cotasPurezaEfectiva() {
		float[] cotas = new float[2];
		cotas[0] = (float) (pureza - 0.15);
		cotas[1] = (float) (pureza + 0.15);
		return cotas;
	}

	public static long getIdMaxPureza() {
		return idMaxPureza;
	}

	public static void setIdMaxPureza(long idMaxPureza) {
		Oro.idMaxPureza = idMaxPureza;
	}
	
	public static Oro nuevoOro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la pureza del Oro:");
		float pur = sc.nextFloat();
		LocalDate fec = Utilidades.leerFecha();
		Oro ret = new Oro();
		ret.setPureza(pur);
		ret.setFecha(fec);
		return ret;
	}

}
