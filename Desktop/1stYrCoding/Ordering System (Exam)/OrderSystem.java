import java.util.*;

public class OrderSystem {
public static void main (String[] args) {
Scanner sc = new Scanner (System.in);

//Datatypes used
String main = "";
String side = "";
String des = "";
boolean valid = true;
boolean hasdessert = false;
int total = 0;
double discount = 0.0;
double finalTotal = 0.0;

//Header
System.out.println ("+----------------------------+");
System.out.println ("|  Welcome to Baron's Cafe   |");
System.out.println ("+----------------------------+");

System.out.print("Please state your name: ");
String name = sc.nextLine();
System.out.println ("\nWe have the available items, " + name + "! What would you want to order? Input a number to start!");
System.out.println ("1. Coffee meal");
System.out.println ("2. Sandwich meal");
System.out.println ("3. Dessert");
System.out.print ("> ");
 do{
int menu = sc.nextInt();

//Coffee Meal Menu
if (menu == 1) {
	System.out.println("\nWhich of these coffees would you choose?");
	System.out.println("1. Latte (50$)");
	System.out.println("2. Espresso (70$)");
	System.out.println("3. Americano (90$)");
	System.out.print ("> ");
	do {//Using looping incase the customer doesn't follow instruction
	int cof = sc.nextInt();
		
	if (cof == 1) { 
	main = "Latte";	
	total += 50;
	valid = true;
	hasdessert = false;
	}else if (cof == 2) {
	main = "Espresso";
	total += 70;
	valid = true;
	hasdessert = false;
	}else if (cof == 3) {
	main = "Americano";
	total += 90;
	valid = true;
	hasdessert = false;
	}else {
	System.out.println("Invalid Item! Try Again!!");
	System.out.print ("> ");
	valid = false;
	continue;
	}
	} while (!valid); //To prevent unknown instructions to get through

	//If first statement is True proceed to these choices
	if (valid) {
	System.out.println("What sides do you want to get?");
	System.out.println("1. Salad (20$)");
	System.out.println("2. Mashed Potatoes (15$)");
	System.out.println("3. Cupcake (25$)");
	System.out.println("4. None");
	System.out.print ("> ");
	do{//Do While Loop
 	valid = true;
	hasdessert = false;
	int order2 = sc.nextInt();
	
	if (order2 == 1) {
	side = "Salad";
	total += 20;
	valid = true;
	hasdessert = false;
	}else if (order2 == 2) {
	side = "Mashed Potatoes";
	total+= 15;
	valid = true;
	hasdessert = false;
	}else if (order2 == 3) {
	side = "Cupcake";
	total += 25;
	valid = true;
	hasdessert = false;
	}else if (order2 == 4) {
	side = "None";
	total += 0;
	valid = true;
	hasdessert = false;
	}else {
	System.out.println("Invalid Item! Try Again!!");
	System.out.print ("> ");
	valid = false;
	continue;
	}
	}while (!valid);
}

}//Sandwich Menu
else if (menu == 2) {
	System.out.println("\nWhich of these meals would you choose?");
	System.out.println("1. Egg Sandwich (20$)");
	System.out.println("2. Vegan Sandwich (40$)");
	System.out.println("3. Sandwich Deluxe (120$)");
	System.out.println("4. Monster Sandwich (250$)");
	System.out.print ("> ");
	do {// Do While Loop again
	int san = sc.nextInt();
	
	if (san == 1) { 
	main = "Egg Sandwich";	
	total += 20;
	valid = true;
	hasdessert = false;
	}else if (san == 2) {
	main = "Vegan Sandwich";
	total += 40;
	valid = true;
	hasdessert = false;
	}else if (san == 3) {
	main = "Sandwich Deluxe";
	total += 120;
	valid = true;
	hasdessert = false;
	}else if (san == 4) {
	main = "Monster Sandwich";
	total += 250;
	valid = true;
	hasdessert = false;
	}else {
	System.out.println("Invalid Item! Try Again!!");
	System.out.print ("> ");
	valid = false;
	continue;
	}
	} while (!valid);
	//If first statement is True proceed to these choices
	if (valid) {
	System.out.println("What drinks do you want to get?");
	System.out.println("1. Coke (25$)");
	System.out.println("2. Iced Tea (35$)");
	System.out.println("3. Beer (45$)");
	System.out.println("4. None");
	System.out.print ("> ");
	do {//Do While Loop again part 2
	int order2 = sc.nextInt();
	
	if (order2 == 1) {
	side = "Coke";
	total += 25;
	valid = true;
	hasdessert = false;
	}else if (order2 == 2) {
	side = "Iced Tea";
	total+= 35;
	valid = true;
	hasdessert = false;
	}else if (order2 == 3) {
	side = "Beer";
	total += 45;
	valid = true;
	hasdessert = false;
	}else if (order2 == 4) {
	side = "None";
	total += 0;
	valid = true;
	hasdessert = false;
	}else {
	System.out.println("Invalid Item! Try Again!!");
	System.out.print ("> ");
	valid = false;
	continue;
	}
	} while (!valid);	
	} while (!valid);

} //Dessert Menu
else if (menu == 3) {
	System.out.println("\nWhich of these desserts would you choose?");
	System.out.println("1. Ice Cream (25$)");
	System.out.println("2. Mango Pie (35$)");
	System.out.println("3. Gelatin (20$)");
	System.out.println("4. Icecream Sandwich (40$)");
	System.out.print ("> ");
	do {//Another Do While Sequel
	int desChoice = sc.nextInt();
	
	if (desChoice == 1) { 
	des = "Ice Cream";	
	total += 25;
	hasdessert = true;
	valid = true;
	}else if (desChoice == 2) {
	des = "Mango Pie";
	total += 35;
	hasdessert = true;
	valid = true;
	}else if (desChoice == 3) {
	des = "Gelatin";
	total += 20;
	hasdessert = true;
	valid = true;
	}else if (desChoice == 4) {
	des = "Icecream Sandwich";
	total += 40;
	hasdessert = true;
	valid = true;
	}else {
	System.out.println("Invalid Menu Item");
	System.out.print("> ");
	valid = false;
	continue;
	} 
	}while (!valid);
   
} //Giving the customer an additional option incase they want dessert
if (valid && !hasdessert) {
	System.out.println("Would you like to include dessert along side your meal? (Y/N)");
	System.out.print("> ");
	char choice = sc.next().charAt(0); //Using next().charAt(0);
	if (choice == 'y' || choice == 'Y') {
	System.out.println("\nWhich of these desserts would you choose?");
	System.out.println("1. Ice Cream (25$)");
	System.out.println("2. Mango Pie (35$)");
	System.out.println("3. Gelatin (20$)");
	System.out.println("4. Icecream Sandwich (40$)");
	System.out.print ("> ");
	do {
	int desChoice = sc.nextInt();
	if (desChoice == 1) {
	des = "Ice Cream";	
	total += 25;
	valid = true;
	hasdessert = true;
	}else if (desChoice == 2) {
	des = "Mango Pie";
	total += 35;
	hasdessert = true;
	valid = true;
	}else if (desChoice == 3) {
	des = "Gelatin";
	total += 20;
	hasdessert = true;
	valid = true;
	}else if (desChoice == 4) {
	des = "Icecream Sandwich";
	total += 40;
	hasdessert = true;
	valid = true;
	}else {
	System.out.println("Invalid Item! Try Again!!");
	System.out.print ("> ");
	valid = false;
	continue;
	}
	} while (!valid);
	//Option when customer denies the additional dessert option
	}else if (choice == 'n' || choice == 'N') {
	System.out.println("No dessert added");
	des = "No dessert";
	valid = true;
	}else {
	System.out.println("Invalid Item! Try Again!!");
	System.out.print ("> ");
	valid = false;
	continue;
	}
	} while (!valid);
	//Applying the discount unto the final total
if (valid) {
	System.out.println("Are you a PWD or Senior Citizen? (Y/N)");
	System.out.print("> ");
	char choice = sc.next().charAt(0); //Using next().charAt(0);
	if (choice == 'y' || choice == 'Y') {
	discount = total*0.20;
	finalTotal = total - discount;
	//Option for customer's that aren't qualified
	}else if (choice == 'n' || choice == 'N') {
	System.out.println ("PWD/Senior Citizen Discount is not applied");
	finalTotal = total;
	}

}
//Final Output
if (valid) {
		System.out.println("\n+-----------RECEIPT-----------+");
		System.out.println("	NAME: " + name);
		System.out.println("	MAIN: " + main);
		System.out.println("	SIDE: " + side);
		System.out.println("	DESSERT: " + des);
		System.out.println("	Total: " + total);
		System.out.println("	Discount: " + discount);
		System.out.println("	Final Total: " + finalTotal);
		System.out.println("\n+-----------------------------+");
}

} while (!valid);
}
}