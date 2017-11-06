import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your name: ");
		try {
			String input = br.readLine();
			HelloUser user = new HelloUser(input);
			user.greetUser();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
