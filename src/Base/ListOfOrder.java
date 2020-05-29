package Base;

import java.io.Serializable;
import java.util.Objects;

public class ListOfOrder implements Serializable {

    private Product product;
    private Integer count;
    private Double summ;

    public ListOfOrder(Product product, Integer count) {
        this.product = product;
        this.count = count;
        this.summ = product.getCost();
    }

    public Product getProduct() {
        return product;
    }

    public Integer getCount() {
        return count;
    }

    public Double getSumm() {
        return summ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o.getClass() != getClass()) {
            return false;
        }
        if (o == null) {
            return false;
        }
        ListOfOrder loo = (ListOfOrder) o;
        return this.product.equals(loo.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    @Override
    public String toString() {
        return "ListOfOrder{" + "product = " + product + ", count = " + count + ", summ = " + summ + '}';
    }

}
