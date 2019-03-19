package models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTE")
public class Paciente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name = "ID_PACIENTE")
	@Id
	private int id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDO_P")
	private String apellidop;
	@Column(name = "APELLIDO_M")
	private String apellidom;
	@Column(name = "GENERO")
	private String genero;
	@Column(name = "DATE_BIRTH")
	private LocalDate dateBirth;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "PHONE_NUMBER")
	private String phonenumber;
	@Column(name = "NATHINALITY")
	private String nathionality;
	@Column(name = "INTERNAL_ID")
	private int internalid;
	@Column(name = "ASEGURADORA")
	private String aseguradora;
	@Column(name = "ALERGIA")
	private String alergia;
	@Column(name = "DEATH_FLAG")
	private boolean deathflag;
	@Column(name = "DEATH_DAY")
	private LocalDateTime deathday;
	
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
	private List<Familiares> familiares = new ArrayList<>();
	
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
	private List<HistorialClinico> historia = new ArrayList<>();
	
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
	private List<Garante> garantes = new ArrayList<>();
	
	public List<Familiares> getFamiliares() {
		return familiares;
	}
	public Paciente() {
		
	}
	
	public Paciente(int id, String nombre, String apellidop, String apellidom, String genero, LocalDate dateBirth,
			String adderess, String phonenumber, String nathionality, int internalid, String aseguradora,
			String alergia, boolean deathflag, LocalDateTime deathday) {
		this.id = id;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.genero = genero;
		this.dateBirth = dateBirth;
		this.address = adderess;
		this.phonenumber = phonenumber;
		this.nathionality = nathionality;
		this.internalid = internalid;
		this.aseguradora = aseguradora;
		this.alergia = alergia;
		this.deathflag = deathflag;
		this.deathday = deathday;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public LocalDate getDateBirth() {
		return dateBirth;
	}


	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String adderess) {
		this.address = adderess;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getNathionality() {
		return nathionality;
	}


	public void setNathionality(String nathionality) {
		this.nathionality = nathionality;
	}


	public int getInternalid() {
		return internalid;
	}


	public void setInternalid(int internalid) {
		this.internalid = internalid;
	}


	public String getAseguradora() {
		return aseguradora;
	}


	public void setAseguradora(String aseguradora) {
		this.aseguradora = aseguradora;
	}


	public String getAlergia() {
		return alergia;
	}


	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}


	public boolean isDeathflag() {
		return deathflag;
	}


	public void setDeathflag(boolean deathflag) {
		this.deathflag = deathflag;
	}


	public LocalDateTime getDeathday() {
		return deathday;
	}


	public void setDeathday(LocalDateTime deathday) {
		this.deathday = deathday;
	}


	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", apellidop=" + apellidop + ", apellidom=" + apellidom
				+ ", genero=" + genero + ", dateBirth=" + dateBirth + ", address=" + address + ", phonenumber="
				+ phonenumber + ", nathionality=" + nathionality + ", internalid=" + internalid + ", aseguradora="
				+ aseguradora + ", alergia=" + alergia + ", deathflag=" + deathflag + ", deathday=" + deathday + "]";
	}
	
}
