package Activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class plane {
    private List<String> Passengers;
    private int maxpassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    // Constructor
    public plane (int maxPassengers) {
        this.maxpassengers = maxPassengers;
        this.Passengers = new ArrayList<>();
    }
    public void onboard(String passengersname)
    {
    	if(Passengers.size() <= maxpassengers) {
            this.Passengers.add(passengersname);
        } else {
            System.out.println("Plane is full");
        }
    }
    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    public void land() {
        this.lastTimeLanded = new Date();
        this.Passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
    
	public List<String> getPassengers() {
    return Passengers;
}
    
}