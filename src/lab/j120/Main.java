package lab.j120;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Config config = Config.getInstance();         
                    
        Reader reader = new Reader();
        reader.reader();
        
        Copier Copier = new Copier();
        Copier.copyOrder();
        
        
        TreeMap <Integer, Integer> productList = new TreeMap<Integer, Integer>();
        
    }

}
