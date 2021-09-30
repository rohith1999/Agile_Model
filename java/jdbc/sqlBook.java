package mainpack;

import bookop.BookOperationImpl;
import model.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookOperationImpl bookOperation = new BookOperationImpl();

        boolean exit = false;
        while (!exit) {
            System.out.println("operations allowed");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. List all books");
            System.out.println("4. Search a book");
            System.out.println("5. Set a price");
            System.out.println("6. Exit");
            System.out.println("Enter a number");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter the bookId: ");
                    int bookId = scanner.nextInt();
                    System.out.println("Enter name of the book: ");
                    String bookName = scanner.next();
                    System.out.println("Enter book price: ");
                    double price = scanner.nextDouble();
                    System.out.println(bookOperation.addBook(new Book(bookId, bookName, price)));
                    break;

                case 2:
                    System.out.println("Enter the bookId to be removed");
                    int bookIdRemove = scanner.nextInt();
                    // TODO: 9/29/2021  remove book
                    break;
                case 3:
                    for (Book b : bookOperation.getAllBooks()) {
                        System.out.println(b.toString());
                    }
                    break;
                case 4:
                    System.out.println("enter bookId");
                    int bookIdSearch = scanner.nextInt();
                    Book book = bookOperation.getABook(bookIdSearch);
                    if (book != null)
                        System.out.println(book);
                    else {
                        System.out.println("Book not found");
                    }
                    break;
                case 5:
                    System.out.println("Enter a book Id");
                    int bookIdUpdate = scanner.nextInt();
                    System.out.println("Enter price of the book");
                    double priceUpdate = scanner.nextDouble();
                    System.out.println(bookOperation.setBookPrice(bookIdUpdate, priceUpdate));

                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input!!");
            }


        }
        scanner.close();


    }
}


//book model


package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Book {
    private int bookId;
    private String bookName;
    @Setter
    private double bookPrice;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}



//dbmanager
package bookop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private  static  Connection connection;
    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdatabase",
                    "root","9845003308rR@");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}


//book operation 

package bookop;

import model.Book;

import java.util.ArrayList;

public interface BookOperations {
    String addBook(Book book);
    String deleteBook(Book book);
    ArrayList<Book> getAllBooks();
    Book getABook(int bookId);
    String setBookPrice(int bookId,double bookPrice);

}


//book operation implementation

package bookop;

import model.Book;

import java.sql.*;
import java.util.ArrayList;

public class BookOperationImpl implements BookOperations {

    private static Connection connection = null;

    @Override
    public String addBook(Book book) {

        PreparedStatement preparedStatement = null;
        connection = DBManager.getConnection();
        String statement = "insert into book values(?,?,?);";
        try {
            preparedStatement = connection.prepareStatement(statement);
            preparedStatement.setInt(1, book.getBookId());
            preparedStatement.setString(2, book.getBookName());
            preparedStatement.setDouble(3, book.getBookPrice());
            preparedStatement.executeUpdate();
            return "book inserted successfully";


        } catch (SQLException e) {
            //   e.printStackTrace();
            return "book insertion failed" + e.getMessage();
        }


    }

    @Override
    public String deleteBook(Book book) {
        return "book deleted successfully";
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> books = new ArrayList<>();

        try {
            connection = DBManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select *from book");
            while (resultSet.next()) {
                Book book = new Book(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getDouble(3));
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    @Override
    public Book getABook(int bookId) {

        //create connection
        connection = DBManager.getConnection();
        Book book = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from book where bookId="
                    + bookId + ";");
            while (resultSet.next()) {
                book = new Book(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getDouble(3));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return book;
    }

    @Override
    public String setBookPrice(int bookId, double bookPrice) {
        connection = DBManager.getConnection();
        String statement = "update book set bookPrice=? where bookId=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(statement);
            preparedStatement.setDouble(1, bookPrice);
            preparedStatement.setInt(2, bookId);
            preparedStatement.executeUpdate();

            return "book price updated successfully";
        } catch (SQLException e) {
            return "book price update failed"+e.getMessage();
        }


    }
}



