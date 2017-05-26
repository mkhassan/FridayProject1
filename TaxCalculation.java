package FridayProject1;

import java.util.Scanner;

// A program that calculate total amount owed by a customer including tax 

public class TaxCalculation {
	

	

	public static void main(String[] args) {
	
		
    System.out.println("Do you want to enter a record, enter Y for YES and N for NO");
    Scanner keyboard = new Scanner(System.in);
    
    String start = keyboard.next();
    
    if (start.equals("Y")) {
    
    

	//String start = "Y";
	
    		final String NRM, NPF, BIZ;
	
    		while (start.equals("Y")) {
        	double tax;
        	double amount_owed;
        	System.out.println("Enter Customer Details:");
    		
    	
    	
        	System.out.println("Enter customer id");
    	
        	int customerid = keyboard.nextInt();
        	System.out.println("Enter customer first name");
        	String firstname = keyboard.next();
    	
        	System.out.println("Enter customer second name");
        	String lastname = keyboard.next();
        	System.out.println("enter sales amount");
        	double sales_amount = keyboard.nextDouble();
        	System.out.println("enter tax_code");
        	String tax_code = keyboard.next();
    		
    		
    		
    		
    		
    		if (tax_code.equals("NRM")) {
    			tax = sales_amount * 0.06; 
		
    		}
    		else if (tax_code.equals("NPF")){
		tax = sales_amount * 0;
    		}
    		else {
    			tax = sales_amount
    					* 0.045;
		}
		
    		amount_owed = sales_amount + tax;
	System.out.println("Customer ID:" + customerid+"\n"+ "Customer Name:" + firstname +" "+ lastname+ "\n" + "Sales Amount: " + sales_amount+
			"\n"+ "tax _code: " +tax_code+"\n"+ "Total amount Due: " + amount_owed );


	System.out.println("Tax Code: " +tax_code);
	System.out.println("Total Amount Due:"+ amount_owed);
	
	
	System.out.println("Do you have more records to enter? If yes, enter Y, or N ");
	
	start = keyboard.next();
	
	
	
	}
	
    }
    
    
    
    
    
    
    

   }
}
