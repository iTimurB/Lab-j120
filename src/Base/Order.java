package Base;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

public class Order implements Serializable{

    private LocalDate orderDate;
    private Person person;
    private Short discount;
    private String statusOfOrder;
    private HashSet<Product> listProducts;

    public Order(LocalDate orderDate, Person person, Short discount, String statusOfOrder, ListOfOrder listOfOrder) {
        this.orderDate = orderDate;
        this.person = person;
        this.discount = discount;
        this.statusOfOrder = statusOfOrder;
        this.listProducts = listProducts;
    }

    public HashSet<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(HashSet<Product> listProducts) {
        this.listProducts = listProducts;
    }
    

    public LocalDate getOrderDate() {
        this.orderDate = LocalDate.now();
        return orderDate;
    }

    public Person getPerson() {
        return person;
    }

    public Short getDiscount() {
        return discount;
    }

    public void setDiscount(Short discount) {
        this.discount = discount;
    }

    public String getStatusOfOrder() {                    
        return statusOfOrder;
    }   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (!Objects.equals(this.statusOfOrder, other.statusOfOrder)) {
            return false;
        }
        if (!Objects.equals(this.orderDate, other.orderDate)) {
            return false;
        }
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }        
        return listProducts.equals(other.listProducts);
    }

     @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.orderDate);
        hash = 47 * hash + Objects.hashCode(this.person);
        hash = 47 * hash + Objects.hashCode(this.statusOfOrder);
        hash = 47 * hash + Objects.hashCode(this.listProducts);
        return hash;
    }
    
    @Override
    public String toString() {
        return "Order{" + "orderDate=" + orderDate + ", person=" + person + ", statusOfOrder=" + statusOfOrder + ", listProducts=" + listProducts + '}';
    }

   
    
    
    
}
