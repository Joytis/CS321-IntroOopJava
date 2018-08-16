import java.io.FileNotFoundException;
import java.util.Map;

public class TestHashDictionary {
	public static void main(String[] args) throws FileNotFoundException {
		HashDictionary dictionary = new HashDictionary("dictionary.txt", 20000);
		System.out.println("table size = " + dictionary.size());
		System.out.println("table empty = " + dictionary.empty());
		System.out.println("collision count = " + dictionary.count());
		System.out.println("max collision chain = " + dictionary.collision());
		System.out.println(dictionary.find("zygote"));
	}
}