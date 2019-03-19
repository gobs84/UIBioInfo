package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONAL")
public class Personal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name = "ID_PERSONAL")
	@Id
	private int id;
	@Column(name = "TIPO")
	private String tipo;
	@Column(name = "ESPECIALIDAD")
	private String especialidad;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDO_P")
	private String apellidop;
	@Column(name = "APELLIDO_M")
	private String apellidom;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "GENERO")
	private String genero;
	@Column(name = "INTERNAL_ID")
	private int internalid;
	
	@OneToMany(mappedBy = "personal", cascade = CascadeType.ALL)
	private List<HistorialClinico> historia = new ArrayList<>();
	
	public Personal() {
		
	}
	
	public Personal(int id, String tipo, String especialidad, String nombre, String apellidop, String apellidom,
			String phone, String address, String genero, int internalid) {
		this.id = id;
		this.tipo = tipo;
		this.especialidad = especialidad;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.phone = phone;
		this.address = address;
		this.genero = genero;
		this.internalid = internalid;
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidop() {
		return apellidop;
	}



	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}



	public String getApellidom() {
		return apellidom;
	}



	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public int getInternalid() {
		return internalid;
	}



	public void setInternalid(int internalid) {
		this.internalid = internalid;
	}



	public List<HistorialClinico> getHistoria() {
		return historia;
	}

	@Override
	public String toString() {
		return "Personal [id=" + id + ", tipo=" + tipo + ", especialidad=" + especialidad + ", nombre=" + nombre
				+ ", apellidop=" + apellidop + ", apellidom=" + apellidom + ", phone=" + phone + ", address=" + address
				+ ", genero=" + genero + ", internalid=" + internalid + "]";
	}
	
	
}
