package AnimalShop;

public class Dog {
    private String brand;
    private String name;

    public Dog(String name,String brand){
        this.name = name;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
