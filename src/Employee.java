public class Employee {
    private String fullname;
    private int department;
    private int salary;
    private int id;

    public static int counter;

    public Employee(String fullname, int department, int salary){
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullname() {
        return fullname;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "fullname " +fullname+ ", department " + department+ ", salary " + salary;
    }
}





