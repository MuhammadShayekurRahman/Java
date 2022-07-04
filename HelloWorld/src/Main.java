
public class Main {

	public static void main(String[] args) {
		String str1 = "The cat sat on the mat. My cat is called Frank. Cats cute!";
		int wh = str1.replace("cat", "dog").toUpperCase().indexOf("dog");
		System.out.println(wh);
	}

}
