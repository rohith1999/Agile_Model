package com.thbs;


public class Address {
    private int doorNo;
    private String  street;
    private String city;
    private String state;
    private String pinCode;

    public Address(int doorNo, String street, String city, String state, String pinCode) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}

//Person
package com.thbs;

public class Person {
    private int personId;
    private String personName;
    private  Address address;

    public Person(int personId, String personName, Address address) {
        this.personId = personId;
        this.personName = personName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", address=" + address +
                '}';
    }
}

//main
package com.thbs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Address address=new Address(17,"RT nagar","Bamgalore","Karnataka","560032");
        Person person=new Person(1,"Rohith S",address);

        System.out.println(person);
    }
}
