package behavioral.observer;

public class SMSService implements OrderPlacedSubscriber{

    public SMSService(Flipkart flipkart){
        flipkart.addSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {

        sendSMS(order.getCustomerPhoneNumber(), "Your order is placed successfully.");
    }

    public void sendSMS(String to, String body) {
        System.out.println(
                "Sending SMS to " + to + " with body: " + body
        );
    }
}
