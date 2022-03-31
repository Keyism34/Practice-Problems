# Practice-Problems #1
import java.util.*;

public class receipt {
    public static void main(String[] args) {
        System.out.println("Name of item 1");
        Scanner scan = new Scanner(System.in);
        String item1 = scan.next();
        System.out.println("Quantity of Item 1");
        int quantity1 = scan.nextInt();
        System.out.println("Price of item 1");
        double price1 = scan.nextDouble();
        System.out.println("Previous price of item1");
        double previous1 = scan.nextDouble();
      
       
        System.out.println("Name of item 2");
        String item2 = scan.next();
        System.out.println("Quantity of Item 2");
        int quantity2 = scan.nextInt();
        System.out.println("Price of item 2");
        double price2 = scan.nextDouble();
        System.out.println("Previous price of item 2");
        double previous2 = scan.nextDouble();
        
        System.out.println("Name of item 3");
        String item3 = scan.next();
        System.out.println("Quantity of Item 3");
        int quantity3 = scan.nextInt();
        System.out.println("Price of item 3");
        double price3 = scan.nextDouble();
        System.out.println("Previous price of item 3");
        double previous3 = scan.nextDouble();
        
        double total1 = quantity1 * price1;
        double total2 = quantity2 * price2;
        double total3 = quantity3 * price3;
        
       
        
        System.out.println("Your bill:");
        System.out.println("Item 			Quantity 			Price 			      Total");
        System.out.println(item1 + " 			" + quantity1 + " 				" + price1 + "			 	 " +total1 +  "   This item was previously on sale for $0.25.");
        if (price1 > previous1) {
            System.out.println("You spent an extra  $" + previous1 * quantity1 );
            }
            else if (price1 < previous1) {
          	  System.out.println("You saved  $"+previous1 * quantity1);
            }
              
        System.out.println(item2 + "			" + quantity2 + "			 	" + price2 + "			 	 " +total2 +  "   This item was previously on sale for $1.00.");
        if (price2 > previous2) {
            System.out.println("You spent an extra  $" + previous2 * quantity2 );
            }
            else if (price2 < previous2) {
          	  System.out.println("You saved  $"+previous1 * quantity1);
            }
              
        System.out.println(item3 + "			" + quantity3 + "			 	" + price3 + "			 	 " +total3 +  "   You bought this item on sale for $0.75.");
        if (price3 > previous3) {
            System.out.println("You spent an extra  $" + previous3 * quantity3 );
            }
            else if (price3 < previous3) {
          	  System.out.println("You saved   $"+previous3 * quantity3);
            }
              
        double subtotal = total1 + total2 + total3;
        System.out.println("Subtotal        $" + subtotal);
        double salesTax = 0.0625 * subtotal;
        System.out.printf("6.25%% sales tax $%.2f", salesTax);
        System.out.println();
        double total = subtotal + salesTax;
        System.out.printf("Total         $%.2f", total);
