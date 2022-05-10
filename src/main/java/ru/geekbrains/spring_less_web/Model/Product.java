package ru.geekbrains.spring_less_web.Model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private int cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(String title, Long id, int cost) {
        this.title = title;
        this.id = id;
        this.cost = cost;
    }

    public Product() {}

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                '}';
    }
}
