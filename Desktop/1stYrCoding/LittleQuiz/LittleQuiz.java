import java.util.*;
public class LittleQuiz {

public static void main (String [] args) {
Scanner sc = new Scanner (System.in); 
int score = 0;

System.out.println();
System.out.print("Let's have a little Quiz!!! Use the capital letter of the corresponding answers!");
System.out.println();

System.out.print("Firstly though, what's is your name? ");
String name = sc.nextLine();
System.out.println();

System.out.println("Ok, " + name + ", are you ready? Here's is your first question!" );
Scanner sc1 = new Scanner (System.in);
System.out.println();

System.out.println("What are the two literary works done by Homer?");
System.out.println("\tA.Bible and the Quran	B.Romeo and Juliet");
System.out.print("\tC.The Iliad and Odyssey	D.I Have No Mouth, and I Must Scream");
System.out.println();
System.out.print("> ");
char a1 = sc1.next().charAt(0);

if (a1 == 'C') {
System.out.println("That is correct!!! The Iliad and Odyssey was credited to Homer!");
score++;
}else {
System.out.println("Oops! The correct answer is C!");
}

System.out.println();
System.out.println("Who was the protagonist of the Odyssey?");
System.out.println("\tA.Odysseus	B.Achilles");
System.out.println("\tC.Agamemnon	D.Patroclus");
System.out.println();
System.out.print("> ");
char a2 = sc1.next().charAt(0);

if (a2 == 'A') {
System.out.println("That is correct!!! Odysseus was the main protagonist in the Odyssey...duh");
score++;
}else {
System.out.println("Oops! The correct answer is A! Seriously?!");
}

System.out.println();
System.out.println("Who is the god that hunts Odysseus throughout the story?");
System.out.println("\tA.Zeus	B.Athena");
System.out.print("\tC.Hades	D.Poseidon");
System.out.println();
System.out.print("> ");
char a3 = sc1.next().charAt(0);

if (a3 == 'D') {
System.out.println("That is correct!!! Poseidon was the one who relentlessy pursue Odysseus throughout the story!");
score++;
}else {
System.out.println("Oops! The correct answer is D! Ruthlessness is mercy upon ourselves!!!");
}

System.out.println();
System.out.println("What is the reason why Poseidon is hunting Odysseus throught the story?");
System.out.println("\tA.Odysseus blinded his son	B.Odysseus talk smack to him");
System.out.print("\tC.Odyssesus stole a precious treasure from him	D.He just felt like it");
System.out.println();
System.out.print("> ");
char a4 = sc1.next().charAt(0);

if (a4 == 'A') {
System.out.println("That is correct!!! He did blinded his son!");
score++;
}else {
System.out.println("Oops! The correct answer is A! Didn't see that coming ey?");
}

System.out.println();
System.out.println("Which of these monster AREN't mentioned in the Odyssey?");
System.out.println("\tA.Scylla	B.Charybdis");
System.out.print("\tC.Sirens	D.Minotaur");
System.out.println();
System.out.print("> ");
char a5 = sc1.next().charAt(0);

if (a5 == 'D') {
System.out.println("That is correct!!! Most of the monsters mentioned are sea creatures!");
score++;
}else {
System.out.println("Oops! The correct answer is D! You seem lost.");
}

System.out.println();
System.out.println("Who gave Odysseus the wind bag?");
System.out.println("\tA.Circe	B.Aeolus");
System.out.print("\tC.Hermes	D.Athena");
System.out.println();
System.out.print("> ");
char a6 = sc1.next().charAt(0);

if (a6 == 'B') {
System.out.println("That is correct!!! Aeolus is the god of the winds!");
score++;
}else {
System.out.println("Oops! The correct answer is B! Must be the wind.");
}

System.out.println();
System.out.println("Who's infant did Odysseus killed?");
System.out.println("\tA.Patroclus	B.Hector of Troy");
System.out.print("\tC.Tiresias	D.Eurylochus");
System.out.println();
System.out.print("> ");
char a7 = sc1.next().charAt(0);

if (a7 == 'B') {
System.out.println("That is correct!!! He was afraid the baby might take revenge");
score++;
}else {
System.out.println("Oops! The correct answer is B! You must be too young for this :(");
}

System.out.println();
System.out.println("Who is the goddess that trapped Odysseus in her island?");
System.out.println("\tA.Athena	B.Hera");
System.out.print("\tC.Calypso	D.Aprodite");
System.out.println();
System.out.print("> ");
char a8 = sc1.next().charAt(0);

if (a8 == 'C') {
System.out.println("That is correct!!! She kidnapped him for 7 years in her island.");
score++;
}else {
System.out.println("Oops! The correct answer is C! I am the immortal Calypso!");
}

System.out.println();
System.out.println("How long did Odysseus was lost at sea before he got home?");
System.out.println("\tA.20	B.13");
System.out.print("\tC.12	D.22");
System.out.println();
System.out.print("> ");
char a9 = sc1.next().charAt(0);

if (a9 == 'A') {
System.out.println("That is correct!!! Yep took 20 years at sea, saw his son as an adult.");
score++;
}else {
System.out.println("Oops! The correct answer is A! Did you took that long too?");
}

System.out.println();
System.out.println("What is the island of Odysseus home called?");
System.out.println("\tA.Troy	B.Ithaca");
System.out.print("\tC.Greece	D.Olympus");
System.out.println();
System.out.print("> ");
char a10 = sc1.next().charAt(0);

if (a10 == 'B') {
System.out.println("That is correct!!! Ithaca is the name of his hometown.");
score++;
}else {
System.out.println("Oops! The correct answer is B! Oof that's why Odysseus was lost!");
}

System.out.println();
System.out.print("Goodjob!!!, " + name + ", you've completed the quiz, your overall score is: " + score + " over 10!");
}
}