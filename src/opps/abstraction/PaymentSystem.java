package opps.abstraction;

import java.sql.SQLOutput;

public class PaymentSystem {

    /*
    Question:
    Create abstract class Payment.

    Create abstract method:

    pay(double amount)

    Create:

    UPI
    CreditCard

    Implement pay() in both classes.

    Output Example:

    Paid ₹500 using UPI

    Paid ₹1200 using Credit Card
*/

    static abstract class Payment{
        abstract void pay(double amount);
    }

    static class UPI extends Payment{

        @Override
        void pay(double amount){
            System.out.printf("Paid ₹%.2f using UPI\n", amount);
        }
    }

    static class CreditCard extends Payment{
        @Override
        void pay(double amount){
            System.out.printf("Paid ₹%.2f using Credit Card\n", amount);
        }

    }

    public static void main(String[] args) {
        Payment upiPay = new UPI();
        upiPay.pay(500);

        Payment cardPayment = new CreditCard();
        cardPayment.pay(1200);
    }
}
