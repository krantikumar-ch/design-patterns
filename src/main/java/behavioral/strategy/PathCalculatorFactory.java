package behavioral.strategy;

public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculator(String mode1){
        String mode = mode1.toUpperCase();
        PathCalculatorStrategy pathCalculatorStrategy = null;
        switch (mode){
            case "CAR":
                pathCalculatorStrategy = new CarPathCalculatorStrategy();
                break;
            case "BIKE":
                pathCalculatorStrategy = new BikePathCalculatorStrategy();
                break;
            default:
                pathCalculatorStrategy = new PublicPathCalculatorStrategy();
        }
        return pathCalculatorStrategy;
    }
}
