package inheritance.shop;

import java.math.BigDecimal;

public class Earphones extends Product {

    private String color;
    private boolean isWireless;

    private BigDecimal discount = new BigDecimal("0.93");



    public Earphones(String name, String descrizione, BigDecimal price, BigDecimal vat, String color, boolean isWireless) {
        super(name, descrizione, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    @Override
    public BigDecimal getDiscountPrice(boolean hasCard) {

        if(hasCard){
            if(!isWireless) return getVatPrice().multiply(discount);
            else return super.getDiscountPrice(hasCard);
        }
        else return getPrice();

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return "Earphones{" +
                "color='" + color + '\'' +
                ", isWireless=" + isWireless +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
