package org.example.eamen;
public class CuentaAtras implements Runnable {
	int contador = 15;
	boolean bandera = true;

	//Arrana hilo
	public void run() {
		//Se detiene el hilo hasta completar ciclo
		while (bandera) {
			System.out.println(contador);
			contador--;
			try {
				//Tiempo de ejeuion entre ciclo
				Thread.sleep(1000);
				if (contador == 0) {
					bandera = false;
					System.out.println("Tiempo Fuera!");
				}
			} catch (InterruptedException e) {
			    // Restore interrupted state...
			    Thread.currentThread().interrupt();

			}
		}

	}

}