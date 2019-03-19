package models;

import java.io.Serializable;
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
@Table(name = "HISTORIAL_CLINICO")
public class HistorialClinico implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name = "ID_HISTORIAL")
	@Id
	private int id;
	@Column(name = "DIAGNOSTICO")
	private String diagnostico;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PACIENTE")
	private Paciente paciente;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERSONAL")
	private Personal personal;
	@OneToMany(mappedBy = "historia", cascade = CascadeType.ALL)
	private List<Agenda> agendas = new ArrayList<>();
	@Override
	public String toString() {
		return "HistorialClinico [id=" + id + ", diagnostico=" + diagnostico + ", paciente="
				+ paciente + ", personal=" + personal + "]";
	}
	public HistorialClinico(int id, String diagnostico, Paciente paciente, Personal personal) {
		this.id = id;
		this.diagnostico = diagnostico;
		this.paciente = paciente;
		this.personal = personal;
	}
	
	public HistorialClinico() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public Personal getPersonal() {
		return personal;
	}
	public List<Agenda> getAgendas() {
		return agendas;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	
	
	
}
