package Ex;

public class Employee {
    String name;//従業員名
    int salary;//給料額

    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
