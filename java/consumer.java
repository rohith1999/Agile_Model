package com.thbs;

public class Consumer {
    private int customerId;
    private String customerName;
    private int unitConsumed;
    private int unitPrice;

    public Consumer(int customerId, String customerName, int unitConsumed, int unitPrice) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.unitConsumed = unitConsumed;
        this.unitPrice = unitPrice;
    }

    private   int calculateBill(){
        return (unitPrice*unitConsumed);

    }

    @Override
    public String toString() {
        return "Consumer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", unitConsumed=" + unitConsumed +
                ", unitPrice=" + unitPrice +
                ", billAmount="+unitConsumed*unitPrice+
                '}';
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
  

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getUnitConsumed() {
        return unitConsumed;
    }

    public void setUnitConsumed(int unitConsumed) {
        this.unitConsumed = unitConsumed;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}

//main

package com.thbs;


import java.util.Scanner;

public class Main  {

    public static void main(String[] args){

        // amt = no. of units consumed x unit price
        // electricity bill (no of units consumed
//        Consumer consumer=new Consumer(1,"Rohith",2000,10);
//        System.out.println("Bill Amount:"+consumer.toString());

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of consumers");
        int len = sc.nextInt();
        Consumer[] consumers =new Consumer[len];

        for (int i=0;i<len;i++){
            System.out.println("enter consumer "+(i+1)+" details");
            consumers[i]=new Consumer(sc.nextInt(), sc.nextLine()+sc.nextLine(), sc.nextInt(), sc.nextInt());
        }

        //for each loop
        for (Consumer c:consumers){
            System.out.println(c);
        }

        System.out.println(consumers);

    }
}



//Enter the number of consumers
// 2
// enter consumer 1 details
// 1
// rohith s
// 2000
// 10
// enter consumer 2 details
// 2
// amith g
// 1000
// 5
// Consumer{customerId=1, customerName='rohith s', unitConsumed=2000, unitPrice=10, billAmount=20000}
// Consumer{customerId=2, customerName='amith g', unitConsumed=1000, unitPrice=5, billAmount=5000}
// [Lcom.thbs.Consumer;@4783da3f

// Process finished with exit code 0
