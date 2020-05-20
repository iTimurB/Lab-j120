package lab.j120;

import java.io.*;
import java.util.*;

public class Reader {

    private static final String FileNameProduct = "reassesment.csv";
    Object line;
    List<Product> fullStack = new ArrayList<Product>();

    public void reader() {

        Scanner scan = null;
        try (BufferedReader br = new BufferedReader(new FileReader(FileNameProduct))) {
            // try (InputStream input = new FileInputStream(FileNameProduct)) {
            //     scan = new Scanner(input);
            scan.useDelimiter(";");
            while ((line = br.readLine()) != null) {
                //  while (!scan.equals(null)) {
                Product newProduct = null;
//= new Product((Integer) obj, (String) obj1, (String) obj2, (Double) obj3, (Integer) obj4);
                Object obj = scan.next();
                Object obj1 = scan.next();
                Object obj2 = scan.next();
                Object obj3 = scan.next();
                Object obj4 = scan.next();

                newProduct.setArticle((Integer) obj);
                newProduct.setName((String) obj1);
                newProduct.setColor((String) obj2);
                newProduct.setCost((Double) obj3);
                newProduct.setBalance((Integer) obj4);

                fullStack.add(newProduct);
                scan.nextLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
