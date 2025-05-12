import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ParkingFees.BasicHourlyRateStrategy;
import ParkingSlot.CarParkingSlot;
import ParkingSlot.BikeParkingSlot;
import ParkingSlot.ParkingSlot;
import Payment.CashPayment;
import Payment.CreditCardPayment;
import Payment.Payment;
import Payment.PaymentStrategy;
import Vehicle.CarVehicle;
import Vehicle.Vehicle;

public class Main{
    public static void main(String args[]){
        List<ParkingSlot> parkingSlots = new ArrayList<>();

        parkingSlots.add(new CarParkingSlot(1));
        parkingSlots.add(new CarParkingSlot(2));
        parkingSlots.add(new BikeParkingSlot(3));
        parkingSlots.add(new BikeParkingSlot(4));

        ParkingLot parkingLot = new ParkingLot(parkingSlots);

        BasicHourlyRateStrategy basicHourlyRateStrategy = new BasicHourlyRateStrategy();

        Vehicle car1 = new CarVehicle("car1", basicHourlyRateStrategy);
        Vehicle bike1 = new CarVehicle("bike1", basicHourlyRateStrategy);

        ParkingSlot carSpot = parkingLot.parkVehicle(car1);
        ParkingSlot bikeSpot = parkingLot.parkVehicle(bike1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selece payment method for you vehicle");
        System.err.println("1 cash");
        System.err.println("2 card");

        int nextInt = scanner.nextInt();

        PaymentStrategy paymentStrategy = getPaymentStrategy(nextInt);

        if(carSpot != null){
            double carFee = car1.calculateFee(2);
            paymentStrategy.processPayment(carFee);
            parkingLot.vacateSpot(carSpot, car1);
        }

        scanner.close();
    }

    public static PaymentStrategy getPaymentStrategy(int input){
        if(input == 1) return new CashPayment();
        return new CreditCardPayment();
    }
}