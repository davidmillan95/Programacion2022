package repasoExamen;

public class Examen {
	final String nombre = "David";
	final String apellido = "Millán";
	final String dni = "72993992L";
	final String mail = "7845dmillan@e-itaca.es";
	
	public static boolean generaClave(String a) {
		String letras = "TWRAGZYFPDXBNJMSQVHLCKE";
		int numeros;
		char letra;
		int modulo23;
		numeros=Integer.parseInt(a.substring(0,8));
		letra = a.charAt(a.length()-1);
		modulo23 = numeros%23;
		if (letra==letras.charAt(modulo23)) {
			return true;	
		}else {
			return false;
		}
	}
	
	public static int [] cuentaVocales (String a) {
		int [] vocales = new int[5];
		int letrasA=0;
		int letrasE=0;
		int letrasI=0;
		int letrasO=0;
		int letrasU=0;
		
		for (int i=0;i<a.length();i++) {
			switch (a.charAt(i)) {
				case 'a':
					letrasA++;
					break;
				case 'e':
					letrasE++;
					break;
				case 'i':
					letrasI++;
					break;
				case 'o':
					letrasO++;
					break;
				case 'u':
					letrasU++;
					break;
			}
		}
		vocales[0]=letrasA;
		vocales[1]=letrasE;
		vocales[2]=letrasI;
		vocales[3]=letrasO;
		vocales[4]=letrasU;
		
		return vocales;
	}
	
}
