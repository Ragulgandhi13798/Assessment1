package oops;

public class Mainclass {
	public static void main(String[]arg)
	{
	Employee e = new Employee();
	e.setName("Ragul");
	e.setId(123);
	
	
	Person p = new Person();
	p.setName("gandhi");
	
	System.out.println("Employee Name" + e.getName());
	
	System.out.println("Employee Id" + e.getId());

	System.out.println("Person Name" + p.getName ());
	
	//polymorphism (overriding)
	
	Surya s = new Surya();
	s.act();
	
	Vijay v =new Vijay();
	v.act();
	
	
	
	
	
	
	
	
	
	
	}

}
