package emp;

public class Sales extends Employee implements Bonus{
	public Sales() {
		
	}
	public Sales(String name,int number, String department, int salary) {
		super(name,number,department,salary);
	}
	public double tax() {
		return getSalary()*0.13;
	}
	public void incentive(int pay) {
		setSalary((int)(getSalary()+pay*1.2));
	}
	public double getExtraPay() {
		if(getDepartment() == "sales") {
			return getSalary()*0.03;
		}
		else 
			return getSalary();
	}
	
}
