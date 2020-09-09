import java.util.Optional;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = new String[5];
		
		Optional<String> n = Optional.ofNullable(names[0]);
		if(n.isPresent())
			System.out.println(n.get());
		else
			System.out.println("String value is not present");
	}

}