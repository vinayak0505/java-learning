package Payment;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public boolean processPayment(double amout) {
        System.err.println("Payment make by card :" + amout);
        return true;
    }
    
}
