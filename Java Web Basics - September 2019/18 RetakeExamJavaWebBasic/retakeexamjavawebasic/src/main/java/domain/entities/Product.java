package domain.entities;

import domain.entities.enums.Category;
import domain.entities.enums.Sex;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
public class Product extends BaseEntity {

    private String name;
    private String description;
    private BigDecimal price;
    private Category category;
    private Sex sex;

    public Product() {
    }

    @Column(name = "name", nullable = false, unique = true)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "price", nullable = false)
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    public Sex getSex() {
        return this.sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
