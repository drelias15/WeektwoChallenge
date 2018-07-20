import java.util.Scanner;
import java.util.Random;

public class InvoiceApp {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("My current tax code is: " + rand.nextInt(3) + "\n"
                + "=============================================" + "\n" +
                "Welcome to the Behind-The-Door Break Room Cafe!");

        boolean stop = false;
        String foodItem = "";
        String price = "";
        String quantity = "";
        String taxable = "";

        while (stop==false) {
            System.out.println("Enter a food item you want: (or type q to exit): ");
            String userInput = keyboard.next();

            System.out.println("Price ");
            String userInput2 = keyboard.next();

            System.out.println("Taxable: ");
            String userInput3 = keyboard.next();

            System.out.println("Quantiy): ");
            String userInput4 = keyboard.next();


            System.out.println("Do you want to add another item? (Type 'quit' to exit): yes");
            String userInput5 = keyboard.next();

            if (userInput5.equalsIgnoreCase("q")) {
                stop = true;
            }
            else {
                foodItem += userInput + ", ";
                price += userInput2 + ", ";
                taxable += userInput3 + ", ";
                quantity += userInput4 + ", ";

            }
        } System.out.println(foodItem + "\n" + price + "\n" + quantity + taxable );







        keyboard.close();



    }
}