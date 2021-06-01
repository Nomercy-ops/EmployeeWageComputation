public class Employee{
	static final int isFullTime = 1;
	static final int wageRatePerHour = 20;
	int employeeDailyWage = 0;

	void employeeWageCalculation( int workRatePerHour ) {
		 employeeDailyWage = wageRatePerHour * workRatePerHour;
		 System.out.println("Employee Daily wage is : " +employeeDailyWage +"$");
	}

	public static void main(String [] args){
	Employee employee = new Employee();
	System.out.println("Welcome to Employee Wage Computation Program");
	int attendanceCheck = (int)(Math.random()*2);
	if (attendanceCheck == isFullTime){
		employee.employeeWageCalculation(8);
		}
		else{
		employee.employeeWageCalculation(0);
	}
}
}
