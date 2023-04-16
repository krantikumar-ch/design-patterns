package behavioral.observer;

public class InventoryManagementSystem implements OrderPlacedSubscriber{

    public InventoryManagementSystem(Flipkart flipkart){
        flipkart.addSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        update(order.getProductId());
    }

    private void update(Long productId) {
        System.out.println("InventoryManagementSystem: Order is placed. Updating inventory.");
    }
}
