public class Main {

	public static void main(String[] args) {
		Countdown countdown = new Countdown();
		Thread hilo = new Thread(countdown);
		hilo.start();
	}
}