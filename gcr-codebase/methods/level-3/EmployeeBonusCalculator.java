//Create a class EmployeeBonusCalculator to calculate bonus and salary details
public class EmployeeBonusCalculator {

    //method to generate salary and years of service for employees.
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            //Generate 5-digit salary
            double salary = (int)(Math.random() * 90000) + 10000;

            //Generate years of service
            double years = (int)(Math.random() * 10) + 1;

            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    //method to calculate new salary and bonus.
    public static double[][] calculateBonus(double[][] employeeData) {

        double[][] updatedData = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusRate;

            //bonus logic
            if (years > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }

            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }

    //Method to calculate totals and display result in tablular form.
    public static void displaySummary(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp | Old Salary | Years | Bonus | New Salary");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];

            System.out.printf(
                "%3d | %10.0f | %5.0f | %6.0f | %10.0f%n",
                (i + 1),
                oldData[i][0],
                oldData[i][1],
                newData[i][1],
                newData[i][0]
            );
        }

        System.out.println("---------------------------------------------");
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        //generate employee data.
        double[][] employeeData = generateEmployeeData(employees);

        //calculate bonus and new salary
        double[][] updatedData = calculateBonus(employeeData);

        //Display final summary
        displaySummary(employeeData, updatedData);
    }
}