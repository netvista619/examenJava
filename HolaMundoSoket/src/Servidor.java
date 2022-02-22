import java.net.*;
import java.io.*;

public class Servidor {
	public static void main(String[] args) {
		ServerSocket servidor;
		Socket cliente;
		DataInputStream entradaServer;
		try {
			servidor = new ServerSocket(6800);
			System.out.println("Servidor ON");
			cliente = servidor.accept();
			entradaServer = new DataInputStream(cliente.getInputStream());
			System.out.println("El cliente dice: " + entradaServer.readUTF());
		} catch (IOException ex) {
			System.out.println("Falla de conexion");
		}
	}
}