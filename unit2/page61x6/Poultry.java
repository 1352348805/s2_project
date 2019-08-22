package page61x6;

public abstract class Poultry {

    private String name;
    private String foot;
    private String breed; //品种

    public void eat(){
        System.out.println("我喜欢吃" + foot);
    }

    public abstract void info();

    public abstract void habit(); //习性

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
