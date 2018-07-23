import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Random;


public class InvoiceApp {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        NumberFormat formatter = new DecimalFormat("#0.00");

        int taxCode = 1 + rand.nextInt(4);
        double taxRate;
        switch (taxCode){
            case 1: taxRate = 0.06;
                    break;
            case 2: taxRate = 0.053;
                    break;
            case 3: taxRate = 0.0575;
                    break;
            default: taxRate = 0.050;
                    break;
        }

        System.out.println("My current tax code is: " + rand.nextInt(3) + "\n"
                + "=============================================" + "\n" +
                "Welcome to the Behind-The-Door Break Room Cafe!");

        String all = "";
        double subTotal = 0.0;
        double total = 0.0;
        String userInput = "";
        double salesTax =0.0;

        while (!userInput.equalsIgnoreCase("q")) {


            printer("Enter a food item you want: (or type q to exit): ");
            String foodItem = keyboard.next();

            printer("Price ");
            double itemPrice = keyboard.nextDouble();

            printer("Taxable: ");
            boolean itemTaxable = keyboard.nextBoolean();

            printer("Quantity: ");
            int quantity = keyboard.nextInt();

            if ((foodItem.equalsIgnoreCase("cocacola")) && (quantity > 7)){
                quantity = 7;
            }

            all += foodItem + "\t\t" + "$" + itemPrice + "\t\t" + quantity + "\t\t" + itemTaxable + "\n";

            subTotal += (itemPrice*quantity);

            if (itemTaxable==true){
                salesTax += (quantity*taxRate*itemPrice);
            }else{
                salesTax += 0.0;
            }


            total = subTotal + salesTax;



            System.out.println("Do you want to add another item? (Type 'quit' to exit): yes");
            userInput = keyboard.next();


        }

        System.out.println("\n\n" + "===============================================================" + "\n" +
                                "Item Name" + "\t" + "Price" + "\t" + "Quantity" + "\t" + "Tax Field" + "\n"
                            + all + "\n \n" + "Subtoatal: " + "$" + formatter.format(subTotal) + "\n" + "Tax Rate: " + formatter.format(taxRate*100) + "%" + "(Tax Code = " + taxCode + ")" +
                                        "\n" + "Sales Tax: " + "$" + formatter.format(salesTax) + "\n" +
                                "_________________________________________________________" + "\n" + "Total: " + "$" + formatter.format(total));


        keyboard.close();


    }

    private static void printer (String output){
        System.out.println(output);
    }
}