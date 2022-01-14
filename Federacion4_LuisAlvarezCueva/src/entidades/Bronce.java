package entidades;

import java.time.LocalDate;
import java.util.Scanner;

import utils.Utilidades;

public class Bronce extends Metal {
	private long id;
	private float pureza; // % pureza
	
	//Ejercicio 5, parte B
	private static float maxPureza;
	static private long idmaxpureza;

	public Bronce() {
		
	}
	
	public Bronce(long id, float pureza) {
		super();
		this.id = id;
		this.pureza = pureza;
		if (pureza > maxPureza) {
			maxPureza = pureza;
			idmaxpureza = id;
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

	//Ejercicio 5, parte B
	@Override
	public float maximaPurezaAlcanzada() {
		return Bronce.maxPureza;
	}

	@Override
	public float[] cotasPurezaEfectiva() {
		float[] cotas = new float[2];
		cotas[0] = (float) (pureza - 0.35);
		cotas[1] = (float) (pureza + 0.35);
		return cotas;
	}

	public static long getIdMaxPureza() {
		return idmaxpureza;
	}
	
	public static Bronce nuevoBronce() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la pureza del Bronce:");
		float pur = sc.nextFloat();
		LocalDate fec = Utilidades.leerFecha();
		Bronce ret = new Bronce();
		ret.setPureza(pur);
		ret.setFecha(fec);
		return ret;
	}
}
