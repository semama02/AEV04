package es.florida.aev4;

import java.io.Serializable;

public class Contrasenya implements Serializable{
	String ContrasenyaPlana;
	String ContrasenyaEncriptada;
	
	//M�todo: Contrasenya
	//Descripci�n: creamos objeto contrasenya
	//Parametros entrada: ContrasenyaPlana y ContrasenyaEncriptada
	//Parametros salida: ninguno
	public Contrasenya (String ContrasenyaPlana, String ContrasenyaEncriptada) {
		this.ContrasenyaPlana = ContrasenyaPlana;
		this.ContrasenyaEncriptada = ContrasenyaEncriptada;
	}

	//M�todo: getContrasenyaPlana
	//Descripci�n: obtener la ContrasenyaPlana
	//Parametros entrada: ninguno
	//Parametros salida: ContrasenyaPlana
	public String getContrasenyaPlana() {
		return ContrasenyaPlana;
	}

	//M�todo: setContrasenyaPlana
	//Descripci�n: cambiar la ContrasenyaPlana
	//Parametros entrada: ContrasenyaPlana
	//Parametros salida: ninguno 
	public void setContrasenyaPlana(String contrasenyaPlana) {
		ContrasenyaPlana = contrasenyaPlana;
	}

	//M�todo: getContrasenyaEncriptada
	//Descripci�n: obtener la ContrasenyaEncriptada
	//Parametros entrada: ninguno
	//Parametros salida: ContrasenyaEncriptada
	public String getContrasenyaEncriptada() {
		return ContrasenyaEncriptada;
	}

	//M�todo: setContrasenyaEncriptada
	//Descripci�n: cambiar la contrasenyaEncriptada
	//Parametros entrada: contrasenyaEncriptada
	//Parametros salida: ninguno 
	public void setContrasenyaEncriptada(String contrasenyaEncriptada) {
		ContrasenyaEncriptada = contrasenyaEncriptada;
	}
	
}
