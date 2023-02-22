package contraseñas;

public class Usuarios {
	
	    private String usuarios;
	private String passwordMD5;
	private Integer anioNacimiento;
	
	public Usuarios(String usuarios, String passwordMD5) {
		
	this.usuarios = usuarios;
	this.passwordMD5 = passwordMD5;
	}
	public String getUsuario() {
	return usuarios;
	}
	public void setUsuario(String usuario) {
	this.usuarios = usuario;
	}
	public String getPasswordMD5() {
	return passwordMD5;
	}
	public void setPasswordMD5(String passwordMD5) {
	this.passwordMD5 = passwordMD5;
	}
	public Integer getAnioNacimiento() {
	return anioNacimiento;
	}
	public void setAnioNacimiento(Integer anioNacimiento) {
	this.anioNacimiento = anioNacimiento;
	}
	// edad es un atributo derivado, tiene getter pero no setter
	public Integer getEdad() {
	return 2023 - anioNacimiento;
	}
	}