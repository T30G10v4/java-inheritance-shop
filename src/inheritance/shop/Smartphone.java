package inheritance.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product {

    private int imei;
    private int ram;

    private BigDecimal discount = new BigDecimal("0.95");



    public Smartphone(String name, String descrizione, BigDecimal price, BigDecimal vat, int imei, int ram) {
        super(name, descrizione, price, vat);
        Random rnd = new Random();
        this.imei = rnd.nextInt(111111111, 999999999);
        this.ram = ram;
    }

    @Override
    public BigDecimal getDiscountPrice(boolean hasCard) {

        if(hasCard){
            if(ram<32) return getVatPrice().multiply(discount);
            else return super.getDiscountPrice(hasCard);
        }
        else return getPrice();


    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                ", ram=" + ram +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
