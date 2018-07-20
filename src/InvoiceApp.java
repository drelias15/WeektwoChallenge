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
            int userInput2 = keyboard.nextInt();

            System.out.println("Taxable: ");
            String userInput3 = keyboard.next();

            System.out.println("Quantiy): ");
            int userInput4 = keyboard.nextInt();


            System.out.println("Do you want to add another item? (Type 'quit' to exit): yes");
            String userInput5 = keyboard.next();

            if (userInput5.equalsIgnoreCase("q")) {
                stop = true;
            }
            else {
                foodItem += userInput + ", ";
                price += userInput2 + ", ";
                taxable += userInput3;
                quantity += userInput4;

            }
        } System.out.println(foodItem + "\n" + price + "\n" + quantity + taxable );

//        System.out.println("Enter name of item 1 ");
//        itemName01 = keyboard.next();
//
//        System.out.println("Enter name of item 2 ");
//        itemName02 = keyboard.next();
//
//        System.out.println("Enter price of item 1 ");
//        itemPrice01 = keyboard.nextDouble();
//
//        System.out.println("Enter price of item 2 ");
//        itemPrice02 = keyboard.nextDouble();
//
//        //System.out.println("Enter Quantity of item 1 ");
//        // itemQuantity01 = keyboard.nextInt();
//
//        //System.out.println("Enter Quantity of item 2 ");
//        //itemQuantity02 = keyboard.nextInt();
//
//        itemCost01 = itemPrice01*itemQuantity01;
//        itemCost02 = itemPrice02*itemQuantity02;
//        totalAmount = itemCost01 + itemCost02;
//
//        System.out.println("\n");
//
//        System.out.println("Item Name" + "\t" + "Price" + "\t" + "Quantity" + "\t" + "Cost" + "\n"
//                + itemName01 + "\t\t" + "$"+ itemPrice01 + "\t" + itemQuantity01 + "\t\t" + "$" + itemCost01 + "\n"
//                + itemName02 + "\t\t" + "$" + itemPrice02 + "\t" + itemQuantity02 + "\t\t" + "$" + itemCost02 + "\n\n"
//                + "Total Purchase Amount = " + "$" + totalAmount + "\n\n"
//        );
//
//        if (totalAmount <=20){
//            System.out.println("Thank you for shopping in my market!");
//        }
//        else {
//            System.out.println("You spent too much today...");
//        }


        keyboard.close();



    }
}