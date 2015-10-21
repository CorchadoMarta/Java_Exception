public class Ex_1 {

	public static void main(String[] args) {
		/*
		// 1. Codi que genera un error de tipus ArrayIndexOutOfBoundsException. 	
		// Declarem un array de 5 posicions
		int[] elMeuArray = {1, 2, 3, 4, 5};
		// 3.Capturem l'error per a que pugui continuar executanmt el programa encara que trobi un error
		try {
			//Recorrem l'array per imprimir el nombres
			for(int i = 0; i <= elMeuArray.length; i++){
				System.out.println(elMeuArray[i]);
			}
		// 4. Englobem el bloc i escribim el missatge d'error, per tant ara que ho hem atrapat en imprimira el que posem després
		} catch (ArrayIndexOutOfBoundsException e) {
			// 7. Utilitzem els metodes de les exceptions
			System.out.println("Prova del get Message: " + e.getMessage());
			System.out.println("Prova get Cause: "  + e.getCause());
			System.out.println("Prova Localized message: " + e.getLocalizedMessage());
			System.out.println("Prova Suppressed: " + e.getSuppressed());
			System.out.println("Prova del print stack trace: ");
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
			for(int i = 0; i < elMeuArray.length; i++){
				System.out.println(elMeuArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Execució codi del catch");
		} finally {
			System.out.println("Codi de finally");
		}
		
		// 6. Captura un StringIndexOutOfBoundsException
		try {
			for(int i = 0; i <= elMeuArray.length; i++){
				System.out.println(elMeuArray[i]);
			}
		} catch (StringIndexOutOfBoundsException e) {
			//El catch no s'executa, perque es un tipus d'error diferent (un controla els arrays, i aquest Strings)
			//Si possesin Exception si que entraria, ja que es més general i agafaria els dos
			System.out.println("Execució codi del catch");
		} finally {
			System.out.println("Codi de finally");
		}
		
		*/
		// Cridem a f1
//		
		//8. Fem try and catch al main
//		try {
		f1();
//		} catch (Exception e) {
//			System.out.println("Estem al main");
	//	}
	}
	// 9. funcions enniguades
	public static void f1() {
		System.out.println("Estem en la funció 1, i cridarem a la funció 2");
		try {
			f2();
		} catch (Exception e) {
			System.out.println("Atrapen l'error a f1");
		}
		System.out.println("Sortim de la funció 1");
	}
	public static void f2() {
		System.out.println("Estem a la funció 2, i cridarem a la funció 3");
		try {
			f3();
		} catch (Exception e) {
			System.out.println("Atrapem l'error a f2");
		}
		System.out.println("Sortim de la funció 2");
	}
	public static void f3() {
		System.out.println("Estem a la funció 3, i generem la excepció");
		try {
			// Creem l'array
			int[] elMeuArray2 = {1, 2, 3, 4, 5};
			// El recorrem
			for(int i = 0; i <= elMeuArray2.length; i++){
				System.out.println(elMeuArray2[i]);
			}
		} catch (Exception e) {
			System.out.println("Atrapen l'error a f3");
		}
		System.out.println("Sortim de la funció 3");
	}
}
