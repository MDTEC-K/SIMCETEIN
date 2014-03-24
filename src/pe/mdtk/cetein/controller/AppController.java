package pe.mdtk.cetein.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AppController implements Serializable {

	private String username;
	private String password;
	private String empresa;
	private String mensajeBienvenida;
	private String numero;
	private double precio;
	private double total;
	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}



	public String getMensajeBienvenida() {
		return mensajeBienvenida;
	}



	public void setMensajeBienvenida(String mensajeBienvenida) {
		this.mensajeBienvenida = mensajeBienvenida;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public String irPaso1(){
		System.out.println("Reedirigiendo al paso 1");
		return "WEB-INF/user/paso1";
	}
	
	public String irPaso2(){
		System.out.println("Reedirigiendo al paso 2");
		return "WEB-INF/user/paso2";
	}
	
}
