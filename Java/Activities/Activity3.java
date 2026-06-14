package Activities;

public class Activity3 {
	public static void main (String[] args) {
		
      Activity3 obj1 = new Activity3();
      
        System.out.println(obj1.adjustDevice("THERMOSTAT", 41));
		System.out.println(obj1.adjustDevice("THERMOSTAT", 25));
		System.out.println(obj1.adjustDevice("LIGHT", 50));
	}
	
	
	public String adjustDevice(String device, int value) {
		
		return switch (device) {
		
		case null -> "Invalid device type.";
		
		case "THERMOSTAT" -> {
		
		if (value >40) {
			yield "[Thermostat] Warning: Temperature high " + value ;
		               }
            else {
            	yield "[Thermostat] Temperature is set to " + value;
                  }
           }
		
		case "LIGHT" ->
			"[Light] Adjusting brightness to " + value + "%.";
	
		
		default ->"Unknown device given";
		
		};
		
	}
}
