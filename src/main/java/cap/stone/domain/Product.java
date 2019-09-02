package cap.stone.domain;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * @Author: Megan McKinney
 */
@Entity
public class Product extends AbstractDomainClass {

    private String description;
    private BigDecimal price;
    private String productUrl;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

}
