import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex_2 {

	public static void main(String[] args) {
		try {
			funcio();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void funcio() throws SecurityException, FileNotFoundException{
		// 1. Creem el fitxer
		FileOutputStream f = new FileOutputStream("/docs/test.txt");
		//Perque no ens adverteix del SecurityException? Perque és un runTimeException
	}

}
