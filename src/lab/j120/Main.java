package lab.j120;

import Base.*;
import Config.Config;
import ReadAndWrite.*;
import java.io.IOException;
import java.util.*;

public class Main {

    public static HashSet<ListOfOrder> list = new HashSet();
    public static TreeMap<Integer, Order> orderList = new TreeMap<>();
    public static List<Person> listOfPerson = new ArrayList();

    public static void main(String[] args) throws IOException {
        Config config = Config.getInstance();

        Reader reader = new Reader();
        List<Product> fullStack = new ArrayList<Product>();
        reader.reader(fullStack);

        Copier Copier = new Copier();
        Copier.copyOrder();

    }

}
