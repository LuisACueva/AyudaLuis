package entidades;

import java.util.Scanner;

import utils.Datos;

public class Colegiado {
	private long id;
	private Categoria categoria;

	private DatosPersona persona;

	public Colegiado(long id, Categoria categoria) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.persona = Datos.buscarPersonaPorId(id);
	}

	public Colegiado(long id, Categoria categoria, DatosPersona dp) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.persona = dp;
	}
	
	public Colegiado(Categoria categoria) {
		super();
		this.categoria = categoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getPersona() {
		return this.persona.toString();
	}

	public static Colegiado nuevoColegiado() {
		Colegiado ret = null;
		long id = -1;
		Categoria cat = null;
		DatosPersona dp = null;
		Scanner in;
		System.out.println("Introduzca el id del nuevo colegiado:");
		in = new Scanner(System.in);
		id = in.nextInt();

		boolean valid = false;
		do {
			System.out.println("Introduzca la categoria del nuevo colegiado:");
			in = new Scanner(System.in);
			System.out.println("0: Junior.");
			System.out.println("1: Senior.");
			System.out.println("2: Especial");

			switch (in.nextInt()) {
			case 0:
				cat = Categoria.JUNIOR;
				valid = true;
				break;
			case 1:
				cat = Categoria.SENIOR;
				valid = true;
				break;
			case 2:
				cat = Categoria.ESPECIAL;
				valid = true;
				break;
			default:
				System.out.println("Ha introducido un valor invalido.");
				break;
			}
		} while (!valid);

		System.out.println("Introduzca ahora los datos personales:");
		in = new Scanner(System.in);
		dp = DatosPersona.nuevaPersona();

		ret = new Colegiado(id, cat, dp);
		return ret;
	}

}
