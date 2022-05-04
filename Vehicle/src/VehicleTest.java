import java.util.*;

public class VehicleTest {
	public static int menu( ){
        //display menu list
        System.out.println("*********************************");
        System.out.println("0. exit");
        System.out.println("1. Add Vehicle at last position");
        System.out.println("2. Add Vehicle at first position");
        System.out.println("3. Delete Vehicle From Last position");
        System.out.println("4. Delete Vehicle From First position"); 
        System.out.println("5. Search Vehicle by No.");
        System.out.println("6. Display Vehicle List");
        System.out.println("7. Display list in a reverse order");
        System.out.println("8.Sort Vehicle List By Price");

        System.out.print("enter the choice : ");
        //accept choice from user
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        //return choice to the calling function
        return choice;
    }
	public static void main(String[] args) {
		
		Vehicle v=null;
		LinkedList l1 = new LinkedList();
		
		while(true)
		{
			int choice = menu();
			switch(choice)
			{
			case 0:
				System.exit(0);
				
			case 1:
			{
				l1.addNodeAtLastPosition(v);
			}break;
			
			case 2:
			{
				l1.addNodeAtFirstPosition(v);
			}break;
			
			case 3:
			{
				l1.deleteNodeAtLastPosition();
			}break;
			
			case 4:
			{
				l1.deletNodeAtFirstPosition();
			}break;
			
			case 5:
			{
				
			}break;
			
			case 6:
			{
				l1.displayList();
			}break;
			
			case 7:
			{
				l1.revdisplayList();
			}break;
			
			case 8:
			{
				
			}break;
			
			
			}
		}
		
	}

}
