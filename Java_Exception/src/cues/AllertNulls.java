package cues;

public class AllertNulls extends NullPointerException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1650207634976548705L;
	
	String msg;
	
	public AllertNulls(String string) {
		this.msg = string;
	}
	
	public String toString() {
		return "Avís en Gestió de cues: " + msg;
	}
	
}
