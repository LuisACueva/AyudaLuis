package entidades;

public enum Rol {
	DIRECTIVA("Directiva de la Federación"), MANAGER("Mánager"), ATLETA("Atleta"), COLEGIADO("Colegiado"),
	ADMIN("Administrador"), INVITADO("Invitado");

	String nombre;

	Rol(String nom) {
		this.nombre = nom;
	}

	public String getNombre() {
		return nombre;
	}

}
