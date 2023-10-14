public class Main {

    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Max Mustermann", 1, 40_000);
        employees[1] = new Employee("Thomas Maier", 5, 70_000);
        employees[2] = new Employee("Ingrid Hoier", 3, 50_000);
        employees[3] = new Employee("Sofia Larsen", 2, 60_000);
        employees[4] = new Employee("Leo Schmidt", 4, 80_000);
        employees[5] = new Employee("Mario Cruz", 5, 30_000);
        employees[6] = new Employee("Leoni Henkel", 3, 88_800);
        employees[7] = new Employee("Maria Lang", 1, 24_000);
        employees[8] = new Employee("Patrick Schmitt", 4, 50_555);
        employees[9] = new Employee("Lukas Klems", 2, 88_000);

        System.out.println("Сумма затрат на ЗП " +calculateTotalSalary());
        System.out.println("Сотрудник с мин.ЗП " +findEmployeeWithMinSalary());
        System.out.println("Сотрудник с макс.ЗП " +findEmployeeWithMaxSalary());
        System.out.println("Среднее значение зарплат " +calculateAverageSalary());
        printAllEmployees();
    }
    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeCount++;
            }
        }
        return totalSalary / employeeCount;
    }
}