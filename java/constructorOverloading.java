//circle
package com.thbs.canvas.shape;

public class Cirlce {
    private double radius;
   private String color;

   //customized circle
    public Cirlce( double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Cirlce() {
//        this.radius = 3.5;
//        this.color = "blue";
        this(3.5,"Blue"); //invoking fully parameterized constructor

    }

    public Cirlce(double radius) {
        this(radius,"Brown");
    }

    public Cirlce(String color) {
        this(6.5,color);
    }

    @Override
    public String toString() {
        return "Cirlce{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

//main
package com.thbs.canvas.mainPack;

import com.thbs.canvas.shape.Cirlce;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cirlce cirlce = new Cirlce("Black");
        Cirlce cirlce1 = new Cirlce(1.5,"Black");
        Cirlce cirlce2 = new Cirlce(9.5);
        Cirlce cirlce3 = new Cirlce();

        System.out.println(cirlce);
        System.out.println(cirlce1);
        System.out.println(cirlce2);
        System.out.println(cirlce3);
      
      //output
      Cirlce{radius=6.5, color='Black'}
      Cirlce{radius=1.5, color='Black'}
      Cirlce{radius=9.5, color='Brown'}
      Cirlce{radius=3.5, color='Blue'}

Process finished with exit code 0

    }
}
