public class Employee{
	static final int isFullTime = 1;
	static final int isPartTime = 2;
	static final int wageRatePerHour = 20;
	static int workingDayPerMonth = 20;
	static int employeeMonthlyWage = 0;
	int employeeDailyWage = 0;

	void employeeWageCalculation( int workRatePerHour ) {
		 employeeDailyWage = wageRatePerHour * workRatePerHour;
		 employeeMonthlyWage += employeeDailyWage;
		 System.out.println("Employee Daily wage is : " +employeeDailyWage +"$");
	}

	public static void main(String [] args){
	Employee employee = new Employee();
	System.out.println("Welcome to Employee Wage Computation Program");

	for (int day = 0; day<workingDayPerMonth; day++ ){
	int attendanceCheck = (int)(Math.random()*3);
	switch (attendanceCheck){
			case isFullTime:
			employee.employeeWageCalculation(8);
			break;

			case isPartTime:
			employee.employeeWageCalculation(4);
			break;

			default:
			employee.employeeWageCalculation(0);
		     }
		}
	  System.out.println("Employee Monthly wage is :" +employeeMonthlyWage  +"$");
}
}
