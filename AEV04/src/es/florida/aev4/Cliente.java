package es.florida.aev4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	//	Métode: main
	//	Descripció: creamos el cliente
	//	Parametres d'entrada: ningún
	//	Parametres d'eixida: ningún
	public static void main(String[] arg) throws UnknownHostException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        String host = "localhost";
        int puerto = 1234;
        System.out.println("CLIENTE >> Arranca cliente");
        Socket cliente = new Socket(host,puerto);
        ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
        Contrasenya p = (Contrasenya) inObjeto.readObject();
        System.out.println("Dime la contrasenya");
        String contrasenya_usu = sc.nextLine();
        p.setContrasenyaPlana(contrasenya_usu);
        p.setContrasenyaEncriptada(Peticion.encriptar(contrasenya_usu));
        ObjectOutputStream pMod = new ObjectOutputStream(cliente.getOutputStream());
        pMod.writeObject(p);
        System.out.println("CLIENTE >> Recibido del servidor: "+p.getContrasenyaPlana() + " - " + p.getContrasenyaEncriptada());
        inObjeto.close();
        pMod.close();
        cliente.close();
	} 

}
