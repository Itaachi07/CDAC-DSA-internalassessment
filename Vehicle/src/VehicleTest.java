import java.util.*;

public class VehicleTest {

	public static void main(String[] args) {
		
		//LinkedList <Vehicle> l1 = new LinkedList<Vehicle>();
		LinkedList l1 = new LinkedList();
		l1.addNodeAtLastPosition(20);
		l1.addNodeAtFirstPosition(10);
		l1.addNodeAtLastPosition(30);
		l1.addNodeAtLastPosition(40);
		l1.addNodeAtLastPosition(50);
		l1.displayList();
		l1.revdisplayList();
		l1.deleteNodeAtLastPosition();
		l1.displayList();
	}

}
