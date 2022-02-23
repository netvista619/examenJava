package org.example.eamen;
public class NumVerificado {
	public static void main(String[] args) {
		String num = "19217";
		int[] cadena = new int[num.length()];
		int sumaValores = 0;
		for (int n = 0; n < num.length(); n++) {
			//Secuenia de pasos 1 - 5
			if ((n + 1) % 2 == 0) {
				cadena[n] = Integer.parseInt(num.charAt(n) + "");
			} else {
				cadena[n] = Integer.parseInt(num.charAt(n) + "") * 2;
			}
			if (cadena[n] >= 10) {
				String rer = cadena[n] + "";
				cadena[n] = Integer.parseInt(rer.charAt(0) + "") + Integer.parseInt(rer.charAt(1) + "");
			}
		}
		for (int i = 0; i < cadena.length; i++) {
			sumaValores = sumaValores + cadena[i];
		}
		//Verifiando Resultados
		if (sumaValores % 10 == 0) {
			System.out.println("El numero verificador es: " + 0);
		} else {
			System.out.println("El residuo es: " + (sumaValores % 10));
			System.out.println("El numero verificador es: " + (10 - (sumaValores % 10)));
		}
	}
}