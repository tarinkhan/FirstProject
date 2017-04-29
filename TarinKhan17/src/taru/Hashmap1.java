package taru;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {


		HashMap <String, String> Car = new HashMap <>();
		Car.put("IN", "India");
		Car.put("Ud", "Uganda");
		Car.put("BD", "Bangladesh");
		Car.put("CN", "Canada");
		Car.put("PK", "Pakistan");
		Car.put("NR", "Norway");
		System.out.println(Car.get("NR"));
	    System.out.println(Car.size());

	}

}
