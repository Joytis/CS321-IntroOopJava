
public class Main 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("JoeSchmoe");
		e1.setSalary(120.33);
		e1.setBuddy("Buddo");
		Employee e2 = EmployeeCopier.copyEmployee(e1);

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		if(e1.getSalary() == e2.getSalary() &&
			e1.getBuddy().equals(e2.getBuddy()) &&
			e1.getName().equals(e2.getName())) 
		{
			System.out.println("Successful copy!");
		}
		else 
		{
			System.out.println("Insuccessful copy");
		}
	}
}	
