package pe.mdtk.cetein.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import pe.mdtk.cetein.domain.Anexo;

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
	private List<Anexo> anexos = new ArrayList<Anexo>();
	private String operacion;
	private int index;

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

	public List<Anexo> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@PostConstruct
	public void reset() {
		System.out.println("Construyendo");
		Anexo anexo1 = new Anexo();
		Anexo anexo2 = new Anexo();

		anexo1.setNumero("7501145");
		anexo1.setUsuario("Alex");
		anexo1.setMac("00:15:65:00:00:01");
		anexo1.setCostoAdicional(0);

		anexo2.setNumero("7501188");
		anexo2.setUsuario("Carlos");
		anexo2.setMac("00:15:65:00:00:02");
		anexo2.setCostoAdicional(0);

		anexos.add(anexo1);
		anexos.add(anexo2);
		anexos.add(new Anexo());
		System.out.println(anexos.size());
	}

	public String irPaso1() {
		System.out.println("Reedirigiendo al paso 1");
		return "paso1";
	}

	public String irPaso2() {
		System.out.println("Reedirigiendo al paso 2");
		anexos = new ArrayList<Anexo>();
		Anexo anexo1 = new Anexo();
		Anexo anexo2 = new Anexo();
		Anexo anexo3 = new Anexo();

		anexo1.setNumero("7501145");
		anexo1.setUsuario("Alex");
		anexo1.setMac("00:15:65:00:00:01");
		anexo1.setCostoAdicional(0);
		anexo1.setOperacion("eliminar");

		anexo2.setNumero("7501188");
		anexo2.setUsuario("Carlos");
		anexo2.setMac("00:15:65:00:00:02");
		anexo2.setCostoAdicional(0);
		anexo2.setOperacion("eliminar");

		anexo3.setOperacion("agregar");

		anexos.add(anexo1);
		anexos.add(anexo2);
		anexos.add(anexo3);

		return "paso2";
	}

	public String irPaso3(){
		System.out.println("Reedirigiendo al paso 3");
		return "paso3";
	}
	
	public String irContrato(){
		System.out.println("Reedirigiendo al contrato");
		return "contrato";
	}
	
	public String irPanel(){
		System.out.println("Reedirigiendo al panel de control");
		return "panelControl";
	}
	
	public void addOrDelete() {
		System.out.println("Agregando o Eliminando");
		if (operacion.equals("agregar")) {
			anexos.get(anexos.size() - 1).setOperacion("eliminar");
			Anexo aux = new Anexo();
			aux.setOperacion("agregar");
			if (anexos.size() > 2) {
				aux.setCostoAdicional(25.0);
			}
			anexos.add(aux);
		} else {
			anexos.remove(index);
			if(anexos.size()>3){
				anexos.get(0).setCostoAdicional(0.0);
				anexos.get(1).setCostoAdicional(0.0);
				anexos.get(2).setCostoAdicional(0.0);
			}else{
				for (int i = 0; i < anexos.size(); i++) {
					anexos.get(i).setCostoAdicional(0.0);
				}
			}

		}
	}

}
