import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;


public abstract class Booking {
  protected String startDate;
  protected String endDate;
  protected int price;
  protected int groupSize;
  protected int userId;
  protected int id;

  public String getStartDate() {
    return startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public int getPrice() {
    return price;
  }

  public int getGroupSize() {
    return groupSize;
  }

  public int getUserId() {
    return userId;
  }

  public int getId() {
    return id;
  }

  @Override
  public boolean equals(Object otherBooking){
    if(!(otherBooking instance of Booking)){
      return false;
    }
    else{
      Booking newBooking = (Booking) otherBooking;
      return this.startDate.equals(newBooking.endDate) && this.endDate.equals(newBooking.endDate) && this.price == newBooking.price && this.userId == newBooking.userId;
    }
  }

}
