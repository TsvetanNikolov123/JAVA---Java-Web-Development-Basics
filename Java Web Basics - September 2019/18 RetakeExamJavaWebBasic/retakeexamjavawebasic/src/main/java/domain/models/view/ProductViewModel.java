package domain.models.view;

import java.math.BigDecimal;

public class ProductViewModel {

    private String id;
    private String name;
    private BigDecimal price;
    private String category;
    private String sex;
    private String description;
    private String imageName; // todo -> do i need this

    public ProductViewModel() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageName() {
        this.imageName = this.getSex() + "-" + this.getCategory();
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
