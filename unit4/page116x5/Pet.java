package page116x5;

public abstract class Pet {
    private String name;
    private int health;
    private int love;

    public abstract void print();

    public Pet(String name,int health){
        this.name = name;
        this.health = health;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}
