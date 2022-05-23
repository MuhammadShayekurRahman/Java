
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(withReturn("Test ")); }
	
	public static void noReturn() {
		System.out.println("This works but no return type");
	}
	public static String withReturn(String message) {
		return message;
	}
}
