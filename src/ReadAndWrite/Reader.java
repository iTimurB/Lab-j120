package ReadAndWrite;

import Base.Product;
import java.io.*;
import java.util.*;

public class Reader implements ConstImpl {

    private static final String FileNameProduct = "D:\\All\\!Project\\Lab-J120\\reassesment.csv";

    public void reader(List<Product> fullStack) {

        try (BufferedReader br = new BufferedReader(new FileReader(FileNameProduct))) {
            String line;
            Scanner scan;
            int count = 0;

            while ((line = br.readLine()) != null) {
                Product newProduct = new Product();
                scan = new Scanner(line);
                scan.useDelimiter(";");
                while (scan.hasNext()) {
                    String str = scan.next();
                    switch (count) {
                        case article:
                            newProduct.setArticle(Long.parseLong(str));
                            count++;
                            break;
                        case name:
                            newProduct.setName(str);
                            count++;
                            break;
                        case color:
                            newProduct.setColor(str);
                            count++;
                            break;
                        case cost:
                            newProduct.setCost(Double.parseDouble(str));
                            count++;
                            break;
                        case balance:
                            newProduct.setBalance(Integer.parseInt(str));
                            count++;
                            break;
                    }
                }
                count = 0;
                fullStack.add(newProduct);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fullStack);
    }

}
