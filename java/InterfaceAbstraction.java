package com.thbs.vehicle;

public interface Automobile {
    String start();
    String stop();
    int increaseSpeed(int n);


}
// Vehicle
package com.thbs.vehicle;

public abstract class Vehicle implements Automobile {

    protected int regNo;
    protected String modelNo;
    protected  int currentSpeed;

    public Vehicle(int regNo, String modelNo, int currentSpeed) {
        this.regNo = regNo;
        this.modelNo = modelNo;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String start() {
        return "vehicle started";
    }

    @Override
    public String stop() {
        return "vehicle stopped";
    }

    @Override
    public abstract int increaseSpeed(int n);

    @Override
    public String toString() {
        return "Vehicle{" +
                "regNo=" + regNo +
                ", modelNo='" + modelNo + '\'' +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}

// car
package com.thbs.vehicle;

public class Car extends Vehicle {

    private int maxSpeed;
    private String type;
    protected int currentSpeed;

    public Car(int regNo, String type, int currentSpeed, int maxSpeed, String modelNo) {
        super(regNo, modelNo, currentSpeed);
        this.maxSpeed=maxSpeed;
        this.type=type;
    }


    @Override
    public int increaseSpeed(int n) {
        if (currentSpeed+n<maxSpeed){
            currentSpeed += n;
        }else {
            currentSpeed=-1;
        }
        return currentSpeed;
    }
}

// main
package com.thbs.mainpack;

import com.thbs.vehicle.Automobile;
import com.thbs.vehicle.Car;
import com.thbs.vehicle.Vehicle;

public class LongDrive {

    public static void main(String[] args) {
	// write your code here
        Car car =new Car(100,"q3",40,120,"Sedan");
        System.out.println(car.start());
      //  int incValue = car.increaseSpeed(50);
        int incValue = car.increaseSpeed(1000);
        Automobile car1 =new Car(100,"q1",40,120,"nano");
        Vehicle car2 =new Car(100,"q2",40,120,"Sedan");
        

        if (incValue==-1){
            System.out.println("exceeding ur speed limit");
        }else{
            System.out.println("accelerating successful");
        }

        System.out.println(car.stop());



    }
}
