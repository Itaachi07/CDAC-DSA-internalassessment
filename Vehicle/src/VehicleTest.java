import java.util.*;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle v;
		LinkedList l1 = new LinkedList();
		v = new Vehicle(null, null, null, 0, 0, null);
		l1.addNodeAtLastPosition(v.acceptDetails(v));
		l1.displayList();
		
	}

}
