package java.inheritance.shop;

public class Tv extends Product {
    private int inches;
    private boolean isSmart;

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
