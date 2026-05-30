package opps.abstraction;

 public class PaymentGateWayDemo {
    /*
    Question:
    Create interface:

    PaymentGateway

    Method:

    processPayment(double amount)

    Create:

    PayPal
    Stripe

    Implement processPayment() in both classes.

    Use interface reference variable.

    Example Output:

    Processing ₹500.00 through PayPal

    Processing ₹1200.00 through Stripe
*/

    interface  PaymentGateWay{
        void processPayment(double amount);
    }

    static class PayPal implements PaymentGateWay{

        @Override
        public void processPayment(double amount) {
            System.out.printf("Processing ₹%.2f through PayPal\n",amount);
        }
    }

    static class Stripe implements PaymentGateWay{

        @Override
        public void processPayment(double amount) {
            System.out.printf("Processing ₹%.2f through Stripe\n",amount);
        }
    }

    public static void main(String[] args) {
        PaymentGateWay payPal = new PayPal();
        PaymentGateWay stripe = new Stripe();

        payPal.processPayment(500);
        stripe.processPayment(1200);
    }
}
