public class Employee{
	static final int isFullTime = 1;
	static final int isPartTime = 2;
	static final int wageRatePerHour = 20;
	static final int workingDayPerMonth = 20;
	static  final int  maxHoursInMonth = 100;
	static int employeeMonthlyWage = 0;
	static int workRatePerHour = 0;

	void employeeWageCalculation( int workRatePerHour ) {
		 int employeeDailyWage = wageRatePerHour * workRatePerHour;
		 employeeMonthlyWage += employeeDailyWage;
		 Employee.workRatePerHour=workRatePerHour;
		 System.out.println("Employee Daily wage is : " +employeeDailyWage +"$");
	}

	public static void main(String [] args){
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		System.out.println("Welcome to Employee Wage Computation Program");
		 Employee employee = new Employee();

	while (totalEmployeeHours <= maxHoursInMonth && totalWorkingDays < workingDayPerMonth ) {
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
			totalWorkingDays++;
			totalEmployeeHours += workRatePerHour;
		}
	  System.out.println("Employee Total Working Hours is :" +totalEmployeeHours  +" hrs");
	  System.out.println("Employee Monthly wage is :" +employeeMonthlyWage  +"$");
	  System.out.println("Employee Total Working Days is : " +totalWorkingDays +" days")
}
}
