import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_2 {

	public static void main(String[] args) {
		// 3. Crida de la funcio
		try {
			funcio();
			// Atrapen un tipus d'excepcio
		} catch (SecurityException e) {
			System.out.println("Error de seguretat, Es de tipus RunTimeInexception");
			// Atrapen un tipus d'excepcio
		} catch (FileNotFoundException e) {
			System.out.println("Aquest arxiu no existeix");
		}
		// cridem a delegacio
		try {
			delegacio();
		} catch (IOException e) {
			if(e.getClass().getName() == "java.io.FileNotFoundException"){
				System.out.println("Error fitxer no existeix");
			}
			System.out.println("Error de fitxer");
		}
	}

	public static void funcio() throws SecurityException, FileNotFoundException {
		// 1. Creem el fitxer
		FileOutputStream f = new FileOutputStream("/docs/test.txt");
		// Perque no ens adverteix del SecurityException? Perque és un
		// runTimeException
	}

	// 2. Funcio que obre i tanca un arxiu
	public static void delegacio() throws IOException {
		// 1. Creem el fitxer
		FileOutputStream f = new FileOutputStream("/docs/test.txt");
		f.close();

	}
}
