package behavioral.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator(Flipkart flipkart){
        flipkart.addSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        generateInvoice(order.getOrderId());
    }

    private void generateInvoice(Long orderId) {
        System.out.println("Generating invoice for order: " + orderId);
    }
}
