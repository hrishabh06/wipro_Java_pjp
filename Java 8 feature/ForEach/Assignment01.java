package ForEach;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrL = new ArrayList<String>(
				Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
		
		arrL.forEach(day -> System.out.println(day));
	}

}