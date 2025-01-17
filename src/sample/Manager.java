package sample;
public class Manager extends Employee{
    String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary); 
        this.department = department;
    }
    
}
