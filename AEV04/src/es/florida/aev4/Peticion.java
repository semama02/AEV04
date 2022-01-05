package es.florida.aev4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Peticion implements Runnable{

	Socket socket;
	
	public Peticion(Socket socket) {
		this.socket = socket;
	}
	
	//Método: encriptar
	//Descripción: encriptmos la contrasenyaplana
	//Parametros entrada: contrasenya
	//Parametros salida: a
	public static String encriptar(String contrasenya) {
		String a = "";
		try { 
			String text = contrasenya; 
			byte[] bytes = text.getBytes("ASCII"); 
			for (int i = 0; i <bytes.length; i++) {
				int ascii = (1+bytes[i]);
				if (ascii >= 0 || ascii <= 31 || ascii == 127) {
					a += Integer.toString(ascii);
				}else {
					a+="*";
				}
			}
			} catch (java.io.UnsupportedEncodingException e) { 
				e.printStackTrace(); 
			}
		return a;
	}
	
	//Método: run
	//Descripción: Hacemos las operaciones necesarias del servidor
	//Parametros entrada: ninguno
	//Parametros salida: ninguno
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.err.println("SERVIDOR >> Escuchando...");
		ObjectOutputStream outObjeto = null;
		try {
			outObjeto = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Contrasenya p = new Contrasenya("a","a");
		try {
			outObjeto.writeObject(p);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ObjectInputStream inObjeto = null;
		try {
			inObjeto = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Contrasenya pMod = (Contrasenya) inObjeto.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
