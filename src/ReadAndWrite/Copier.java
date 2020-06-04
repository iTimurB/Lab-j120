package ReadAndWrite;

import PersonsDate.ContactDate;
import PersonsDate.Person;
import Base.*;
import java.io.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Copier {

    private static final String FileNameOrder = "order.fno";
  
    public void copyOrder() {
        ContactDate contactDate = new ContactDate("NY", "5 avenue", 10, 25);
        Person person = new Person("Smith", "Adams", contactDate, 55552675);
        Product product = new Product();
        ListOfOrder listOfOrder = new ListOfOrder(product, Integer.SIZE);
        Order order = new Order(LocalDate.MAX, person, Short.MIN_VALUE, FileNameOrder, listOfOrder);
        
        saveOrder(order);
        Order newOrder = readOrder(FileNameOrder);
    }

    private void saveOrder(Order order) {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(FileNameOrder)))) {
            out.writeObject(order);
        }
        catch (IOException e) {
            Logger.getLogger(Copier.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private Order readOrder(String filename) {
        if (!filename.endsWith("*.fno")) {
            return null;
        }
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            return (Order) in.readObject();
        }
        catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Copier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
}
