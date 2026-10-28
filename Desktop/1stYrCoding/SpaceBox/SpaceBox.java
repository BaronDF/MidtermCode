import java.util.*;
public class SpaceBox {
	public static void main (String []args) {
	Scanner sc = new Scanner (System.in);

System.out.print ("Enter your name: ");
String name = sc.nextLine();

System.out.print ("Ok, " + name + ", now enter your weight on Earth: ");
double weight = sc.nextDouble();
System.out.println ();

System.out.println ("PROCESSING POTENTIAL PLANETS");
System.out.println ();
System.out.println ("I have information on these planets: ");

System.out.println ("\t 1.Mercury     2.Venus     3.Mars     4.Jupiter");
System.out.println ("\t 5.Saturn     6.Uranus     7.Neptune     8.Pluto");
System.out.println ();

System.out.print ("Which are you planning to visit? ");
int planet = sc.nextInt();
System.out.println ();

if (planet == 1) {

double p1 = weight * 0.38;
System.out.print ("Your weight on Mercury is " + p1 + " lbs");

}else if (planet == 2) {

double p2 = weight * 0.91;
System.out.print ("Your weight on Venus is " + p2 + " lbs");

}else if (planet == 3) {

double p3 = weight * 0.38;
System.out.print ("Your weight on Mars is " + p3 + " lbs");

}else if (planet == 4) {

double p4 = weight * 2.34;
System.out.print ("Your weight on Jupiter is " + p4 + " lbs");

}else if (planet == 5) {

double p5 = weight * 1.06;
System.out.print ("Your weight on Saturn is " + p5 + " lbs");
 
}else if (planet == 6) {

double p6 = weight * 0.92;
System.out.print ("Your weight on Uranus is " + p6 + " lbs");

}else if (planet == 7) {

double p7 = weight * 1.19;
System.out.print ("Your weight on Neptune is " + p7 + " lbs");

}else if (planet == 8) {

double p8 = weight * 0.06;
System.out.print ("Your weight on Pluto is " + p8 + " lbs");

}else if (planet > 8) {

System.out.print ("ERROR!!! My terminal can only measure upto our own solar system.");

}else {

System.out.print ("ERROR!!! Please input a number!");
}

}
}