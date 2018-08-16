
public class DataAnalyzerTester {
	public static void main(String[] args) {
		if(args.length != 0) {
			String p = args[0];
			DataAnalyzer da = new DataAnalyzer(p);
			da.analyze();
		}
	}
}
