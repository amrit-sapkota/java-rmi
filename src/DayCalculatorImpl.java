import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;

public class DayCalculatorImpl extends UnicastRemoteObject implements DayCalculator {
    protected DayCalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public String getDayOfWeek() throws RemoteException {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[dayOfWeek - 1];
    }
}
