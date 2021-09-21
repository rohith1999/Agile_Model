package com.thbs;

public class Book {
    //instance variables : they describe the object attributes
    int bookId;
    String bookName;
    int bookPrice;

    public Book(int bookId, String bookName, int bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
}

//main file
package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter details of the book");
//        int bookId = sc.nextInt();
//        String bookName = sc.next();
//        int bookPrice = sc.nextInt();
//        Book book = new Book(bookId,bookName,bookPrice);
//        System.out.println(book);
//
//        System.out.println("enter details of the book");
//        int bookId1 = sc.nextInt();
//        String bookName1 = sc.next();
//        int bookPrice1 = sc.nextInt();
//        Book book1 = new Book(bookId1,bookName1,bookPrice1);
//        System.out.println(book1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in book array");
        int len = sc.nextInt();
        Book bookArr[] = new Book[len];
        for (int i = 0; i < bookArr.length; i++) {
            System.out.println("book number" + (i + 1));
            System.out.println("enter book details");
            bookArr[i]=new Book(sc.nextInt(), sc.nextLine()+sc.nextLine(),sc.nextInt());

        }
        String str = new String("".toCharArray(),0,20);

        System.out.println(str);

        //display
        for (int i=0;i<len;i++){
            System.out.println(bookArr[i].toString());
        }
        //display
        for(Book b:bookArr) {
            System.out.println(b);
        }
        sc.close();


    }
}

