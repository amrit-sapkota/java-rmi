import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DayCalculatorServer {
    public static void main(String[] args) {
        try {
            DayCalculator dayCalculator = new DayCalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("DayCalculator", dayCalculator);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

