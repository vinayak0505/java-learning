package Payment;

public class CashPayment implements PaymentStrategy{

    @Override
    public boolean processPayment(double amount) {
        System.err.println("Amount paid by cash :"  + amount);
        return true;
    }
    
}
