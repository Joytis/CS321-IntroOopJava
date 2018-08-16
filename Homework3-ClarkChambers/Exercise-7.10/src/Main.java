public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		Employee e = new Employee("John");
		DumpClass dc = new DumpClass(e);
		dc.dumpClass();
	}
}
