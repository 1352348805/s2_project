package CarRental;


public abstract class MotoVehicle {

    private String no;
    private String brand;

    public abstract int calRent(int days);

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
