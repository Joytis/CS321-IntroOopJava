import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DumpClass {
	private Class inner_class;

	public DumpClass(Object obj) { inner_class = obj.getClass(); }
	public DumpClass(Class cla) { inner_class = cla; }

	public void dumpClass() 
	{
		Field[] fields = inner_class.getDeclaredFields();
		Method[] methods = inner_class.getDeclaredMethods();
		Constructor[] cons = inner_class.getDeclaredConstructors();

		System.out.println(inner_class.toString() + "\n-----------------------");
		System.out.println("\nFIELDS:");	
		for(Field f : fields) {
			System.out.println(f.getGenericType() + " " + f.getName());
		}
		System.out.println("\nCONSTRUCTORS:");	
		for(Constructor c : cons) {
			System.out.println(c.getName());
		}
		System.out.println("\nMETHODS:");	
		for(Method m : methods) {
			System.out.println(m.getGenericReturnType() + " " + m.getName());
		}
	}
}
