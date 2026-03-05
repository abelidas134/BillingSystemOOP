package billingsystemoop;

import java.util.*;

public class BillingSystemOOP {
    static double finalTotal, tax, subTotal;
    public static void main(String[] args) {
//    • Track payment status (Pending, Paid, Refunded).
//    • Prevent reservation from being marked “Completed” until payment is
//    confirmed.
//    • Allow staff to update payment status manually (for simulation purposes).
//    • Generate printable receipt with reservation and customer details.
//    • Store payment transaction history for reporting.

    Scanner scan = new Scanner(System.in);
    String reservationNo, reservationStatus="active", paymentStatus="paid";
    int daysRented, ratePerDay=2000,penaltyRate=600, actualReturnDate=0, expectedReturnDate=0,
            dropOffDate, pickupDate, cleaningFee=400;
    double damageFee=ratePerDay*0.50;
     
    System.out.println("Enter reservation number:");
    reservationNo = scan.nextLine(); //Connect with Manu
    System.out.println("Enter Drop Off Date:");
    dropOffDate = scan.nextInt();
    System.out.println("Enter Pick Up Date:");
    pickupDate = scan.nextInt();
//1. Compute rental duration
//2. Compute Base Cost
//3. Add Late Penalty (if any)
//4. Add Extra Charges
//5. Compute Subtotal
//6. Compute Tax
//7. Compute Final Amount
    //Confirmation of Reservation (Notif)
     if ("0000".equals(reservationNo)/*Manu*/){
         //Present the reservtion details from Manu's code. or call method
         //this are just a sample code, the final code for this section is from manu
        System.out.println("Days Rented:");
        daysRented = scan.nextInt ();
        
        System.out.println("Confirmed (y/n):");
         
        if ("active".equalsIgnoreCase(reservationStatus)){
             generateInvoice(daysRented, ratePerDay, penaltyRate, paymentStatus, dropOffDate, pickupDate,
                     actualReturnDate, expectedReturnDate, cleaningFee, damageFee);
             
            System.out.println("Reservation Number: "+reservationNo);
            System.out.println("Customer Name: ");
            System.out.println("Vehicle: ");
            System.out.println("Days Rented: "+daysRented);
            System.out.println("Daily Rate: "+ratePerDay);
            System.out.println("Extra Fees: "+(cleaningFee+damageFee));
            System.out.println("Initial Amount: "+subTotal);
            System.out.println("Tax: "+tax);
            System.out.println("Total Amount: "+finalTotal);
        } else {
             System.out.println("Exit.");
        }
     } else {
         System.out.println("Reservation number is not recorded. Please try again!");
     }
    
    }
    
    
    public static void generateInvoice (int noOfDays, int dailyRate, int penRate, String statusPaid, 
            int dropOff, int pickup, int actualReturn, int expectedReturn, int cleanFee, double damFee){
        int cost, extraDays, latePenalty;
        double extraCharge;
        //Formulas
        cost = dailyRate*noOfDays;
        extraDays = actualReturn - expectedReturn;
        latePenalty = extraDays*penRate;
        extraCharge = damFee + cleanFee;
        subTotal = cost + latePenalty + extraCharge;
        tax = subTotal*0.12;
        finalTotal = subTotal + tax;
        
        
    }
    
    
}
