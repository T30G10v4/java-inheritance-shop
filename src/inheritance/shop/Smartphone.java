package java.inheritance.shop;

public class Smartphone extends Product {

    private int imei;
    private int ram;

    public Smartphone(){

        super();


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
