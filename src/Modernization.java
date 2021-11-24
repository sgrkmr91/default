import com.adidas.Employee;

public class Modernization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sagar Kumar");
		
		Employee emp = new Employee();
		emp.setEid(0);
		emp.setEname("Name");
		
		System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getClass().getName());
	}

}
