
public class Palindromo {

	public static void main(String[] args) {
		String palabra = "Luz azul";
		//Filtros
		String limpiarPalabra = palabra.toLowerCase().replace(" ", "").replace(",", "").replace(".", " ");
		//Invertir Texxto
		String textoInvertido = new StringBuilder(limpiarPalabra).reverse().toString();
		if (textoInvertido.equals(limpiarPalabra)) {
			System.out.println("El texto " + palabra + " ES un PALINDROMO");
		} else {
			System.out.println("El texto " + palabra + " NO es un PALINDROMO");

		}

	}

}
