import java.util.Iterator;
import java.util.LinkedList;

public class Ex_5 {

	public static void main(String[] args) {
		// 1: Create a LinkedList
		LinkedList<Cotxe> llistatCotxes = new LinkedList<>();

		// 2: Add 5 cars in LinkedList
		llistatCotxes.offer(new Cotxe("Alfa Romeo", "Giulia", 1900, 6));
		llistatCotxes.offer(new Cotxe("Dacia", "Sandero", 1200, 4));
		llistatCotxes.offer(new Cotxe("Ford", "Focus", 2000, 4));
		llistatCotxes.offer(new Cotxe("Opel", "Insignia", 2200, 4));
		llistatCotxes.offer(new Cotxe("Seat", "Ibiza", 1400, 4));

		// Iterator
		Iterator<Cotxe> k = llistatCotxes.iterator();
		while (k.hasNext()) {
			System.out.println(k.next());
		}
	}

}
