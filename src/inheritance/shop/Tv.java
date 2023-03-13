package inheritance.shop;

import java.math.BigDecimal;

public class Tv extends Product {
    private int inches;
    private boolean isSmart;

    private BigDecimal discount = new BigDecimal("0.90");




    public Tv(String name, String descrizione, BigDecimal price, BigDecimal vat, int inches, boolean isSmart) {
        super(name, descrizione, price, vat);
        this.inches = inches;
        this.isSmart = isSmart;
    }

    @Override
    public BigDecimal getDiscountPrice(boolean hasCard) {
        if (hasCard){
            if(!isSmart)  return getVatPrice().multiply(discount);
            else return super.getDiscountPrice(hasCard);
        }
        else return getPrice();
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "inches=" + inches +
                ", isSmart=" + isSmart +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
