package JCF;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
	
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("India", 1);
		hm.put("Canada", 2);
		System.out.println(hm);
		for(String Names : hm.keySet()) {
			System.out.println("Names"+"="+ Names);
			System.out.println("Value"+"="+ hm.get(Names));
			

	}
	}

}
