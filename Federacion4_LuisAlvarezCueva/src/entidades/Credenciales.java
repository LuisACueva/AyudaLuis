package entidades;

public class Credenciales {
	private String usuario;
	private String contrasenna;
	
	public Credenciales() {
		
	}
	
	public Credenciales(String usu, String pas) {
		this.usuario = usu;
		this.contrasenna = pas;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenna() {
		return contrasenna;
	}
	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}
	
	
}
