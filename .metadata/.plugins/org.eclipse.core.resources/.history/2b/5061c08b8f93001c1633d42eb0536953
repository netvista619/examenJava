public class Countdown implements Runnable {

	int countdownStarter = 15;
	boolean bandera = true;

	@Override
	public void run() {

		while (bandera) {

			System.out.println(countdownStarter);
			countdownStarter--;
			try {
				Thread.sleep(1000);
				if (countdownStarter == 0) {
					bandera = false;
					System.out.println("Timer Over!");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

};