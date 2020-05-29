package Base;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {

    private Long article;
    private String name;
    private String color;
    private Double cost;
    private Integer balance;

    public Product() {
    }

    public Product(Long article, String name, String color, Double cost, Integer balance) {
        this.article = article;
        this.name = name;
        this.color = color;
        this.cost = cost;
        this.balance = balance;
    }

    public Long getArticle() {
        return article;
    }

    public void setArticle(Long article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
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

        Product pr = (Product) o;
        return this.article.equals(pr.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(article);
    }

    @Override
    public String toString() {
        return "\n" + "article = " + article + ", name = " + name + ", color = " + color + ", cost = " + cost + ", balance = " + balance;
    }
}
