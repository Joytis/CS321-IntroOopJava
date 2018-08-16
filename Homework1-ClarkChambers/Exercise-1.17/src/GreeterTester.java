
public class GreeterTester {
	public static void main(String[] args) {
		Greeter greet = new Greeter();
		for(int i = 0; i < args.length; i++) {
			greet.sayHello(args[i]);
		}
	}
}
