package _01_intro_to_static;

public class Athelete {
	public class Athlete {
	     int nextBibNumber;
	     String raceLocation = "New York";
	     String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	    }

	    public  void main() {
	    	Athlete a = new Athlete("Tom", 200);
	        //create two athletes
	    	Athlete b = new Athlete("Zach", 1000000);
	        //print their names, bibNumbers, and the location of their race. 
	    	System.out.println(a);
	    	System.out.println(b);
	    }
	}
}
