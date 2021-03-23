package techStaff;

import staff.Employee;

public class Developer extends Employee {


    public Developer(String name, int niNumber, double salary) {
        super(name, niNumber, salary);
    }

//    public double getImprovedSalary(){
//        return  super.getSalary() + 3.00;
//    }
//
//    public double getImprovedSalaryAndBonus(){
//        return super.payBonus() + getImprovedSalary();
//    }
}
