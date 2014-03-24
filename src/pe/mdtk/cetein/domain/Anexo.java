package pe.mdtk.cetein.domain;

import java.io.Serializable;

public class Anexo implements Serializable{

	private String numero;
	private String usuario;
	private String mac;
	private double costoAdicional;
	private String operacion;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public double getCostoAdicional() {
		return costoAdicional;
	}
	public void setCostoAdicional(double costoAdicional) {
		this.costoAdicional = costoAdicional;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
	
	
}
