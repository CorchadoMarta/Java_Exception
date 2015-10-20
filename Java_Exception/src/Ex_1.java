public class Ex_1 {

	public static void main(String[] args) {
		
		
		
		// 1. Codi que genera un error de tipus ArrayIndexOutOfBoundsException. 	
		// Declarem un array de 5 posicions
		int[] elmeuarray = {1, 2, 3, 4, 5};
		// 3.Capturem l'error per a que pugui continuar executanmt el programa encara que trobi un error
		try {
			//Recorrem l'array per imprimir el nombres
			for(int i = 0; i <= elmeuarray.length; i++){
				System.out.println(elmeuarray[i]);
			}
		// 4. Englobem el bloc i escribim el missatge d'error, per tant ara que ho hem atrapat en imprimira el que posem després
		} catch (ArrayIndexOutOfBoundsException e) {
			// 7. Utilitzem els metodes de les exceptions
			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
			System.out.println("Execució codi del catch");
			// 5. Creem el bloc finally, codi que sempre realitzarà, hagi error o no
		} finally {
			System.out.println("Codi de finally");
		}
		
		// 2. Fem un Syso i mirem si s'executa després de l'error (No s'executarà perque el rpograma s'atura després de l'error)
		System.out.println("Final de programa!");
		
		// 5. Fem el mateix d'abans pero sense haver error
		try {
			for(int i = 0; i < elmeuarray.length; i++){
				System.out.println(elmeuarray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Execució codi del catch");
		} finally {
			System.out.println("Codi de finally");
		}
		
		// 6. Captura un StringIndexOutOfBoundsException
		try {
			for(int i = 0; i <= elmeuarray.length; i++){
				System.out.println(elmeuarray[i]);
			}
		} catch (StringIndexOutOfBoundsException e) {
			//El catch no s'executa, perque es un tipus d'error diferent (un controla els arrays, i aquest Strings)
			//Si possesin Exception si que entraria, ja que es més general i agafaria els dos
			System.out.println("Execució codi del catch");
		} finally {
			System.out.println("Codi de finally");
		}
	}
}
