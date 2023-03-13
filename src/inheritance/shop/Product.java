package inheritance.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {

    protected int code;
    protected String name;
    protected String description;
    protected BigDecimal price;
    protected BigDecimal vat;

    protected BigDecimal discount = new BigDecimal("0.98");



    public Product(String name, String descrizione, BigDecimal price, BigDecimal vat) {
        Random rnd = new Random();
        code = rnd.nextInt(1,100000000);
        this.name = name;
        this.description = descrizione;
        this.price = price;
        this.vat = vat;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getVatPrice() {

        return price.add(price.multiply(vat));

    }

    public BigDecimal getDiscountPrice(boolean hasCard) {

        if (hasCard) return getVatPrice().multiply(discount);
        else return getPrice();

    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Code: "+code+" Name: "+name+"Price: "+getVatPrice().toString();
    }
}
