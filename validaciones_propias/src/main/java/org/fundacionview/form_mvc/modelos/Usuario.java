package org.fundacionview.form_mvc.modelos;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.fundacionview.form_mvc.validaciones.CompararFechas;
import org.fundacionview.form_mvc.validaciones.ComprobarEmail;
import org.fundacionview.form_mvc.validaciones.FechaPasado;
import org.fundacionview.form_mvc.validaciones.IndicativoCol;
import org.springframework.stereotype.Component;

@Component
@ComprobarEmail(groups = {InformacionBasica.class})
@CompararFechas(groups = {InformacionBasica.class})
public class Usuario {

	// Informacion Basica
	@Size(min = 1,max=100,message = "Campo Requerido",groups = {InformacionBasica.class})
	private String nombre;
	
	@Size(min = 3,max=100,message = "Campo Requerido",groups = {InformacionBasica.class})
	private String apellidos;
	
	@Min(value = 18,message = "Solo mayores de edad",groups = {InformacionBasica.class})
	private int edad;
	
	// Cr 54 # 31-44
	// (Cr Cl) dig {1,3} #  dig {1,3} - dig {1,3} 
	@Pattern(regexp = "^((Cr)|(Cl)) (\\d{1,3}) # (\\d{1,3})-(\\d{1,3})",message = "Formato:  Cr 44 # 76-12",groups = {InformacionBasica.class})
	private String direccion;
	
	// Indicativo de colombia en constraint propio
	@IndicativoCol(groups = {InformacionBasica.class})
	private String telefono;
	
	// Validar fecha en pasado
	@FechaPasado(groups = {InformacionBasica.class})
	private Date fechaN;	
	
	private String email;
	
	private String comprobaremail;
	
	
	
	
	
	// Informacion Login
	@NotNull(groups = {InformacionLogin.class})
	private String username;
	
	@NotNull(groups = {InformacionLogin.class})
	private String clave;
	
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComprobaremail() {
		return comprobaremail;
	}

	public void setComprobaremail(String comprobaremail) {
		this.comprobaremail = comprobaremail;
	}

	public Usuario() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechaN() {
		return fechaN;
	}
	public void setFechaN(Date fechaN) {
		this.fechaN = fechaN;
	}
	
	
	
	
	
}
