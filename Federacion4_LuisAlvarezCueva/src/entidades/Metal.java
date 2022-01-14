package entidades;

import java.time.LocalDate;

//Ejercicio 5, parte A
public abstract class Metal {
	public abstract float maximaPurezaAlcanzada();
	public abstract float[] cotasPurezaEfectiva();
	private LocalDate fecha;
	private boolean asignada = false;
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public boolean isAsignada() {
		return asignada;
	}
	public void setAsignada(boolean asignada) {
		this.asignada = asignada;
	} 
	
	
}
