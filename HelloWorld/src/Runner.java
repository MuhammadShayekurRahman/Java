import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("USername");
		try {
			String username = br.readLine();
			if (username.compareTo("admin")==0) {
				System.out.println("Superuser...");
			}else {
				System.out.println("regular");
			}
				
			}catch(Exception err) {
				System.out.println(err);
			}
		}
}
