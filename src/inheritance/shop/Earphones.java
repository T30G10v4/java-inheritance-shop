package java.inheritance.shop;

public class Earphones extends Product {

    private String color;
    private boolean isWireless;

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
