
public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(divisio(0, 2));
		} catch (ArithmeticException e) {
			System.out.println("La divisio per 0 es errònia");
		} catch (SecurityException e) {
			System.out.println("Patata!");
			e.printStackTrace();
		}

	}

	// public static double divisio throws double ArithmeticException (int
	// divident, int divisor) {

	private static double divisio(int i, int j) throws ArithmeticException  {
		if (j == 0)
			throw new ArithmeticException();
		if (i == 0)
			throw new SecurityException("MUEEEERTE");
		
		return i/j;
	}

}
