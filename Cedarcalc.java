import java.util.Scanner;

public class Cedarcalc{

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	int people, chaperones, admission, allowance, admissiontw;
	double admission2, totad, bus, bus2, bus3, total;

    // Ask for kids, and calculate chaperones needed
	System.out.println("How many kids will be attending: ");
	people = keyboard.nextInt();
	chaperones = people/4;
	admission = chaperones + people;
	admissiontw = admission/15;
	admission = admission - admissiontw;

    // Deciding when trip will occur
	System.out.println("When will this trip occur(type 1 for spring and 2 for fall): ");
	admission2 = keyboard.nextInt();
	if (admission2 == 1){
	    admission2 = 39.00;
		   }
    if (admission2 == 2){
		admission2 = 42.00;
		   }
     totad = admission * admission2;

    //Deciding which bus to take
    System.out.println("What bus will you take(type 1 for school and 2 for charter): ");
		bus = keyboard.nextInt();
    // Caluclating allowance
    allowance = admission * 25;

    // Dsiplaying information
    System.out.printf("%50s", "You need this many chaperones: ");
    System.out.printf("%24s\n", chaperones);
	System.out.printf("%50s", "Cost of admission: ");
    System.out.printf("%24s\n", totad);
	System.out.printf("%50s", "Cost of allowance: ");
    System.out.printf("%24s\n", allowance);
	if (bus == 1){
			    bus = 1300.42;
			    bus2 = admission/44 + 1;
			    bus3 = (bus * bus2);
			    System.out.printf("%50s", "Cost of buses: ");
                System.out.printf("%24s\n", bus3);
			    total = chaperones + totad + bus3 + allowance;
			    System.out.printf("%50s", "Total: ");
                System.out.printf("%24s\n", total);
				   }
    if (bus == 2){
				bus = 1738.92;
				bus2 = admission/54 + 1;
				bus3 = (bus * bus2);
				System.out.printf("%50s", "Cost of buses: ");
				System.out.printf("%24s\n", bus3);
				total = chaperones + totad + bus3 + allowance;
			    System.out.printf("%50s", "Total: ");
                System.out.printf("%24s\n", total);
		           }







// u
      }
}
