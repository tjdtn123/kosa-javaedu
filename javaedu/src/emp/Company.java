package emp;

public class Company {
	
	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Duke",1,"secretary",800);
		emp[1] = new Sales("Tuxi",2,"sales",1200);		
		printEmployee(emp,false);
		System.out.println();
		System.out.println("[인센티브100지급]");
		((Secretary)emp[0]).incentive(100);
		((Sales)emp[1]).incentive(100);
		printEmployee(emp,true);
	}
	public static void printEmployee(Employee[] emp, boolean isTax) {
		if(isTax) {
			System.out.printf("%4s\t%10s\t%6s\t%5s\t%9s\n","name","department","salary","tax","extra pay");
		}else
			System.out.printf("%4s\t%10s\t%6s\t%9s\n","name","department","salary","extra pay");
		System.out.println("--------------------------------------------------------");
		for(Employee elem : emp) {//			
			if(isTax) {
				System.out.printf("%4s\t%-10s\t%-6d\t%.1f\t%s\n",
					elem.getName(),
					elem.getDepartment(),
					elem.getSalary(),
					elem.tax(),
					(elem.getDepartment() == "sales")?((Sales) elem).getExtraPay():"");
			}
			else
				System.out.printf("%4s\t%-10s\t%-6d\t%s\n",
					elem.getName(),
					elem.getDepartment(),
					elem.getSalary(),
					(elem.getDepartment() == "sales")?((Sales) elem).getExtraPay():"");					
		}		
	}
}
