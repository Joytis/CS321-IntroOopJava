/**
 * Class for testing DumpClass
 * @author Wei Li
 */
public class Employee {
	private String name; //employee
	private double salary; //yearly
	
	Employee(String name) {this.name = name;}
	
	public void setSalary(double amount) {salary = amount;}
	public String getName() { return name;}
	public double getSalary() {return salary;}
}
