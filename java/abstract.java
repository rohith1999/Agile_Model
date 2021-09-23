package com.thbs.emppack;

public abstract class Employee {
   protected int empId;
   protected String employeeName;
   protected double salary;

    public Employee(int empId, String employeeName, double salary) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    //if any method is made abstract the whole class becomes abstract
    //now employee object cannot be created
    public abstract double calculateNetSalary();

    public String getDetails(){
        return (empId+" "+employeeName+" "+salary);
    }

    public double getSalary() {
        return salary;
    }

}

//manager
package com.thbs.emppack;

public class Manager extends Employee {

    private String deptName;
    private int empCount;


    public Manager(int empId, String employeeName, double salary, String deptName, int empCount) {
        super(empId, employeeName, salary);
        //constructor chaining - base class constructor evoked by derived class constructor
        this.deptName = deptName;
        this.empCount =empCount;
    }

    @Override
    public double calculateNetSalary() {
        return (9760);
    }

    @Override
    public String getDetails() {
        return (super.getDetails()+" "+deptName+" "+empCount);

    }

    public String getDeptName() {
        return deptName;
    }

    public int getEmpCount() {
        return empCount;
    }
}

//programmer
package com.thbs.emppack;

public class Programmer extends Employee{

    private int noOfProjects;
    private String skillSet;


    public Programmer(int empId, String employeeName, double salary, int noOfProjects, String skillSet) {
        super(empId, employeeName, salary);
        this.noOfProjects = noOfProjects;
        this.skillSet = skillSet;
    }

    @Override
    public double calculateNetSalary() {
        return (1000000);
    }

    @Override
    public String getDetails() {
        return (super.getDetails()+" "+noOfProjects+" "+skillSet);
    }

    public int getNoOfProjects() {
        return noOfProjects;
    }

    public String getSkillSet() {
        return skillSet;
    }
}

//main
package com.thbs;

import com.thbs.emppack.Employee;
import com.thbs.emppack.Manager;
import com.thbs.emppack.Programmer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager manager = new Manager(1,"rohith s",60000,"IT",10);
        Programmer programmer = new Programmer(2,"amith",50000,4,"HTML");

        System.out.println(manager.getDetails());
        System.out.println(programmer.getDetails());
        System.out.println("Net salary: "+ manager.calculateNetSalary());
        System.out.println("Net salary: "+ programmer.calculateNetSalary());


        Employee employee=new Programmer(1,"RAMESH",90000,7,"AI");
        System.out.println(employee.getDetails());
        System.out.println(((Programmer)employee).getSkillSet());

        Employee[] employees = new Employee[4];
        employees[0] = new Manager(1, "rohith", 20000.0,"Finance",10);
        employees[1] = new Manager(2, "amith", 30000.0, "IT", 20);
        employees[2] = new Programmer(3, "manju", 10000.0, 3, "Java");
        employees[3] = new Programmer(4, "ramesh", 15000.0, 2, "JS");


        for (Employee e : employees) {
            System.out.println(e.getDetails() + " Tax paid: " + e.calculateNetSalary());
        }



    }
}
