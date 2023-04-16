package behavioral.strategy;

public class PublicPathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void findPath(String from, String to) {
        System.out.println("Public Transport path calculator");
    }
}
