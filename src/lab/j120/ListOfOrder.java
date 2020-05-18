package lab.j120;

import java.io.Serializable;
import java.util.ArrayList;

public class ListOfOrder implements Serializable {

    private String product;
    private Integer count;
    private Double summ;

    public ListOfOrder(String product, Integer count, Double summ) {
        this.product = product;
        this.count = count;
        this.summ = summ;
    }

    public String getProduct() {
        return product;
    }

    public Integer getCount() {
        return count;
    }

    public Double getSumm() {
        ArrayList<Double> al1 = new ArrayList<Double>();

        al1.add(1.0);
        Double[] dl = new Double[al1.size()];
        dl = al1.toArray(dl);

        double summ = 0;

        for (double i : dl) {
            summ += i;             
        }
       return summ;
    }

    @Override
    public String toString() {
        return "ListOfOrder{" + "product=" + product + ", count=" + count + ", summ=" + summ + '}';
    }

}
