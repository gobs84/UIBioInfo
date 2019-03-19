package models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GARANTE")
public class Garante implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name = "ID_GARANTE")
	@Id
	private int id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "PHONE_NUMBER")
	private String phonen;
	@Column(name = "DEATH_FLAG")
	private boolean deathflag;
	@Column(name = "DEATH_DAY")
	private LocalDateTime deathday;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "TYPE")
	private String type;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PACIENTE")
	private Paciente paciente;
	@OneToMany(mappedBy = "garante", cascade = CascadeType.ALL)
	private List<Agenda> agendas = new ArrayList<>();
	
	public Garante() {
		
	}
	
	public Garante(int id, String nombre, String phonen, boolean deathflag, LocalDateTime deathday, String address,
			String type, Paciente paciente) {
		this.id = id;
		this.nombre = nombre;
		this.phonen = phonen;
		this.deathflag = deathflag;
		this.deathday = deathday;
		this.address = address;
		this.type = type;
		this.paciente = paciente;
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



	public String getPhonen() {
		return phonen;
	}



	public void setPhonen(String phonen) {
		this.phonen = phonen;
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	

	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	

	public List<Agenda> getAgendas() {
		return agendas;
	}

	@Override
	public String toString() {
		return "Garante [id=" + id + ", nombre=" + nombre + ", phonen=" + phonen + ", deathflag=" + deathflag
				+ ", deathday=" + deathday + ", address=" + address + ", type=" + type + "]";
	}
}
