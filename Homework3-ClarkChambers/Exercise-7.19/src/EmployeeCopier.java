import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public final class EmployeeCopier {

	public static Employee copyEmployee(Employee emp) 
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = null;
		byte[] bytes = null;

		try {
			out = new ObjectOutputStream(bos);   
			out.writeObject(emp);
			bytes = bos.toByteArray();
		}
		catch (IOException ex) {}
		finally {
			try {
				bos.close();
			} 

			catch (IOException ex) {

			}
		}
		
		if(bytes == null) {
			return null;
		}
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInput in = null;
		try {
			in = new ObjectInputStream(bis);
			Employee emp2 = (Employee)in.readObject(); 
			return emp2;
		}
		catch (IOException ex) {} 
		catch (ClassNotFoundException e) {}
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
			// ignore close exception
			}
		}
		return null;
	}
}
