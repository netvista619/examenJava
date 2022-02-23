package org.example.eamen;

import java.net.*;
import java.io.*;

public class Cliente {
	public static void main(String[] args) {
		//Se crea socket
		Socket cliente;
		DataOutputStream salidaCliente;
		try {
			//Se asigna direccion y puerto
			cliente = new Socket("localhost", 6800);
			salidaCliente = new DataOutputStream(cliente.getOutputStream());
			//Mensaje
			salidaCliente.writeUTF("Hola Mundo Socket");
		} catch (IOException ex) {
			System.out.println("Falla de conexion");
		}
	}
}