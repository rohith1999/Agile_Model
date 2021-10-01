import lombok.Data;
 @Data
 class Passenger {
    private String name;
    private int age;
    private char gender;

}

package modelpack;
public class Train
{
    private int trainNo;
    private String trainName;
    private String source;
    private String destination;
    private double ticketPrice;
    public Train(int trainNo, String trainName, String source, String destination, double ticketPrice) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNo=" + trainNo +
                ", trainName='" + trainName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}


//dao
import java.sql.*;
 
public class Train_DAO {
    public static Connection con = DBManager.getConnection();
 
    public static Train findTrain(int trainNum) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from trains where train_no =" + trainNum);
        rs.next();
        return new Train(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
    }
}
