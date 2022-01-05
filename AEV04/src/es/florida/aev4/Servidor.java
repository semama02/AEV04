package es.florida.aev4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	//	Métode: main
	//	Descripció: Creamos el servidor
	//	Parametres d'entrada: ningún
	//	Parametres d'eixida: ningún
	public static void main(String[] arg) throws IOException, ClassNotFoundException {
		int numeroPuerto = 1234;
		ServerSocket socketEscucha = null;
		try {
			socketEscucha = new ServerSocket(numeroPuerto);
			} catch (IOException e) {
			System.err.println("SERVIDOR >>> Error");
			return;
			}
			while (true) {
			Socket conexion = socketEscucha.accept();
			System.err.println("SERVIDOR >>> Conexion recibida --> Lanza hilo clase Peticion");
			Peticion p = new Peticion(conexion);
			Thread hilo = new Thread(p);
			hilo.start();
		}
	} 
}
