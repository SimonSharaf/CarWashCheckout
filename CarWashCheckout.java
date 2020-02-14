import java.util.Scanner;

class Wash{
	double cost;
}
class Detail{
	double detailcost;
}


class CarWashCheckout {
 	public static void main(String args[]) throws java.io.IOException {
		Scanner scanner = new Scanner(System.in);
		double total = 0.00;

		Wash a = new Wash();
		a.cost = 6.99;
		Wash b = new Wash();
		b.cost = 8.99;
		Wash c = new Wash();
		c.cost = 11.99;

		Detail d = new Detail();
		d.detailcost = 129.99;
		Detail e = new Detail();
		e.detailcost = 99.99;
		Detail f = new Detail();
		f.detailcost = 199.99;

		System.out.println("Hello and welcome to Unique Auto Spa!");
		System.out.println("Please enter the letter corresponding to the wash you would like today.");
		System.out.println("a. Deluxe wash: Basic wash for $6.99");
		System.out.println("b. Supreme wash: Deluxe wash plus wheel brightener and Armor All for $8.99");
		System.out.println("c. Ultimate wash: Supreme wash plus underbody flush and Carrnuba wax for $11.99");
		char washChoice = scanner.next().charAt(0);
		if (washChoice == 'a'){
			total = total + a.cost;
		}
		else if(washChoice == 'b'){
			total = total + b.cost;
		}
		else if(washChoice  == 'c'){
			total = total + c.cost;
		}
		System.out.println("Current total: $" + total + ".");
		System.out.println("Would you like to add a detail service for 10% off of your entire purchase?");
		System.out.println("Please enter Y for yes or N for no.");
		char yesNo = scanner.next().charAt(0);
		if(yesNo == 'Y'){
			System.out.println("Please enter the letter corresponding to the detail service you would like.");
			System.out.println("d. Exterior: Buff and Wax: $129.99");
			System.out.println("e. Interior: Leather conditioner and Carpet Shampoo: $99.99");
			System.out.println("f. Interior and Exterior: $199.99");
			char detailChoice = scanner.next().charAt(0);
			if (detailChoice == 'd'){
			total = total + d.detailcost;
			}
			else if(detailChoice == 'e'){
			total = total + e.detailcost;
			}
			else if(detailChoice  == 'f'){
			total = total + f.detailcost;
			}
			total = total * 0.9;
			total = Math.round(total * 100) / 100.0;

		}
		System.out.println("Current total: $" + total + ".");
		System.out.println("Would you like to leave a tip?");
		System.out.println("Please enter Y for yes or N for no.");
		char yesNo2 = scanner.next().charAt(0);
		if(yesNo2 == 'Y'){
			System.out.println("What percentage of tip would you like to leave?");

			double tip = scanner.nextDouble();
			total = total + ((tip/100.0) * total);
			total = Math.round(total * 100) / 100.0;
		}
		System.out.println("Your total is $" + total + " . Please take your reciept to an attendant and have a nice day!");
	}
}