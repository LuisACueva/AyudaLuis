package entidades;

import java.time.LocalDate;
import java.util.Scanner;

import utils.Utilidades;

public class Plata extends Metal{
	private long id;
	private float pureza; //% pureza
	
	//Ejercicio 5, parte B
	static private float maxPureza;
	static private long idmaxpureza; 
	
	public Plata() {
		
	}
	
	public Plata(long id, float pureza) {
		super();
		this.id = id;
		this.pureza = pureza;
		if(pureza > maxPureza) { 
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
		return "P" + id + "(" + pureza + "%)";
	}

	//Ejercicio 5, parte B
	@Override
	public float maximaPurezaAlcanzada() {
		return Plata.maxPureza;
	}

	@Override
	public float[] cotasPurezaEfectiva() {
		float[] cotas = new float[2];
		cotas[0] = (float) (pureza - 0.25);
		cotas[1] = (float) (pureza + 0.25);
		return cotas;
	}

	public static long getIdMaxPureza() {
		return idmaxpureza;
	}
	
	public static Plata nuevoPlata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la pureza de la Plata:");
		float pur = sc.nextFloat();
		LocalDate fec = Utilidades.leerFecha();
		Plata ret = new Plata();
		ret.setPureza(pur);
		ret.setFecha(fec);
		return ret;
	}
}
