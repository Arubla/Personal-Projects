import java.util.Scanner;

public class Application {
//simulating creation of an online account
    public static void main(String[] args) {
        //initialize a scanner and prompt user for account values in sequence
        Scanner userKeyboard = new Scanner(System.in);
        System.out.println("Let's create your account!\nPlease type in your new username: ");
        //prompt username
        String userName = userKeyboard.nextLine();
        Account account = new Account(userName);
        //create object with username

        //prompt other values and assign them to the object with setters


        //how do I make a method that saves the object into a text file?document class?





    }

}
