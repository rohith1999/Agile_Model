package org.thbs.bc84;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    private String doorNo;
    private  String streetNo;
    private  String city;
    private  String state;
    private String pinCode;

}


//customer
package org.thbs.bc84;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
private int id;
private String name;
private Address address;

public Customer(Address address){
    this.address=address;
}

}


//main

package org.thbs.bc84;


public class App {
    public static void main(String[] args) {

//        Customer -id,name,address   Address-doorNo,street,pincode
        //address is injected in Customer class

//        Address address=new Address("17","2nd cross, seethappa layout","Bangalore","Karnataka"
//                ,"560032");
//
//
//        Customer customer=new Customer(1,"Rohith S",address);

        Address address=new Address("17","2nd cross, seethappa layout","Bangalore","Karnataka"
               ,"560032");


        //IOC injection process
        //2 types -constructor and setter injection

        Customer customer=new Customer(address);
        customer.setId(1);
        customer.setName("rohith");
        System.out.println(customer);


    }
}

