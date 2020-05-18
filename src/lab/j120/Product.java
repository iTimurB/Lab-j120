package lab.j120;

import java.io.Serializable;

public class Product implements Serializable{

    private Integer article;
    private String name;
    private String color;
    private Double cost;
    private Integer balance;

    public Product(Integer article, String name, String color, Double cost, Integer balance) {
        this.article = article;
        this.name = name;
        this.color = color;
        this.cost = cost;
        this.balance = balance;
    }            

    public Integer getArticle() {
        return article;
    }

    public void setArticle(Integer article) {
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
    public String toString() {
        return "Product{" + "article=" + article + ", name=" + name + ", color=" + color + ", cost=" + cost + ", balance=" + balance + '}';
    }

   
}
