
public class Ex_4 {

	 public static void main(String[] args) {
			//cridem funcio
			Persona p = new Persona();
			try {
				p.setEdat(-5);
			} catch (IllegalArgumentException e) {
				System.out.println("La edad no puede ser negativa");
			}

		}
	
	public static class Persona {
	    private int edat;
	    
	    public void setEdat(int edat)throws IllegalArgumentException {
	    	//Controlem que no sigui negativa
	        if (edat < 0)
	        	throw new IllegalArgumentException();
	        else
	        	 this.edat = edat;
	        //Imprimim l'edat
	        System.out.println(edat);
	    }
	    
	   
	}

}
