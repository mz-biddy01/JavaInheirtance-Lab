package management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;


    public Manager(String name, int niNumber, double salary, String deptName){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

//    public double getImprovedSalary(){
//        return  super.getSalary() + 2.00;
//    }
//
//    public double getImprovedSalaryAndBonus(){
//        return super.payBonus() + getImprovedSalary();
//    }
}
