package Activities;

public class Activity6 {
		public static void main(String[] args) throws InterruptedException  {
			plane plane1 = new plane(10);
			plane1.onboard("name1");
			plane1.onboard("name2");
			plane1.onboard("name3");
			System.out.println("Plane took off at: " + plane1.takeOff());
	       
	        System.out.println("People on the plane: " + plane1.getPassengers());
	        plane1.land();
	        System.out.println("Plane landed at: " + plane1.getLastTimeLanded());
	        System.out.println("People on Plane after landing: " + plane1.getPassengers());
		}
}
