package es.florida.aev4;

import java.io.Serializable;

public class Contrasenya implements Serializable{
	String ContrasenyaPlana;
	String ContrasenyaEncriptada;
	
	//Método: Contrasenya
	//Descripción: creamos objeto contrasenya
	//Parametros entrada: ContrasenyaPlana y ContrasenyaEncriptada
	//Parametros salida: ninguno
	public Contrasenya (String ContrasenyaPlana, String ContrasenyaEncriptada) {
		this.ContrasenyaPlana = ContrasenyaPlana;
		this.ContrasenyaEncriptada = ContrasenyaEncriptada;
	}

	//Método: getContrasenyaPlana
	//Descripción: obtener la ContrasenyaPlana
	//Parametros entrada: ninguno
	//Parametros salida: ContrasenyaPlana
	public String getContrasenyaPlana() {
		return ContrasenyaPlana;
	}

	//Método: setContrasenyaPlana
	//Descripción: cambiar la ContrasenyaPlana
	//Parametros entrada: ContrasenyaPlana
	//Parametros salida: ninguno 
	public void setContrasenyaPlana(String contrasenyaPlana) {
		ContrasenyaPlana = contrasenyaPlana;
	}

	//Método: getContrasenyaEncriptada
	//Descripción: obtener la ContrasenyaEncriptada
	//Parametros entrada: ninguno
	//Parametros salida: ContrasenyaEncriptada
	public String getContrasenyaEncriptada() {
		return ContrasenyaEncriptada;
	}

	//Método: setContrasenyaEncriptada
	//Descripción: cambiar la contrasenyaEncriptada
	//Parametros entrada: contrasenyaEncriptada
	//Parametros salida: ninguno 
	public void setContrasenyaEncriptada(String contrasenyaEncriptada) {
		ContrasenyaEncriptada = contrasenyaEncriptada;
	}
	
}
