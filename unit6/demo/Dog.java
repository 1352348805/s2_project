package demo;

public class Dog {
    private String name;
    private String strain;

    public Dog(String name, String strain){
        this.name = name;
        this.strain = strain;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        strain = strain;
    }
}
