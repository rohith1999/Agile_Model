package com.thbs.emppack;

public class Employee {
   protected int empId;
   protected String employeeName;
   protected double salary;

    public Employee(int empId, String employeeName, double salary) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

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

//tax
package com.thbs.tax;

import com.thbs.emppack.Employee;
import com.thbs.emppack.Manager;
import com.thbs.emppack.Programmer;

public class Tax {

    public static double calculateTax(Employee employee){
        //different employees different calculation
        if (employee instanceof Manager){
            return (employee.getSalary()*0.2);
        }
        if (employee instanceof Programmer){
            return (employee.getSalary()*0.4);
        }
        else {
            return 0;
        }

    }

}

//main
package com.thbs.mainpack;

import com.thbs.emppack.Employee;
import com.thbs.emppack.Manager;
import com.thbs.emppack.Programmer;
import com.thbs.tax.Tax;

public class Main {

    public static void main(String[] args) {
        // Heirarchical inheritance
//
//        Employee employee=new Employee(1,"amith g",30000);
//        Manager manager=new Manager(2,"rohith s",50000,
//                "R and D",20);
//
//        Programmer programmer=new Programmer(3,"manju m",40000,20,"java");
//
//        System.out.println(employee.getDetails());
//        System.out.println(manager.getDetails());
//        System.out.println(programmer.getDetails());
//
//        //base class reference to a derived class object
//        //manager object is upcasted
//        Employee employee1=new Manager(10,"ram",40000,"IT",5);
//        System.out.println(employee1.getDetails());
//
//        //down casting
//        Manager m2 = (Manager) employee1;
//        System.out.println(" count "+m2.getEmpCount());


        //use of upcasting and down casting
        Employee[] employees = new Employee[4];
        employees[0] = new Employee(1, "rohith", 20000.0);
        employees[1] = new Manager(2, "amith", 30000.0, "IT", 20);
        employees[2] = new Programmer(3, "manju", 10000.0, 3, "Java");
        employees[3] = new Programmer(4, "ramesh", 15000.0, 2, "JS");


        for (Employee e : employees) {
            System.out.println(e.getDetails() + " Tax paid: " + Tax.calculateTax(e));
        }



    }
}





