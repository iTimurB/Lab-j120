package lab.j120;

import java.io.Serializable;
import java.time.LocalDate;

public class Order implements Serializable{

    private LocalDate orderDate;
    private Person person;
    private String statusOfOrder;
    private ListOfOrder listOfOrder;

    public Order(LocalDate orderDate, Person person, String statusOfOrder, ListOfOrder listOfOrder) {
        this.orderDate = orderDate;
        this.person = person;
        this.statusOfOrder = statusOfOrder;
        this.listOfOrder = listOfOrder;
    }

    public LocalDate getOrderDate() {
        this.orderDate = LocalDate.now();
        return orderDate;
    }

    public Person getPerson() {
        return person;
    }

    public String getStatusOfOrder() {
        
        return statusOfOrder;
    }

    public ListOfOrder getListOfOrder() {
        return listOfOrder;
    }

    @Override
    public String toString() {
        return "Order{" + "orderDate=" + orderDate + ", person=" + person + ", statusOfOrder=" + statusOfOrder + ", listOfOrder=" + listOfOrder + '}';
    }
    
    
}
