package primeroo;
// Generated 22/01/2019 19:34:05 by Hibernate Tools 5.1.10.Final

import java.util.Date;

/**
 * Emple generated by hbm2java
 */

public class Emple implements java.io.Serializable {

	private int empNo;
	private Depart depart;
	private String apellido;
	private String oficio;
	private Integer dir;
	private Date fechaAlt;
	private Integer salario;
	private Integer comision;

	public Emple() {
	}

	public Emple(int empNo, String apellido) {
		this.empNo = empNo;
		this.apellido = apellido;
	}

	public Emple(int empNo, Depart depart, String apellido, String oficio, Integer dir, Date fechaAlt, Integer salario,
			Integer comision) {
		this.empNo = empNo;
		this.depart = depart;
		this.apellido = apellido;
		this.oficio = oficio;
		this.dir = dir;
		this.fechaAlt = fechaAlt;
		this.salario = salario;
		this.comision = comision;
	}

	public int getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public Depart getDepart() {
		return this.depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOficio() {
		return this.oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Integer getDir() {
		return this.dir;
	}

	public void setDir(Integer dir) {
		this.dir = dir;
	}

	public Date getFechaAlt() {
		return this.fechaAlt;
	}

	public void setFechaAlt(Date fechaAlt) {
		this.fechaAlt = fechaAlt;
	}

	public Integer getSalario() {
		return this.salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Integer getComision() {
		return this.comision;
	}

	public void setComision(Integer comision) {
		this.comision = comision;
	}
}
