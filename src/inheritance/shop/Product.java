package java.inheritance.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {

    private int code;
    private String name;
    private String description;
    BigDecimal price;
    BigDecimal vat;

    public Product(){

        Random rnd = new Random();
        code = rnd.nextInt(1,100000000);
        name ="";
        description = "";
        price = new BigDecimal("0.00");
        vat = new BigDecimal("0.00");

    }

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
