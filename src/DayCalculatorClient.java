import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DayCalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            DayCalculator dayCalculator = (DayCalculator) registry.lookup("DayCalculator");

            String dayOfWeek = dayCalculator.getDayOfWeek();
            System.out.println("Today is: " + dayOfWeek);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
