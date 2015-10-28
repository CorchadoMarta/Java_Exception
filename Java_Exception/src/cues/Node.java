package cues;

public class Node {
	
	Object value;
	Node next;
	
	
	public Node(Object value) {
		super();
		if (value == null)
			throw new AllertNulls("Error: valor null");
		this.value = value;
	}


	public Object getValue() {
		if (value == null)
			throw new AllertNulls("Error: valor null");
		return value;
	}


	public void setValue(Object value) {
		if (value == null)
			throw new AllertNulls("Error: valor null");
		this.value = value;
	}


	public Node getNext() {
		if(next == null)
			throw new AllertNulls("Error: no hi ha següent");
		return next;
	}


	public void setNext(Node next) {
		if(next == null)
			throw new AllertNulls("Error: no hi ha següent");
		this.next = next;
	}
	

}
