package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FAMILIARES")
public class Familiares implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name = "ID_FAMILIARES")
	@Id
	private int id;
	@Column(name = "FATHER_NAME")
	private String fname;
	@Column(name = "MOTHER_NAME")
	private String mname;
	@Column(name = "FATHER_LASTNAME")
	private String flname;
	@Column(name = "MOTHER_LASTNAME")
	private String mlname;
	@Column(name = "FATHER_NUMBER")
	private String fnumber;
	@Column(name = "MOTHER_NUMBER")
	private String mnumber;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PACIENTE")
	private Paciente paciente;
	
	public Familiares() {
		
	}
	
	public Familiares(int id, String fname, String mname, String flname, String mlname, String fnumber, String mnumber,
			Paciente paciente) {
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.flname = flname;
		this.mlname = mlname;
		this.fnumber = fnumber;
		this.mnumber = mnumber;
		this.paciente = paciente;
	}
	@Override
	public String toString() {
		return "Familiares [id=" + id + ", fname=" + fname + ", mname=" + mname + ", flname=" + flname + ", mlname="
				+ mlname + ", fnumber=" + fnumber + ", mnumber=" + mnumber + ", paciente=" + paciente + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getFlname() {
		return flname;
	}
	public void setFlname(String flname) {
		this.flname = flname;
	}
	public String getMlname() {
		return mlname;
	}
	public void setMlname(String mlname) {
		this.mlname = mlname;
	}
	public String getFnumber() {
		return fnumber;
	}
	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}
	public String getMnumber() {
		return mnumber;
	}
	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
