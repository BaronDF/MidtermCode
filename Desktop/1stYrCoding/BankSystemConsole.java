import java.util.HashMap;
import java.util.*;

class User {
    private String username;
    private String password;
    public double balance;
    public double loanAmount;
    private String pinCode;

    public User(String username, String password, String pinCode, double balance) {
        this.username = username;
        this.password = password;
        this.pinCode = pinCode;
        this.balance = balance;
        this.loanAmount = 0;
    }

    public boolean authenticate(String inputUser, String inputPass) {
        return this.username.equals(inputUser) && this.password.equals(inputPass);
    }

    public boolean validatePin(String inputPin) {
        return this.pinCode.equals(inputPin);
    }
    
    public void deposit (double amount) {balance += amount;}

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
            return false;
    }

    public void applyLoan(double amount) {
        loanAmount += amount;
        balance += amount;
    }

    public boolean makeLoanPayment(double amount) {
        if (amount <= balance && amount <= loanAmount) {
        loanAmount -= amount;
        balance -= amount;
        return true;
    }
    return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getDetails() {
        return "User: " + username + "\nBalance: ₱" + balance + "\nLoan Amount: P" + loanAmount;
    }
}

public class BankSystemConsole {
    private static HashMap<String, User> users = new HashMap<>();
    private String loanDetails = "No loan Application subbmitted.";
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg) {
        users.put("victorino", new User("victorino", "password123", "1234", 7000));

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).authenticate(username,password)) {
            User currentUser = users.get(username);
            System.out.println("Welcome, " + username + "!");
            new BankSystemConsole().processTransactions(currentUser);
        } else {
            System.out.println("Invalid login credentials.");
        }
}
private void processTransactions(User user) {
int option = 0;
do {
System.out.println("\nMenu:");
System.out.println("1. Deposit");
System.out.println("2. Withdrawal");
System.out.println("3. Apply Loan");
System.out.println("4. Make Loan Payment");
System.out.println("5. View Balance");
System.out.println("6. View Loan Detwils");
System.out.println("7. Exit");
System.out.print("Choose Option: ");
try {
option = Integer.parseInt(scanner.nextLine());
} catch (NumberFormatException e) {
System.out.println("Invalid input! Please enter a valid number.");
continue;
}
switch (option) {
case 1:
System.out.print("Enter Deposit Amount: ");
double depositAmount = Double.parseDouble(scanner.nextLine());
user.deposit(depositAmount);
System.out.println("Deposit successful! Your Balance is: ₱" +
user.getBalance());
break;
case 2:
handleWithdrawal(user);
break;
case 3:
handleLoanApplication(user);
break;
case 4:
System.out.print("Enter Loan payment amount: ");
double paymentAmount =
Double.parseDouble(scanner.nextLine());
if (user.makeLoanPayment(paymentAmount)) {
System.out.println("Loan Payment successful! Your update balance is: ₱" + user.getBalance());
} else {
System.out.println("Insufficient funds or invalid amount");
}
break;
case 5:
System.out.println(user.getDetails());
break;
case 6:
System.out.println(loanDetails);
break;
case 7:
System.out.println("Thank you for Banking with us");
break;
default:
System.out.println("Invalid option. Try Again.");
}
} while (option != 7);
}
private void handleWithdrawal(User user) {
System.out.println("Withdrawal form:");
System.out.println("1. Savings");
System.out.println("2. Credit");
System.out.print("Enter Choice: ");
int accountChoice = Integer.parseInt(scanner.nextLine());
if (accountChoice != 1 && accountChoice != 2) {
System.out.println("Invalid account type.");
return;
}
System.out.print("Enter PIN to proceed: ");
String pinInput = scanner.nextLine();
if (!user.validatePin(pinInput)) {
System.out.println("Invalid PIN.");
return;
}
System.out.print("Enter Withdrawal amount: ");
double withdrawAmount = Double.parseDouble(scanner.nextLine());
if (user.withdraw(withdrawAmount)) {
System.out.println("Withdrawal succcessful! Your remaining balance is: ₱" + user.getBalance());
} else {
System.out.println("Insufficient funds."); 
}
}
private void handleLoanApplication(User user) {
System.out.print("Enter full name: ");
String name = scanner.nextLine();
System.out.print("Enter work Type (1. Goverment , 2. Private, 3. Own Business):");
String workType = scanner.nextLine();
System.out.print("Enter contact number: ");
String contactNumber = scanner.nextLine();
System.out.print("Enter email address: ");
String email = scanner.nextLine();
System.out.print("Enter your full Address: ");
String address = scanner.nextLine();
System.out.println("Select ID to submit:");
System.out.println("1. Driver's License \n2. TIN ID \n3. Goverment ID \n4. National ID");
System.out.print("Enter choice: ");
String selectedID = scanner.nextLine();
System.out.print("Enter loan amount (Whole number only): ");
double loanAmount = Integer.parseInt(scanner.nextLine());
System.out.println("Select loan teem:");
System.out.println("1. 6 months - 3% per month");
System.out.println("2. 12 months - 5% per month");
System.out.println("3. 15 months - 6% per month");
System.out.println("4. 24 months - 8% per month");
System.out.print("Enter choice: ");
int months = Integer.parseInt(scanner.nextLine().split(" ")[0]);
double monthlyPayment = loanAmount / months;
System.out.println("\nLoan Details: ");
System.out.println("Loan Amount: ₱" + loanAmount);
System.out.println("Monthly Payment: ₱" + monthlyPayment);
System.out.println("Do you agree to the loan terms? (yes/no):");
String agreement = scanner.nextLine();
if (agreement.equalsIgnoreCase("yes")) {
loanDetails = "Loan submitted! \nApplication Name: " + name + "\nWork Type: " + workType + "\nContact: " + contactNumber + "\nEmail: " + email + "\nAddress: " +
address + "\nSubmitted ID: " + selectedID + "\nLoan amount: " + "\nMonthly Payment: ₱" + monthlyPayment;
System.out.println("Loan Application submitted successfully!");
} else {
System.out.println("Loan Application cancelled.");
}
}
} 
