/**
 * Class for testing DumpClass
 * @author Wei Li
 */
public class Employee implements java.io.Serializable{
	private String name; //employee
	private double salary; //yearly
	private String buddy;
	
	Employee(String name) {this.name = name;}
	
	public void setSalary(double amount) {salary = amount;}
	public String getName() { return name;}
	public double getSalary() {return salary;}
	public String getBuddy() {return buddy;}
	public void setBuddy(String bud) {buddy = bud;}

	public String toString() {
		return name + " " + salary + " " + buddy;
	}
}
