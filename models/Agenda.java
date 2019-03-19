package models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "AGENDA")
public class Agenda implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name = "ID_AGENDA")
	@Id
	private int id;
	@Column(name = "FECHA")
	private LocalDateTime fecha;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_HISTORIAL")
	private HistorialClinico historia;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_GARANTE")
	private Garante garante;
	
	public Agenda() {
		
	}
	
	public Agenda(int id, LocalDateTime fecha, HistorialClinico historia, Garante garante) {
		this.id = id;
		this.fecha = fecha;
		this.historia = historia;
		this.garante = garante;
	}
	@Override
	public String toString() {
		return "Agenda [id=" + id + ", fecha=" + fecha + ", historia=" + historia + ", garante=" + garante + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public HistorialClinico getHistoria() {
		return historia;
	}
	public void setHistoria(HistorialClinico historia) {
		this.historia = historia;
	}
	public Garante getGarante() {
		return garante;
	}
	public void setGarante(Garante garante) {
		this.garante = garante;
	}
	
	
	
}
